package Example.CreateAndHowToUseClass.CreateClass;

public class MyDate {
    //Create attribute of MyDate Class
    private int day;
    private int month;
    private int year;

    //A constructor
    public MyDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    //Methods Print The Day, Month, Year and Date

    public void PrintDay(){
        System.out.println("Day: " + this.day);
    }

    public void PrintMonth(){
        System.out.println("Day: " + this.month);
    }

    public void PrintYear(){
        System.out.println("Day: " + this.year);
    }

    public void PrintDate(){
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }
}
