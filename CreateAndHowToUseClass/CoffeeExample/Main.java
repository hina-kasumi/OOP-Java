package Example.CreateAndHowToUseClass.CoffeeExample;


public class Main {
    public static void main(String[] args) {
        HoaDonCafe hoaDon = new HoaDonCafe("5 sao", 100, 6);
        System.out.println(hoaDon.Result());

        if (hoaDon.Compare(3))
            System.out.println("khoi luong mua > khoi luong can");
        else
            System.out.println("khoi luong mua khong du");

        if (hoaDon.lonHon500kKhong(500))
            System.out.println("hoa don co gia > 500k");
        else
            System.out.println("hoa don co gia <= 500k");
        System.out.println("gia sau khi ap dung giam gia: " + hoaDon.GiaCuoiCung(10));

    }
}
