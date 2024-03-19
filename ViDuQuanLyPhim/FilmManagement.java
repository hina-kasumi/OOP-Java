package Example.ViDuQuanLyPhim;

public class FilmManagement {
    //Attributes
    private String name;
    private int year;
    private HangSanXuat hangSanXuat;
    private double price;
    private Ngay ngayChieu;

    //Constructor
    public FilmManagement(String name, int year, HangSanXuat hangSanXuat, double price, Ngay ngayChieu) {
        this.name = name;
        this.year = year;
        this.hangSanXuat = hangSanXuat;
        this.price = price;
        this.ngayChieu = ngayChieu;
    }


    //Getter And Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }
    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    //toString
    @Override
    public String toString() {
        return name + "|" + year + "|" + hangSanXuat + "|" + price + "|" + ngayChieu;
    }

    //1, kiểm tra giá vé của một bộ phim bất kì có rẻ hơn giá vé phim khác không
    public boolean reHonKhong(FilmManagement other){
        return this.price < other.price;
    }

    //3, giá vé sau khi có khuyến mãi
    public double sauKhigiamGia(int percent){
        return this.price - this.price/100*percent;
    }
}
