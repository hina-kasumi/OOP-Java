package Example.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte luaChon = 0;

        DanhSachSinhVien danhSach = new DanhSachSinhVien();

        do {
            //in ra danh sách để người dùng lựa chọn
            System.out.println("1. thêm sinh viên vào danh sách.\n" +
                "2. In danh sách sinh viên ra màn hình.\n" +
                "3. kiểm tra danh sách có rỗng hay không.\n" +
                "4. lấy ra số lượng sinh viên trong danh sách.\n" +
                "5. làm rỗng danh sách sinh viên.\n" +
                "6. kiểm tra sinh viên có tồn tại trong danh sách hay ko, dựa trên mã sinh viên.\n" +
                "7. xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n" +
                "8. tìm kiếm một sinh viên dựa trên tên.\n" +
                "9. xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n" +
                "0. thoát khỏi chương trình.\n");


            //bắt lỗi nhập của người dùng
            System.out.print("hãy nhập lựa chọn của bạn: ");
            do {
                try {
                    luaChon = scanner.nextByte();// người dùng nhập vào lựa cọn của mình
                }catch (Exception e){
                    scanner.next(); //nếu sảy ra lỗi thì dọn bộ nhớ đệm
                    luaChon = -1; //gán tạm một giá trị để thực hiện vòng lặp
                }
                if (luaChon < 0 || luaChon > 9)
                    System.out.println("vui lòng nhập lại lựa chọn của bạn.");
            }while (luaChon < 0 || luaChon > 9);
            scanner.nextLine();

            //thực hiện lựa chọn của người dùng
            switch (luaChon){
                //1. thêm sinh viên vào danh sách.
                case 1:
                    System.out.print("nhập mã sinh viên: ");
                    String maSinhVien = scanner.nextLine();
                    System.out.print("nhập tên sinh viên: ");
                    String hoVaTen = scanner.nextLine();
                    System.out.print("nhập năm sinh: ");
                    int namSinh = scanner.nextInt();
                    System.out.print("nhập điểm trung bình: ");
                    float diemTrungBinh = scanner.nextFloat();
                    SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    danhSach.themSinhVien(sinhVien);
                    scanner.nextLine();
                    break;

                    //2. In danh sách sinh viên ra màn hình.
                case 2:
                    System.out.println("đây là danh sách sinh viên:");
                    danhSach.inDanhSach();
                    break;

                    //3. kiểm tra danh sách có rỗng hay không.
                case 3:
                    if (danhSach.soSinhVien() == 0)
                        System.out.println("danh sách rỗng.");
                    else
                        System.out.println("danh sach không rỗng.");
                    break;

                    //4. lấy ra số lượng sinh viên trong danh sách.
                case 4:
                    System.out.println("so sinh vien co trong danh sach = " + danhSach.soSinhVien());
                    break;

                    //5. làm rỗng danh sách sinh viên.
                case 5:
                    danhSach.donDanhSach();
                    System.out.println("danh sách đã được làm rỗng.");
                    break;

                    //6. kiểm tra sinh viên có tồn tại trong danh sách hay ko, dựa trên mã sinh viên.
                case 6:
                    System.out.print("nhập mã sinh viên mà bạn muốn tìm: ");
                    String maSinhVienCanTim = scanner.nextLine();
                    SinhVien sv6 = new SinhVien(maSinhVienCanTim);
                    if(danhSach.timMaSinhVien(sv6))
                        System.out.println("sinh viên bạn tìm có tồn tại trong danh sách.");
                    else
                        System.out.println("sinh viên bạn tìm không có trong danh sách.");
                    break;

                    //7. xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
                case 7:
                    System.out.print("nhập mã sinh viên mà bạn muốn xóa: ");
                    String maSinhVienMuonXoa = scanner.nextLine();
                    SinhVien sv7 = new SinhVien(maSinhVienMuonXoa);
                    danhSach.xoaSinhVien(sv7);
                    break;

                    //8. tìm kiếm tất cả sinh viên sinh viên dựa trên tên.
                case 8:
                    System.out.print("nhập tên sinh viên bạn muốn tìm: ");
                    String tenSinhVienCanTim = scanner.nextLine();
                    System.out.println("kết quả tìm kiếm: ");
                    danhSach.inRaTimDuoc(tenSinhVienCanTim);
                    break;

                    //9. xuất ra danh sách sinh viên có điểm từ cao đến thấp.
                case 9:
                    danhSach.sort();
                    danhSach.inDanhSach();
                    break;
            }

            System.out.println("ấn Enter để tiếp tục");
            scanner.nextLine();
        }while (luaChon != 0);

        System.out.println("cảm ơn bạn đã sử dụng chương trình của tôi.");
        scanner.close();
    }
}
