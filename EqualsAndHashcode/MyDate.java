package Example.EqualsAndHashcode;

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

    //Equals
    //lớp object là đại diện cho các cái đối tượng
    @Override
    public boolean equals(Object obj){
        //nếu đối tượng đang đứng mà là đối tượng được truyền vào không (bằng kiểm tra vị trí của 2 objects)
        if (this == obj)
            return true;

        //nếu đối tượng truyền vào không có dữ liệu thì return về false luôn
        if (obj == null)
            return false;

        //kiểm tra xem class này và class được truyền và có giống nhau không.
        if (this.getClass() != obj.getClass())
            return false;
        //đi so sánh từng đối tượng một
        MyDate other = (MyDate) obj;
        if (this.day != other.day)
            return false;
        if (this.month != other.month)
            return false;
        if (this.year != other.year)
            return false;
        return true;
    }


    //hàm tạo mã hashcode
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result;
    }
}
