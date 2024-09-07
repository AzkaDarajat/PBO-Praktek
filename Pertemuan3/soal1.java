import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan string: ");

        // Membaca input string dari user
        String s = scanner.nextLine();
        scanner.close();

        // Memisahkan string diluar dari alfabet
        String[] hasil = s.split("[^A-Za-z]+");
        // Jadi untuk soal sudah include semua akan dipisahkan oleh kondisi ini

        // Menghitung jumlah kata yang sudah dipisahkan
        int jumlahKata = 0;
        for (String awal : hasil) {
            if (!awal.isEmpty()) {
                jumlahKata++;
            }
        }
        // Cetak jumlah total kata
        System.out.println(jumlahKata);

        // Dilakukan cek terlebih dahulu apakah input kosong (antisipasi) setelah itu akan print hasilnya
        for (String awal : hasil) {
            if (!awal.isEmpty()) {
                System.out.println(awal);
            }
        }
    }
}
