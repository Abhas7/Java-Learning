import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> que = new java.util.LinkedList<String>();

        que.offer("Apple");
        que.offer("Banana");
        que.offer("Cherry");

        System.out.println(que.peek()); // Fetch value but doesn't remove

        while (!que.isEmpty())
            System.out.println(que.poll()); // Fetch value and remove from queue

        // Implement Deque
        Deque<String> deque = new java.util.LinkedList<String>();

        deque.add("Alfa");
        deque.add("Beta");
        deque.add("Gamma");

        while (!deque.isEmpty())
            System.out.println(deque.pollLast());

    }
}       