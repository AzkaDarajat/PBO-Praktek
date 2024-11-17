import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiOrder extends JFrame {
    private JPanel dataCust, dataMenu;
    private JCheckBox steak, sphagetti, pizza;
    private JLabel namaLabel, alamatLabel, telpLabel;
    private JTextField namaField, alamatField, telpField;
    private JButton tambah;
    private JTextArea order;
    private JScrollPane orderScroll;

    public AplikasiOrder() {
        setTitle("Aplikasi Pemesanan Makanan");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // supaya ditengah
        setLocationRelativeTo(null);

        dataCust = new JPanel();
        dataMenu = new JPanel();

        dataCust.setLayout(new GridLayout(3, 2, 3, 3));
        namaLabel = new JLabel("Nama");
        alamatLabel = new JLabel("Alamat");
        telpLabel = new JLabel("No Telp");
        namaField = new JTextField();
        alamatField = new JTextField();
        telpField = new JTextField();

        dataCust.add(namaLabel);
        dataCust.add(namaField);
        dataCust.add(alamatLabel);
        dataCust.add(alamatField);
        dataCust.add(telpLabel);
        dataCust.add(telpField);

        dataMenu.setLayout(new GridLayout(4, 1, 5, 5));
        steak = new JCheckBox("Steak");
        sphagetti = new JCheckBox("Sphagetti");
        pizza = new JCheckBox("Pizza");
        dataMenu.add(steak);
        dataMenu.add(sphagetti);
        dataMenu.add(pizza);

        JLabel totalBayarField = new JLabel("TOTAL BAYAR");
        JLabel totalBayar = new JLabel("Rp. ");

        tambah = new JButton("TAMBAH");
        order = new JTextArea();
        order.setEditable(false);
        orderScroll = new JScrollPane(order);

        // Action listener for the button
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder orderDetails = new StringBuilder();
                int total = 0;

                // Collect order data
                orderDetails.append("Nama: ").append(namaField.getText()).append("\n");
                orderDetails.append("Alamat: ").append(alamatField.getText()).append("\n");
                orderDetails.append("Telp: ").append(telpField.getText()).append("\n");
                orderDetails.append("Pesanan: \n");

                if (steak.isSelected()) {
                    orderDetails.append("- Steak (50000)\n");
                    total += 50000;
                }
                if (sphagetti.isSelected()) {
                    orderDetails.append("- Spaghetti (40000)\n");
                    total += 40000;
                }
                if (pizza.isSelected()) {
                    orderDetails.append("- Pizza (80000)\n");
                    total += 80000;
                }

                orderDetails.append("Total Bayar: Rp. " + total);

                // Display order
                order.setText(orderDetails.toString());
            }
        });

        // Set layout for the frame
        setLayout(new BorderLayout());

        // Add components to the frame
        add(dataCust, BorderLayout.NORTH);
        add(dataMenu, BorderLayout.CENTER);
        add(tambah, BorderLayout.SOUTH);
        add(orderScroll, BorderLayout.EAST);

        // Show the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new AplikasiOrder();
    }
}
