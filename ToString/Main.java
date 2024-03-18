package Example.ToString;

public class Main {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(1,2,3);
        MyDate md2 = new MyDate(12,24,2030);
        MyDate md3 = new MyDate(30,12,2333);

        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);
    }
}
