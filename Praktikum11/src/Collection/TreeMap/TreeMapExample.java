package Collection.TreeMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("ID", "Indonesia");
        countries.put("MY", "Malaysia");

        System.out.println("TreeMap (terurut): " + countries);
    }
}



