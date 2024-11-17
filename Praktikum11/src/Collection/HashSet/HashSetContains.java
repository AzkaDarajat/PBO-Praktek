package Collection.HashSet;

import java.util.HashSet;

public class HashSetContains {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("Indonesia");
        countries.add("Malaysia");

        if (countries.contains("Indonesia")) {
            System.out.println("Indonesia ada dalam HashSet.");
        }
    }
}


