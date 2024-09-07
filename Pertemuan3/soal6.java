import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menggunakan BigInteger karena skala integer yang besar
        System.out.println("Masukkan angka pertama dan kedua(untuk ditambah dan dikalikan): ");
        BigInteger pertama = scanner.nextBigInteger();
        BigInteger kedua = scanner.nextBigInteger();

        // Perhitungan menggunakan library math yaitu add (+) dan multiply(*)
        BigInteger hasilJumlah = pertama.add(kedua);
        BigInteger hasilKali = pertama.multiply(kedua);

        System.out.println(hasilJumlah);
        System.out.println(hasilKali);
    }
}


