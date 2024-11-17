package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Merah");
        colors.add("Hijau");
        colors.add("Biru");

        System.out.println("Warna dalam ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}



