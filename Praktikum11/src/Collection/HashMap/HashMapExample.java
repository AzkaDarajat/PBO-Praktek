package Collection.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Indonesia", "Jakarta");
        capitalCities.put("Malaysia", "Kuala Lumpur");

        System.out.println("Ibukota negara: " + capitalCities);
    }
}

