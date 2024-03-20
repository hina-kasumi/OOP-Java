package Example.ViDuVeAbstract;

public abstract class PhuongTiendiChuyen {
    //Attributes
    private String loaiPhuongTien;
    private HangSanXuat hangSanXuat;

    //Constructor
    public PhuongTiendiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    //Getter And Setter
    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }
    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }
    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    //Method

    public abstract double vanToc();

    //1, lấy tên sản xuất
    public void layTenSanXuat(){
        System.out.println(this.hangSanXuat.getName());
    }

    //2,bắt đầy, tăng tốc, dừng lại.
    public void working(){
        System.out.println("bat dau -> tang toc -> dung lai");
    }

    //3, lấy vận tốc.

}
