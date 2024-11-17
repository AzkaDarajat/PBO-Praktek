package Collection.TreeSet;

import java.util.TreeSet;

public class TreeSetFirstLast {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Elemen pertama: " + numbers.first());
        System.out.println("Elemen terakhir: " + numbers.last());
    }
}

