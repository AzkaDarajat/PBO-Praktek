public class variabel2 {    // Mendefinisikan kelas bernama 'variabel2'

    // Mendeklarasikan konstanta 'CM_PER_INCH' sebagai public static final,
    // artinya ini adalah konstanta yang dapat diakses secara global dan nilainya tidak dapat diubah
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {   // Mendefinisikan method utama (main) yang menjadi entry point program
        double paperWidth = 8.5;    // Mendeklarasikan variabel 'paperWidth' bertipe double dan menginisialisasinya dengan nilai 8.5 (lebar kertas dalam inci)
        double paperHeight = 11;    // Mendeklarasikan variabel 'paperHeight' bertipe double dan menginisialisasinya dengan nilai 11 (tinggi kertas dalam inci)

        // Menampilkan ukuran kertas dalam centimeter dengan mengalikan 'paperWidth' dan 'paperHeight' dengan 'CM_PER_INCH'
        System.out.println("Paper size in centimeters: " +
                paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        // Mencetak ukuran lebar dan tinggi kertas dalam centimeter
    }
}
