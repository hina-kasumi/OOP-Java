package Example.QueueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class piorityQueue {
    public static void main(String[] args) {
        Deque<String> danhSach = new ArrayDeque<String>();

        danhSach.offer("hieu1");
        danhSach.offer("Hina A");
        danhSach.offer("Hina B");
        danhSach.offer("hieu2");

        danhSach.offerLast("Hina 1");
        danhSach.offerFirst("Hina 3");


        while (!danhSach.isEmpty()) {
            System.out.println(danhSach.poll());
        }
    }
}
