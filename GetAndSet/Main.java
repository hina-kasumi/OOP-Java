package Example.GetAndSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhap ngay ban muon in ra: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println("ngay ban vua nhap la:");
        MyDate date = new MyDate(day, month, year);

        System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        System.out.println("nhap mot ngay moi:");

        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);

        System.out.println("ngay ban vua nhap la:");
        System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

    }
}
