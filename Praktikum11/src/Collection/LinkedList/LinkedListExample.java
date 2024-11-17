package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Kucing");
        animals.addFirst("Anjing");
        animals.addLast("Kelinci");

        System.out.println("LinkedList: " + animals);
    }
}



