package Example.CreateAndHowToUseClass.CreateClass;

public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(25, 2, 2020);
        md.PrintDay();
        md.PrintMonth();
        md.PrintYear();
        md.PrintDate();
    }
}
