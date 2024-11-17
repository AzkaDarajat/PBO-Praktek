package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Merah");
        colors.add("Hijau");
        colors.add("Biru");

        colors.set(1, "Kuning");
        System.out.println("ArrayList setelah pembaruan: " + colors);
    }
}

