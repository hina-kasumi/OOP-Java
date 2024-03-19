package Example.ViDuQuanLySach;

public class Main {
    public static void main(String[] args) {
        QuanLySach sach1 = new QuanLySach("Harry Poter", 2.5, 2024,
                new TacGia("hieu",
                        new Ngay(27, 9 ,2005)));
        System.out.println(sach1);

        QuanLySach sach2 = new QuanLySach("Java", 50, 2021,
                new TacGia("hieu",
                        new Ngay(2, 9 ,2010)));
        System.out.println(sach2);
        QuanLySach sach3 = new QuanLySach("Something else", 100, 2024,
                new TacGia("hieu",
                        new Ngay(7, 3 ,1005)));
        System.out.println(sach3);


        //in tên sách
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        //kiểm tra cùng năm xuất bản
        System.out.println("1 == 2: " + sach1.kiemtraCungNam(sach2));
        System.out.println("1 == 3: " + sach1.kiemtraCungNam(sach3));
        System.out.println("2 == 3: " + sach2.kiemtraCungNam(sach3));

        //kiểm tra giá sách sau khi giảm
        int discount = 50;

        System.out.println("gia sach 1 sau khi giam: " + sach1.discount(discount));
        System.out.println("gia sach 2 sau khi giam: " + sach2.discount(discount));
        System.out.println("gia sach 3 sau khi giam: " + sach3.discount(discount));
    }
}
