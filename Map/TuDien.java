package Example.Map;

import java.util.Scanner;

public class TuDien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DuLieu tuDien = new DuLieu();

        int luaChon = 0;
        do {
            System.out.println("---------------");
            System.out.println("MENU ");
            System.out.println("Tra từ điển Anh - Việt:\n"
                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2. Xóa từ\n"
                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
                    + "4. In ra danh sách từ khóa\n"
                    + "5. Lấy số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n"
                    + "");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            if (luaChon == 1){
                System.out.println("nhập vào từ khóa: ");
                String tu = scanner.nextLine();
                System.out.println("nhập vào nghĩa: ");
                String nghia = scanner.nextLine();
                tuDien.themTu(tu, nghia);
            } else if (luaChon == 2) {
                System.out.println("nhập vào từ khóa: ");
                String tu = scanner.nextLine();
                tuDien.xoaTu(tu);
            } else if (luaChon == 3) {
                System.out.println("nhập vào từ bạn muốn tra: ");
                String tu = scanner.nextLine();
                System.out.println("nghĩa từ đó là: " + tuDien.traTu(tu));
            } else if (luaChon == 4) {
                tuDien.inDanhSach();
            } else if (luaChon == 5) {
                System.out.println("số lượng từ: " + tuDien.laySoLuongTu());
            } else if (luaChon == 6){
                tuDien.xoaAll();
            }

        }while (luaChon != 0);
        scanner.close();
    }
}
