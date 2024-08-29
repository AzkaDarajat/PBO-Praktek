import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        /*Bagian untuk input user buat kedua kata*/
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata : ");
        String awal = input.nextLine();
        System.out.print("Masukkan kata kedua : ");
        String akhir = input.nextLine();

        /* Bagian untuk uppercase huruf awal di kedua kata*/
        String first = awal.substring(0, 1).toUpperCase() + awal.substring(1);
        String last = akhir.substring(0, 1).toUpperCase() + akhir.substring(1);

        /* Bagian untuk menghitung jumlah character dengan menggabungkan kedua kata */
        String kata = awal + akhir;
        int hitung = kata.length();
        System.out.printf("%d", hitung);

        System.out.println(" ");

        /* Bagian untuk membandingkan kedua kata dari huruf awal*/
        if (first.compareTo(last) < 0) {
            System.out.println("No");
        } else if (first.compareTo(last) > 0) {
            System.out.println("Yes");
        }

        System.out.printf(first + " " +  last);

    }
}
