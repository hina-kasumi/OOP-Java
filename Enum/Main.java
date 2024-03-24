package Example.Enum;

public class Main {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.monday, "Java");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.tuesday, "KyThuatLapTrinh");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.wednesday, "CTDL&GT");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.thursday, "OOP");

        System.out.println(tkb_t5);

        Thang t5 = Thang.thang5;
        int soNgayt5 = Thang.thang5.getSoNgay();
        System.out.println(t5 +": " + soNgayt5);
    }
}
