package Example.CreateFolderAndFiles;


import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //kiểm tra xem folder này có tồn tại hay không
        File folder1 = new File("D:\\nguye\\code\\java\\Nam1\\Example\\CreateFolderAndFiles");
        File folder2 = new File("D:\\nguye\\code\\java\\Nam1\\Example\\FileNayKhongTonTai");
        System.out.println("kiểm tra folder 1 có tồn tại hay kkhông: " + folder1.exists());
        System.out.println("kiểm tra folder 2 có tồn tại hay kkhông: " + folder2.exists());

        //tạo thư mục
        File d1 = new File("D:\\nguye\\code\\java\\Nam1\\Example\\CreateFolderAndFiles\\folder1");
        try{
            boolean canCreate = d1.mkdir(); // tạo một folder
           if (canCreate){
               System.out.println("tạo folder thành công.");
           } else {
               System.out.println("folder đã tồn tại.");
           }
        }catch (Exception e){
            System.out.println("không thể tạo folder.");
        }

        File d2 = new File("D:\\nguye\\code\\java\\Nam1\\Example\\CreateFolderAndFiles\\folder1\\folder2\\folder3\\folder4\\folder5");
        try{
            boolean canCreate = d2.mkdirs(); // tạo nhiều folder một lúc
            if (canCreate)
                System.out.println("tạo các folder thành công.");
            else
                System.out.println("các folder đã tồn tại trước đó.");
        }catch (Exception e){
            System.out.println("không thể tạo các folder.");
        }

        //tạo file
        File file1 = new File("D:\\nguye\\code\\java\\Nam1\\Example\\CreateFolderAndFiles\\folder1\\test.txt");
        try {
            boolean fileCreated = file1.createNewFile(); // tạo một file
            if (fileCreated)
                System.out.println("file đã được tạo.");
            else
                System.out.println("file đã tồn tại trước đó.");
        }catch (IOException e){
            //không có quyền tạo file
            // ổ cứng bị đầy
            //đường dẫn bị sai
            System.out.println("không thể tạo file.");
            e.printStackTrace();
        }
    }
}
