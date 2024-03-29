package Example.QueueAndDeque;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        java.util.Deque<String> danhSach = new ArrayDeque<String>();

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
