public class operators1 {    // Mendefinisikan kelas bernama 'operators1'

    // Mendefinisikan method static 'methodOne' yang menerima parameter bertipe long dan mengembalikan nilai short
    static short methodOne(long l) {
        int i = (int) l;   // Meng-cast nilai 'l' yang bertipe long ke tipe int dan menyimpannya dalam variabel 'i'
        return (short) i;  // Meng-cast nilai 'i' yang bertipe int ke tipe short dan mengembalikannya
    }

    public static void main(String[] args) {    // Mendefinisikan method utama (main) yang menjadi entry point program
        double d = 10.25;   // Menginisialisasi variabel 'd' dengan nilai tipe double 10.25
        float f = (float) d;    // Meng-cast nilai 'd' dari tipe double ke tipe float dan menyimpannya dalam 'f'
        byte b = (byte) methodOne((long) f);    // Memanggil method 'methodOne' dengan meng-cast 'f' ke long,
        // hasilnya di-cast ke byte dan disimpan dalam variabel 'b'
        System.out.println(b);  // Menampilkan nilai 'b' ke console
    }
}