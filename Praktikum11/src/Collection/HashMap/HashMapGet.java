package Collection.HashMap;

import java.util.HashMap;

public class HashMapGet {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Indonesia", "Jakarta");

        String capital = capitalCities.get("Indonesia");
        System.out.println("Ibukota Indonesia adalah " + capital);
    }
}



