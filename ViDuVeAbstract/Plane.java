package Example.ViDuVeAbstract;

public class Plane extends PhuongTiendiChuyen {
    //Attribute
    private String loaiNhienLieu;

    //Constructor
    public Plane(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Plane", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    //Getter And Setter
    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }
    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    //Method
    public void CatCanh(){
        System.out.println("Cat canh");
    }

    public void HaCanh(){
        System.out.println("Ha canh");
    }

    @Override
    public double vanToc(){
        return 500;
    }
}
