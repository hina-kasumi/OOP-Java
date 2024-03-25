package Example.TaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static double tinhTien(double soTienCuoc, int soDiem, int chonTaiXiu) {
        Locale lc = new Locale("en", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        if (soDiem > 3 && soDiem <= 10) {
            if (chonTaiXiu == 1) {
                System.out.println("bạn đã thắng: +" + numf.format(soTienCuoc));
                return soTienCuoc;
            } else if (chonTaiXiu == 2) {
                System.out.println("bạn đã thua: -" + numf.format(soTienCuoc));
                return -soTienCuoc;
            }
        } else if ((soDiem > 10 && soDiem <= 18) || soDiem == 3) {
            if (chonTaiXiu == 2) {
                System.out.println("bạn đã thắng: +" + soTienCuoc);
                return soTienCuoc;
            } else if (chonTaiXiu == 1) {
                System.out.println("bạn đã thua: -" + soTienCuoc);
                return -soTienCuoc;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        byte stop;
        Scanner sc = new Scanner(System.in);
        TaiXiu taiXiu = new TaiXiu();
        double taiKhoan = taiXiu.getTienTaiKhoan();

        //fomat số tiền cho dễ nhìn
        Locale lc = new Locale("en", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        do {
            //thông tin ban đầu
            System.out.println("---------tài xỉu--------");
            System.out.println("Tài khoản của bạn: " + numf.format(taiKhoan));
            System.out.println("tiếp tục press: 1 || thoát press: nút khác");

            //kiểm tra người dùng nhập đúng định dạng không
            try {
                stop = sc.nextByte();
            } catch (Exception e) {
                stop = 0;
            }

            if (stop != 1)
                break;

            //nhập mức cược để chơi
            System.out.println("chọn mức cược: ");
            double mucCuoc = sc.nextDouble();

            //bắt lỗi nếu như nhập mức cược lớn hơn tài khoản hiện có
            while (mucCuoc > taiKhoan || mucCuoc <= 0) {
                System.out.print("vui lòng nhập lại mức cược: ");
                mucCuoc = sc.nextDouble();
            }


            //hỏi xem muốn tiếp tục không
            System.out.println("tài press 1 ------ xỉu press 2");
            int chonTaiXiu = 0;
            //bắt lỗi nhập lựa chọn của người dùng
            while (chonTaiXiu != 2 && chonTaiXiu != 1) {
                try {
                    chonTaiXiu = sc.nextInt();
                } catch (Exception e) {
                    sc.next(); // loại bỏ giá trị không hợp lệ khỏi bộ đệm của scanner
                    chonTaiXiu = 0;
                }
                if(chonTaiXiu != 2 && chonTaiXiu != 1)
                    System.out.println("vui lòng nhập lại lựa chọn của bạn:");
            }
                //hiển thị lại lựa chọn của người dùng
                if (chonTaiXiu == 1)
                    System.out.println("bạn vừa chọn tài");
                else if (chonTaiXiu == 2)
                    System.out.println("bạn vừa chọn xỉu");

                //thực hiện tung súc xắc
                Random xucSac = new Random();
                int giaTri1 = xucSac.nextInt(5) + 1;
                int giaTri2 = xucSac.nextInt(5) + 1;
                int giaTri3 = xucSac.nextInt(5) + 1;
                int soDiem = giaTri1 + giaTri2 + giaTri3;


                //hiển thị kết quả
                System.out.println("tống số điểm là: " + soDiem);
                taiKhoan += tinhTien(mucCuoc, soDiem, chonTaiXiu);
                System.out.println("tài khoản hiện tại của bạn: " + numf.format(taiKhoan));


                //hỏi xem tiếp tục trò chơi không
                if (taiKhoan > 0) {
                    System.out.println("tiếp tục press: 1 || thoát press: nút khác");
                    //bắt lỗi nếu ng dùng nhập không đúng định dạng
                    try {
                        stop = sc.nextByte();
                    } catch (Exception e) {
                        stop = 0;
                    }
                }

            }
            while (stop == 1 && taiKhoan > 0) ;
            sc.close();
    }
}

