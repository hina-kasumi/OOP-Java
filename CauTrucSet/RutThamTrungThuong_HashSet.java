package Example.CauTrucSet;

import java.util.*;

public class RutThamTrungThuong_HashSet {
    //Attribute
    private Set<String> thungPhieuDuThuong = new HashSet<String>(); // khai báo đối tượng Set

    //Constructor
    public RutThamTrungThuong_HashSet() {
    }

    //Methods
    //1. Thêm mã số dự thưởng.
    private boolean themPhieu (String giaTri){
        return this.thungPhieuDuThuong.add(giaTri);
    }

    //2. Xóa mã số dự thưởng.
    private boolean xoaPhieu (String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    //3. Kiểm tra mã số dự thưởng có tồn tại hay không?
    private boolean kiemTraPhieuTonTai (String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    //4. Xóa tất cả các phiếu dự thưởng.
    private void xoaTatCaPhieuDuThuong (){
        this.thungPhieuDuThuong.clear();
    }

    //5. Số lượng phiếu dự thưởng.
    private int soPhieu (){
        return this.thungPhieuDuThuong.size();
    }

    //6. Rút thăm trúng thưởng.
    private String rutMotPhieu(){
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        return (String) this.thungPhieuDuThuong.toArray()[viTri];
    }

    //7. In ra tất cả các phiếu.
    private void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //khai báo đối tượng Scanner để nhập.


        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();


        byte luaChon = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("MENU: ");

            //danh sách các lựa chọn
            System.out.println("1. Thêm mã số dự thưởng.");
            System.out.println("2. Xóa mã số dự thưởng.");
            System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
            System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
            System.out.println("5. Số lượng phiếu dự thưởng.");
            System.out.println("6. Rút thăm trúng thưởng.");
            System.out.println("7. In ra tất cả các phiếu.");
            System.out.println("0. Thoát khỏi chương trình");


            System.out.print("hãy nhập lựa chọn của bạn: ");
            //bắt lỗi nhập của người dùng
            do {
                try{
                    luaChon = scanner.nextByte(); // người dùng nhập vào
                } catch (Exception e){
                    scanner.next(); // xóa dữ liệu trong hàng nhập
                    luaChon = -1;
                }
                if (luaChon < 0 || luaChon > 7)
                    System.out.println("vui lòng nhập lại lựa chọn của bạn");
            } while (luaChon < 0 || luaChon > 7);

            scanner.nextLine(); // xóa dấu enter

            //thực hiện các lựa chọn của người dùng
            switch (luaChon){
                case (1):
                case (2):
                case (3):
                    System.out.print("nhập vào mã phiếu dự phòng: ");
                    String giaTri = scanner.nextLine();

                    //1. Thêm mã số dự thưởng.
                    if (luaChon == 1){
                        boolean themDuocKhong = rt.themPhieu(giaTri);
                        if (themDuocKhong)
                            System.out.println("phiếu bạn vừa nhập đã được thêm.");
                        else
                            System.out.println("phiếu bạn vừa nhập đã tồn tại, không thể thêm được.");
                    } else if (luaChon == 2) {
                        //2. Xóa mã số dự thưởng.
                        boolean xoaDuocKhong = rt.xoaPhieu(giaTri);
                        if (xoaDuocKhong)
                            System.out.println("phiếu bạn vừa nhập đã được xóa.");
                        else
                            System.out.println("phiếu bạn vừa nhập không tồn tại.");
                    } else {
                        //3. Kiểm tra mã số dự thưởng có tồn tại hay không?
                        boolean tonTaiKhong = rt.kiemTraPhieuTonTai(giaTri);
                        if (tonTaiKhong)
                            System.out.println("phiếu bạn vừa nhập có trong hòm phiếu.");
                        else
                            System.out.println("phiếu bạn vừa nhập không tồn tại.");
                    }
                    break;

                //4. Xóa tất cả các phiếu dự thưởng.
                case (4):
                    rt.xoaTatCaPhieuDuThuong();;
                    System.out.println("thung phiếu dự thưởng đã được dọn sạch.");
                    break;

                //5. Số lượng phiếu dự thưởng.
                case (5):
                    int soPhieuDuThuong = rt.soPhieu();
                    System.out.println("thùng phiếu hiện tại có " + soPhieuDuThuong + " phiếu");
                    break;

                    //6. Rút thăm trúng thưởng.
                case (6):
                    String rutDuoc = rt.rutMotPhieu();
                    System.out.println("bạn vừa rút được: " + rutDuoc);
                    rt.xoaPhieu(rutDuoc);
                    break;
                    //7. In ra tất cả các phiếu.
                case (7):
                    System.out.println("những phiếu đang có trong thùng phiếu là:");
                    rt.inTatCa();
            }
        } while (luaChon > 0);

        System.out.println("chương trình đã kết thúc.");
        scanner.close();
    }
}
