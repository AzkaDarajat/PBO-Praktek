import java.util.Scanner;

public class soal4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan total barang yang terjual: ");
        int barangHabis = input.nextInt();

        /* Membuat variabel penampung dari class Agent dengan int Gaji(barangHabis) */
        int total = Agent.Gaji(barangHabis);

        System.out.println("Total gaji yang diterima adalah: " + total);

        input.close();;
    }

    /* Membuat class baru bernama gaji */
    static class Agent {
        private static final int upah = 500000;
        private static final int harga = 50000;

        /* Akan dipanggil di main dengan membuat penjumlahannya */
        public static int Gaji(int barangHabis) {
            int totalGaji = upah;

            if (barangHabis >= 80) {
                // Bonus 35% dari total penjualan jika menjual lebih dari 80 item
                totalGaji += barangHabis * harga * 0.35;
            } else if (barangHabis >= 40) {
                // Bonus 25% dari total penjualan jika menjual antara 40 dan 80 item
                totalGaji += barangHabis * harga * 0.25;
            } else if (barangHabis < 15) {
                // Denda 15% dari kekurangan penjualan untuk mencapai 15 item
                int defisit = 15 - barangHabis;
                totalGaji -= defisit * harga * 0.15;
            } else {
                // Bonus 10% dari total penjualan untuk 15 hingga 39 item
                totalGaji += barangHabis * harga * 0.10;
            }

            return totalGaji;
        }
    }
}
