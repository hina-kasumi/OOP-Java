package Example.ViDuQuanLyPhim;



public class Main {
    public static void KiemTra(FilmManagement name1, FilmManagement name2){
        if (name1.reHonKhong(name2))
            System.out.println(name1.getName() + " re hon " + name2.getName());
        else
            System.out.println(name1.getName() + " khong re hon " + name2.getName());
    }
    public static void main(String[] args) {
        FilmManagement film1 = new FilmManagement("duc su tu su", 2023,
                new HangSanXuat("Unkown", "Japan"), 100,
                new Ngay(1,1,2023));

        FilmManagement film2 = new FilmManagement("Naruto", 2005,
                new HangSanXuat("Kisimoto", "Japan"), 200,
                new Ngay(6,10,2005));

        FilmManagement film3 = new FilmManagement("nothing", 2024,
                new HangSanXuat("hieu", "USA"), 50,
                new Ngay(31,3,2023));

        System.out.println(film1);
        System.out.println(film2);
        System.out.println(film3);
        System.out.println();

        //1, kiểm tra giá vé của một bộ phim bất kì có rẻ hơn giá vé phim khác không
        KiemTra(film1, film2);
        KiemTra(film1, film3);

        //2, in tên hãng sản xuất
        System.out.println(film1.getHangSanXuat().name);
        System.out.println(film2.getHangSanXuat().name);
        System.out.println(film3.getHangSanXuat().name);

        //3, giá vé sau khi có khuyến mãi
        int discount = 50;
        System.out.println(film1.sauKhigiamGia(discount));
        System.out.println(film2.sauKhigiamGia(discount));
        System.out.println(film3.sauKhigiamGia(discount));
    }
}
