package Collection.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueuePoll {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);

        System.out.println("Elemen prioritas tertinggi: " + queue.poll());
        System.out.println("PriorityQueue setelah penghapusan elemen prioritas tertinggi: " + queue);
    }
}



