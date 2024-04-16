package Example.Generic;

import java.util.Objects;

public class Main1 {
    public static void main(String[] args) {
        Box1 box = new Box1( 10);
        System.out.println(box.getObj());

        Box1 box1 = new Box1((int) 10.5); // phải gán thành kiểu dữ liệu ỉnt
        System.out.println(box1.getObj());

        //Box1 box2 = new Box1(("mười"); báo lỗi
    }

}
