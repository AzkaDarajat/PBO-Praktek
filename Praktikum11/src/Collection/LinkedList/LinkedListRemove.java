package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Kucing");
        animals.add("Anjing");
        animals.add("Kelinci");

        animals.remove("Kucing");
        System.out.println("LinkedList setelah penghapusan: " + animals);
    }
}


