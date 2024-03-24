package Example.Enum;

public class ThoiKhoaBieu {
    //Attributes
    private Day thu;
    private String monHoc;

    //constructor
    public ThoiKhoaBieu(Day thu, String monHoc) {
        this.thu = thu;
        this.monHoc = monHoc;
    }

    //Getter And Setter
    public Day getThu() {
        return thu;
    }
    public void setThu(Day thu) {
        this.thu = thu;
    }
    public String getMonHoc() {
        return monHoc;
    }
    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    //toString

    @Override
    public String toString() {
        return this.thu + ": " + this.monHoc;
    }
}
