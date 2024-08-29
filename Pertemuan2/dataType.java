import java.math.BigInteger;
import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        String input = scanner.nextLine();

        try {
            long num = Long.parseLong(input);

            if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                System.out.println("Tipe data: byte");
            } else if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                System.out.println("Tipe data: short");
            } else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                System.out.println("Tipe data: int");
            } else if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                System.out.println("Tipe data: long");
            }
        } catch (NumberFormatException e) {
            try {
                new BigInteger(input);
                System.out.println("Tipe data: BigInteger");
            } catch (NumberFormatException ex) {
                System.out.println("Bukan angka yang valid");
            }
        }
    }
}
