package Example.ToString;

public class MyDate {
    //Attributes
    private int day;
    private int month;
    private int year;

    //the Constructor
    public MyDate(int d, int m, int y){
        if (d >= 1 && d<=31)
            this.day = d;
        else
            this.day = 1;

        if (m>0 && m<=12)
            this.month = m;
        else
            this.month = 1;

        if (y>0)
            this.year = y;
        else
            this.year = 1;
    }


    //Method Get
    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    // ToString Method
    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }

    //Set methods

    public void setDay(int d){
        if (d >= 1 && d<=31){
            this.day = d;
        }
    }

    public void setMonth(int m){
        if (m>0 && m <= 12){
            this.month = m;
        }
    }

    public void setYear(int y){
        if (y > 0){
            this.year = y;
        }
    }



}
