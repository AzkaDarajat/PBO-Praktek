package Collection.TreeMap;

import java.util.TreeMap;

public class TreeMapFirstLastKey {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("ID", "Indonesia");
        countries.put("MY", "Malaysia");

        System.out.println("Kunci pertama: " + countries.firstKey());
        System.out.println("Kunci terakhir: " + countries.lastKey());
    }
}
