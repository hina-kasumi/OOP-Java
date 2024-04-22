package Example.LayThongTinFileVaDuyetFolder;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon = 0;
        System.out.println("nhập tên file:");
        String nameFile = scanner.nextLine();
        File file = new File(nameFile);
        do {
            System.out.println("MENU ---------- ");
            System.out.println("1. Kiểm tra file có thể thực thi: ");
            System.out.println("2. Kiểm tra file có thể đọc: ");
            System.out.println("3. Kiểm tra file có thể ghi: ");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In tên file: ");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
            System.out.println("7. In ra danh sách các file con: ");
            System.out.println("0. Thoát chương trình.");
            luaChon = scanner.nextInt();

            if(luaChon == 1)
                System.out.println(file.canExecute()); // có thể thực thi
            else if(luaChon == 2)
                System.out.println(file.canRead()); // có thể đọc
            else if(luaChon == 3)
                System.out.println(file.canWrite()); //có th viết
            else if(luaChon == 4)
                System.out.println(file.getAbsolutePath()); // in đường dẫn
            else if (luaChon == 5)
                System.out.println(file.getName()); // in tên file
            else if (luaChon == 6) {
                if (file.isDirectory()) //nếu đây là folder thì thực thi
                    System.out.println("đây là thư mục.");
                else if (file.isFile()) // nếu đây là file thực thi
                    System.out.println("đây là file.");
                else
                    System.out.println("không thể xác định");
            }
            else if (luaChon == 7){
                if (file.isDirectory()){
                    System.out.println("danh sách các tập tin con là:");
                    File[] mangCon = file.listFiles(); // trả về một mảng gồm các thư mục, file con của folder
                    for (File x: mangCon)
                        System.out.println(x.getAbsolutePath());//in ra đường đẫn các file và folder con
                }
                else
                    System.out.println("đây không phải là folder.");
            }
        }while (luaChon != 0);
        System.out.println("chương trình đã kết thúc");
        scanner.close();
    }
}
