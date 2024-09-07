import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input plat nomor mobil
        System.out.println("Masukkan plat nomor 4 mobil: ");
        String platNomor = scanner.nextLine();

        // Menghilangkan spasi dari input dan menggabungkan menjadi satu string
        String[] pisahPlat = platNomor.split(" ");
        String gabunganAngkaString = String.join("", pisahPlat);

        // Mengubah gabungan angka yang awalnya String menjadi Long
        long gabungAngka = Long.parseLong(gabunganAngkaString);

        // Menghitung selisih dan memeriksa kondisi sesuai ketentuan
        long selisih = (gabungAngka - 999999) % 5;
        if (selisih == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
        scanner.close();
    }
}


