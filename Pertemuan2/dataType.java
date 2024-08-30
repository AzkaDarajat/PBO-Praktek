import java.math.BigInteger;  // Mengimpor kelas BigInteger dari package java.math untuk menangani angka yang sangat besar
import java.util.Scanner;    // Mengimpor kelas Scanner dari package java.util untuk membaca input dari pengguna

public class dataType {      // Mendefinisikan kelas bernama dataType
    /* Inisialisasi scanner juga untuk memberikan output berupa perintah untuk user input angka */
    public static void main(String[] args) {    // Mendefinisikan method utama (main) yang menjadi entry point program
        Scanner scanner = new Scanner(System.in);    // Membuat objek Scanner untuk membaca input dari console
        System.out.print("Masukkan angka: ");        // Menampilkan pesan ke pengguna untuk memasukkan angka
        String input = scanner.nextLine();           // Membaca input dari pengguna sebagai string

        /* Program utama yang berfungsi untuk menentukan sebuah angka bertipe apa. */
        try {                                        // Memulai blok try untuk mencoba parsing input
            long num = Long.parseLong(input);        // Menrubah input user dari string menjadi long

            // Memeriksa apakah nilai num dapat ditampung dalam tipe byte
            if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                System.out.println(num + " can be fitted in: byte, short, integer, and long");  // Jika iya, cetak pesan
            }
            // Memeriksa apakah nilai num dapat ditampung dalam tipe short
            else if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                System.out.printf(num + " can be fitted in: short, integer, and long");  // Jika iya, cetak pesan
            }
            // Memeriksa apakah nilai num dapat ditampung dalam tipe integer
            else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                System.out.println(num + " can be fitted in: integer and long");  // Jika iya, cetak pesan
            }
            // Memeriksa apakah nilai num dapat ditampung dalam tipe long
            else if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                System.out.println(num + " can be fitted in: long");   // Jika iya, cetak pesan
            }
        } catch (NumberFormatException e) {    // Jika parsing pada kondisi diatas gagal, eksekusi blok ini
            try {                              // Memulai blok try lain untuk mencoba parsing ke BigInteger
                new BigInteger(input);         // Mencoba mengubah input dari string menjadi BigInteger
                System.out.println(input + " can be fitted in: BigInteger");   // Jika berhasil, cetak pesan
            } catch (NumberFormatException ex) {    // Jika parsing ke BigInteger gagal, eksekusi blok ini
                System.out.println(input + " Bukan angka yang valid");  // Jika input bukan angka valid, cetak pesan
            }
        }
    }
}
