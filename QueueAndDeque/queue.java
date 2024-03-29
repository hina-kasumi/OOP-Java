package Example.QueueAndDeque;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> danhSach = new LinkedList<String>();

        danhSach.offer("hieu1");
        danhSach.offer("Hina A");
        danhSach.offer("Hina B");
        danhSach.offer("hieu2");

        while (!danhSach.isEmpty()){
            System.out.println(danhSach.poll());
        }
    }
}
