package Example.ViDuQuanLySach;

import com.sun.source.tree.UsesTree;

public class Ngay {
    //Attributes
    private int day;
    private int month;
    private int year;

    //The Constructor
    public Ngay(int d, int m, int y){
        if (d > 0 && d <= 31)
            this.day = d;
        else
            this.day = 1;

        if (d > 0 && d <= 31)
            this.month = m;
        else
            this.month = 1;

        if (d > 0 && d <= 31)
            this.year = y;
        else
            this.year = 1;
    }

    //Setter methods
    public void setDay(int d){
        if (d > 0 && d <= 31)
            this.day = d;
    }
    public void setMonth(int m){
        if (m > 0 && m <= 12)
            this.month = m;
    }
    public void setYear(int year) {
        if (year > 0)
            this.year = year;
    }

    //Getter method
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //toString method
    @Override
    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
