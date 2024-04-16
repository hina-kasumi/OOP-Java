package Example.Generic;

public class Main2 {
    public static void main(String[] args) {
        Box2<Integer> box = new Box2<Integer>( 10);
        System.out.println(box.getObj());

        Box2<Double> box1 = new Box2<Double>(10.5);
        System.out.println(box1.getObj());

        Box2<String> box2 = new Box2<String>("mười");
        System.out.println(box2.getObj());
    }
}
