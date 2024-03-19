package Example.ViDuQuanLyMayTinh;

public class NgaySanxuat {
    //Attributes
    private int day, month, year;

    //Constructor
    public NgaySanxuat(int day, int month, int year) {
        if (day >0 && day <= 31)
            this.day = day;
        else
            this.day = 1;
        if (month > 0 && month <= 12)
            this.month = month;
        else
            this.month = 1;
        if (year > 0)
            this.year = year;
        else
            this.year = 1;
    }

    //Getter And Setter
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if (day > 0 && day <= 31)
            this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if (month > 0 && month <= 12)
            this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > 0)
            this.year = year;
    }

    //toString

    @Override
    public String toString() {
        return "(" + day + "/" + month + "/" + year + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        NgaySanxuat other = (NgaySanxuat) obj;
        if (this.day != other.day)
            return false;
        if (this.month != other.month)
            return false;
        if (this.year != other.year)
            return false;
        return true;
    }
}
