package Example.CompareTo;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinhVien a = new SinhVien(1, "nguyễn hải hieu", "lớp cntt3-k64", 10);
        SinhVien b = new SinhVien(3, "hồ việt tung", "lớp cntt2-k64", 5);
        SinhVien c = new SinhVien(2, "hina", "lớp cntt1-k64", 9);
        System.out.println("a compare to b: " + a.compareTo(b));
        System.out.println("a compare to c: " + a.compareTo(c));

        SinhVien[] arr = {a, b, c};
        System.out.println("Bat dau: " + Arrays.toString(arr));

        //hàm sort dựa trên Compareto để so sánh
        //khi không có CompareTo thì không thể so sánh
        Arrays.sort(arr);
        System.out.println("sap xep: " + Arrays.toString(arr));

        //tìm kiếm binary search
        //tìm kiếm object thì phải truyền vào mảng object và object
        System.out.println("tìm kiếm " + a + " " + Arrays.binarySearch(arr, c));
    }
}
