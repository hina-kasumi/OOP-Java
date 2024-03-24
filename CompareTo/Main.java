package Example.CompareTo;

public class Main {
    public static void main(String[] args) {
        SinhVien a = new SinhVien(1, "nguyễn hải hieu", "lớp cntt3-k64", 10);
        SinhVien b = new SinhVien(2, "hồ việt tung", "lớp cntt2-k64", 5);
        SinhVien c = new SinhVien(3, "hina", "lớp cntt1-k64", 9);
        System.out.println("a compare to b: " + a.compareTo(b));
        System.out.println("a compare to c: " + a.compareTo(c));
    }
}
