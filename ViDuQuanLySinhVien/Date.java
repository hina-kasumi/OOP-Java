package Example.ViDuQuanLySinhVien;

import Example.EqualsAndHashcode.MyDate;

import java.util.Objects;

public class Date {
    //Attributes
    private int day;
    private int month;
    private int year;

    //The Constructor
    public Date(int d, int m, int y){
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

    @Override
    public boolean equals(Object other) {
        //kiểm tra có phải đang chiếu cùng một tham chiếu không
        if (this == other)
            return true;
        //kiểm tra xem object có rỗng không
        if (other == null)
            return false;
        //kiểm tra có phải là cùng một class hay không
        if (this.getClass() != other.getClass())
            return false;

        //liểm tra từng phần tử
        Date obj = (Date) other;
        if (this.day != obj.day)
            return false;
        if (this.month != obj.month)
            return false;
        if (this.year != obj.year)
            return false;
        return true;
    }
}
