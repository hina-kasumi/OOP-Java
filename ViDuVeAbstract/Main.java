package Example.ViDuVeAbstract;

public class Main {
    public static void main(String[] args) {
        //khai bái maybay là biến của dữ liệu con vì dữ liệu con mới dùng được method của dữ liệu con
        //dữ liệu con vẫn có thể dừng được thuộc tính và method của cha
        Plane maybay = new Plane(new HangSanXuat("VietNam AirLine", "VietNam1"), "Xang");
        PhuongTiendiChuyen oto = new Car(new HangSanXuat("Vinfast", "VietNam2"), "Xang");
        PhuongTiendiChuyen xedap = new Bike(new HangSanXuat("XX", "VietNam3"));

        //1, lấy tên sản xuất
        System.out.println("lay ten hang san xuat");
        maybay.layTenSanXuat();
        oto.layTenSanXuat();
        xedap.layTenSanXuat();

        //2,bắt đầy, tăng tốc, dừng lại.
        System.out.println("\nhoat dong:");
        maybay.working();
        oto.working();
        xedap.working();

        //lấy vận tốc
        System.out.println("\nmay bay: " + maybay.vanToc());
        System.out.println("oto: " + oto.vanToc());
        System.out.println("xe dap: " + xedap.vanToc());

        //cất cánh hạ canh máy bay
        System.out.println();
        maybay.CatCanh();
        maybay.HaCanh();
    }
}