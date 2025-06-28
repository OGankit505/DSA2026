package Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(3);
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(4);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
