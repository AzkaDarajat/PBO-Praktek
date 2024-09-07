import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Operasi: ");
        String angka = input.nextLine();

        String[] bagian = angka.split(" ");

        if (bagian.length == 3) {
            try {
                // Mengonversi dan menyimpan input ke variabel
                double angka1 = Double.parseDouble(bagian[0]);
                String operator = bagian[1];
                double angka2 = Double.parseDouble(bagian[2]);

                // Membuat objek operasi dan melakukan perhitungan
                Operasi operasi = new Operasi(angka1, angka2, operator);
                double hasil = operasi.perhitungan();

                // Menampilkan hasil
                System.out.println("Hasil: " + hasil);
            } catch (NumberFormatException e) {
                System.out.println("Error: Format angka tidak valid!");
            }
        } else {
            System.out.println("Input tidak valid!");
        }

        input.close();
    }
    static class Operasi {
        public double angka1, angka2;
        private String operator;

        public Operasi (double angka1, double angka2, String operator) {
            this.angka1 = angka1;
            this.angka2 = angka2;
            this.operator = operator;
        }

        public double perhitungan() {
            switch (operator) {
                /* Case untuk operator dengan return yang sudah disesuaikan dengan tiap operaotr */
                case "+":
                    return angka1 + angka2;
                case "-":
                    return angka1 - angka2;
                case "*":
                    return angka1 * angka2;
                case "/":
                    if (angka2 != 0) {
                        return angka1 / angka2;
                    } else {
                        /* Kondisi jika angka kedua 0 karena pembagian akan tidak terdifinisi! */
                        System.out.println("Angka kedua tidak boleh 0! tidak terdefinisi!");
                        return Double.NaN;
                    }
                case "%":
                    return angka1 % angka2;
                default:
                    System.out.println("Masukkan operator antara +, -, *, /, %");
                    return Double.NaN;
            }
        }
    }
}