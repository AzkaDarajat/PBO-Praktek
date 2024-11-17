package Collection.HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Indonesia"); // Duplicate, tidak akan ditambahkan

        System.out.println("Negara dalam HashSet: " + countries);
    }
}




