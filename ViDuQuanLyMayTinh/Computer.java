package Example.ViDuQuanLyMayTinh;

import Example.ViDuQuanLyPhim.Ngay;

public class Computer {
    //máy tính: Hãng sản xuất, ngày sản xuất, giá bán, thời gian bảo hành theo tháng
    //Attributes
    private HangSanXuat hangSanXuat;
    private NgaySanxuat ngaySanxuat;
    private double price;
    private int thoiGianBaoHanh;

    //Constructor
    public Computer(HangSanXuat hangSanXuat, NgaySanxuat ngaySanxuat, double price, int thoiGianBaoHanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanxuat = ngaySanxuat;
        this.price = price;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    //Getter And Setter

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public NgaySanxuat getNgaySanxuat() {
        return ngaySanxuat;
    }

    public void setNgaySanxuat(NgaySanxuat ngaySanxuat) {
        this.ngaySanxuat = ngaySanxuat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    @Override
    public String toString() {
        return hangSanXuat + " | " + ngaySanxuat + " | " + price + " | " + thoiGianBaoHanh;
    }

    //1,một máy tính có giá ít hơn giá máy tính khác hay không
    public boolean Check(Computer obj){
        return this.price < obj.price;
    }

}
