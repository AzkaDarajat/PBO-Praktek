package Collection.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Angka dalam TreeSet (terurut): " + numbers);
    }
}

