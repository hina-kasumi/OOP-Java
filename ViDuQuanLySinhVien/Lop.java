package Example.ViDuQuanLySinhVien;

public class Lop {
    //Attributes
    private String lopName, khoaName;

    //Constructor
    public Lop(String lopName, String khoaName) {
        this.lopName = lopName;
        this.khoaName = khoaName;
    }

    //Getter And Setter
    public String getLopName() {
        return lopName;
    }
    public void setLopName(String lopName) {
        this.lopName = lopName;
    }

    public String getKhoaName() {
        return khoaName;
    }
    public void setKhoaName(String khoaName) {
        this.khoaName = khoaName;
    }
}
