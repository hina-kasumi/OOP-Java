package Example.KeThua;

public class Main {
    public static void main(String[] args) {
        System.out.println("con nguooi ");
        ConNguoi people = new ConNguoi("hieu", 18);
        people.eat();
        people.drink();
        people.sleep();

        System.out.println("\nhoc sinh");
        HocSinh student = new HocSinh("hina", 17, "maho academy");
        student.eat();
        student.drink();
        student.sleep();
        student.Study();
    }
}
