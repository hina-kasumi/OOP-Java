package Example.ViDuVeAbstract;

public class Car extends PhuongTiendiChuyen {
    //Attribute
    private String loaiNhienLieu;

    //Constructor
    public Car(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Car", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    //Getter And Setter
    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }
    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double vanToc(){
        return 100;
    }
}
