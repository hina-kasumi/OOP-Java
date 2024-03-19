package Example.EqualsAndHashcode;

public class Main {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(1,2,3);
        MyDate md2 = new MyDate(12,24,2030);
        MyDate md3 = new MyDate(1,2,3);

        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);

        //kiểm tra ngày 1 và ngày 2 có phải là một ngày không
        if (md1.equals(md2))
            System.out.println("Date 1 = Date 2");
        else
            System.out.println("Date 1 != Date 2");

        //kiểm tra ngày 1 và ngày 3 có phải là cùng một ngày không
        if (md1.equals(md3))
            System.out.println("Date 1 = Date 3");
        else
            System.out.println("Date 1 != Date 3");

        //in ra mã hashcode của đối tượng
        System.out.println("hashcode md1 = " + md1.hashCode());
        System.out.println("hashcode md2 = " + md2.hashCode());
        System.out.println("hashcode md3 = " + md3.hashCode());
    }
}
