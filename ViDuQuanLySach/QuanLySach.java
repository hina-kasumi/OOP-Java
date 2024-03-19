package Example.ViDuQuanLySach;

public class QuanLySach {
    //Attributes
    private String name;
    private double price;
    private int namXuatBan;
    private TacGia tacGia;

    //Constructor
    public QuanLySach(String tenSach, double price, int namXuatBan, TacGia tacGia){
        this.name = tenSach;
        this.price = price;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    //Getter
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public TacGia getTacGia() {
        return tacGia;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    //toString
    @Override
    public String toString() {
        return name + "|" + price + "|" + namXuatBan + "|" + tacGia;
    }

    //in ra tên sách
    public void inTenSach(){
        System.out.println(this.name);
    }


    //kiểm tra cùng năm xuất bản
    public boolean kiemtraCungNam(QuanLySach other){
        return this.namXuatBan == other.namXuatBan;
    }

    //kiểm tra giá sau khi giảm
    public double discount (int phantramGiam){
        return this.price - this.price/100*phantramGiam;
    }
}
