import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Masukkan string: ");

        // Membaca 3 garis di input
        for (int i = 0; i < 3; i++) {
            // Membaca string dan integer dari input
            String input = scanner.next();
            int angka = scanner.nextInt();

            /* Pada line ini saya menggunakan referensi dari ChatGPT dimana @-15s berfungsi untuk membaca String
             dan 15 berfungsi untuk memberikan spasi sebanyak 15x (dari awal) untuk memisahkan
            dengan angka yang sudah ditambah dengan 0 di depannya. */

            /* dan untuk integernya menggunakan 3 agar sesuai dengan perintah yaitu jika kurang dari 3 maka akan
             ditambah dengan angka 0 didepannya.
             */
            System.out.printf("%-15s%03d%n", input, angka);
            System.out.println("================================");
        }
        scanner.close();
    }
}