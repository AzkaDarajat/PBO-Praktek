import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DesainAplikasiOrderr {
    // Elemen GUI
    private JTextField aplikasiPemesananTextField;
    private JTextField namaTextField;
    private JTextField alamatTextField;
    private JTextField telpTextField;
    private JTextField totalBayarTextField;
    private JButton tambahButton;
    private JButton simpanButton;
    private JCheckBox steakCheckBox;
    private JCheckBox sphagettiCheckBox;
    private JCheckBox pizzaCheckBox;
    private JTable dataPenjualanTable;
    private DefaultTableModel tableModel;
    private JTextField hargaTextField;


    public DesainAplikasiOrderr() {
        // Frame Utama
        JFrame frame = new JFrame("Aplikasi Pemesanan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout());

        // Panel untuk judul
        JPanel panelJudul = new JPanel();
        JLabel lblJudul = new JLabel("Aplikasi Pemesanan");
        lblJudul.setFont(new Font("Arial", Font.BOLD, 16));
        panelJudul.add(lblJudul);
        frame.add(panelJudul, BorderLayout.NORTH);

        // Panel utama untuk data dan menu
        JPanel mainPanel = new JPanel(new GridLayout(2, 1));
        frame.add(mainPanel, BorderLayout.CENTER);

        // Panel Data Customer dan Menu
        JPanel dataPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.add(dataPanel);

        // Panel Data Customer
        JPanel panelCustomer = new JPanel(new GridLayout(4, 2));
        panelCustomer.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        dataPanel.add(panelCustomer);

        panelCustomer.add(new JLabel("Nama:"));
        namaTextField = new JTextField();
        panelCustomer.add(namaTextField);

        panelCustomer.add(new JLabel("Alamat:"));
        alamatTextField = new JTextField();
        panelCustomer.add(alamatTextField);

        panelCustomer.add(new JLabel("No Telp:"));
        telpTextField = new JTextField();
        panelCustomer.add(telpTextField);

        // Panel Pilih Menu
        JPanel panelMenu = new JPanel(new GridLayout(7, 1));
        panelMenu.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));
        dataPanel.add(panelMenu);

        steakCheckBox = new JCheckBox("Steak - Rp 50.000");
        sphagettiCheckBox = new JCheckBox("Spaghetti - Rp 40.000");
        pizzaCheckBox = new JCheckBox("Pizza - Rp 60.000");
        panelMenu.add(steakCheckBox);
        panelMenu.add(sphagettiCheckBox);
        panelMenu.add(pizzaCheckBox);

        panelMenu.add(new JLabel("Total Bayar:"));
        totalBayarTextField = new JTextField();
        totalBayarTextField.setEditable(false);
        panelMenu.add(totalBayarTextField);

        tambahButton = new JButton("Tambah");
        panelMenu.add(tambahButton);

        simpanButton = new JButton("Simpan Transaksi");
        simpanButton.setVisible(false); // Awalnya tombol disembunyikan
        panelMenu.add(simpanButton);

        // Panel Data Penjualan
        JPanel panelPenjualan = new JPanel(new BorderLayout());
        panelPenjualan.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));
        mainPanel.add(panelPenjualan);

        // Tabel untuk data penjualan
        String[] columnNames = {"Nama", "Alamat", "No Telp", "Pesanan", "Total Bayar"};
        tableModel = new DefaultTableModel(columnNames, 0);
        dataPenjualanTable = new JTable(tableModel);
        dataPenjualanTable.setBackground(new Color(143, 171, 243)); // Warna biru
        JScrollPane scrollPane = new JScrollPane(dataPenjualanTable);
        panelPenjualan.add(scrollPane);

        // Button tambahD
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validasi input
                if (namaTextField.getText().isEmpty() || alamatTextField.getText().isEmpty() || telpTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Mohon lengkapi data customer!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Hitung total
                int total = 0;
                StringBuilder pesanan = new StringBuilder();
                if (steakCheckBox.isSelected()) {
                    total += 500000;
                    pesanan.append("Steak, ");
                }
                if (sphagettiCheckBox.isSelected()) {
                    total += 400000;
                    pesanan.append("Spaghetti, ");
                }
                if (pizzaCheckBox.isSelected()) {
                    total += 600000;
                    pesanan.append("Pizza, ");
                }

                // Tambahkan ke tabel
                Object[] rowData = {
                        namaTextField.getText(),
                        alamatTextField.getText(),
                        telpTextField.getText(),
                        pesanan.toString(),
                        "Rp " + total
                };
                tableModel.addRow(rowData);

                // Tampilkan tombol Simpan jika ada data di tabel
                if (tableModel.getRowCount() > 0) {
                    simpanButton.setVisible(true);
                }

                // Reset form
                namaTextField.setText("");
                alamatTextField.setText("");
                telpTextField.setText("");
                totalBayarTextField.setText("");
                steakCheckBox.setSelected(false);
                sphagettiCheckBox.setSelected(false);
                pizzaCheckBox.setSelected(false);
            }
        });

        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("transaksi.txt"))) {
                    // Header laporan
                    writer.write("==========================================");
                    writer.newLine();
                    writer.write("               LAPORAN TRANSAKSI          ");
                    writer.newLine();
                    writer.write("==========================================");
                    writer.newLine();
                    writer.newLine();

                    // Informasi setiap transaksi
                    for (int i = 0; i < tableModel.getRowCount(); i++) {
                        String nama = tableModel.getValueAt(i, 0).toString();
                        String alamat = tableModel.getValueAt(i, 1).toString();
                        String telp = tableModel.getValueAt(i, 2).toString();
                        String pesanan = tableModel.getValueAt(i, 3).toString();
                        String total = tableModel.getValueAt(i, 4).toString();

                        writer.write("Nama      : " + nama);
                        writer.newLine();
                        writer.write("Alamat    : " + alamat);
                        writer.newLine();
                        writer.write("No Telp   : " + telp);
                        writer.newLine();
                        writer.write("Pesanan   : " + pesanan);
                        writer.newLine();
                        writer.write("Total     : " + total);
                        writer.newLine();
                        writer.write("------------------------------------------");
                        writer.newLine();
                    }

                    // Footer laporan
                    writer.newLine();
                    writer.write("==========================================");
                    writer.newLine();
                    writer.write("       TERIMA KASIH TELAH BERTRANSAKSI    ");
                    writer.newLine();
                    writer.write("==========================================");

                    JOptionPane.showMessageDialog(frame, "Transaksi berhasil disimpan ke transaksi.txt", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Gagal menyimpan transaksi: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        // Menempatkan frame di tengah layar
        frame.setLocationRelativeTo(null);

        // Tampilkan frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DesainAplikasiOrderr::new);
    }
}
