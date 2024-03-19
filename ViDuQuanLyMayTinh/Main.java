package Example.ViDuQuanLyMayTinh;

public class Main {
    public static void main(String[] args) {
        Computer cpt1 = new Computer(new HangSanXuat("HP", "USA"),
                new NgaySanxuat(2,2,2000),
                1000, 12);

        Computer cpt2 = new Computer(new HangSanXuat("LENOVO", "KOREA"),
                new NgaySanxuat(7,12,2001),
                900, 12);

        Computer cpt3 = new Computer(new HangSanXuat("ASUS", "JAPAN"),
                new NgaySanxuat(25,2,2002),
                1500, 12);

        System.out.println(cpt1);
        System.out.println(cpt2);
        System.out.println(cpt3);

        //1,một máy tính có giá ít hơn giá máy tính khác hay không
        if (cpt1.Check(cpt2))
            System.out.println("computer 1 re hon computer 2");
        else
            System.out.println("computer 2 re hon comtuer 1");

        if (cpt1.Check(cpt3))
            System.out.println("computer 1 re hon computer 3");
        else
            System.out.println("computer 3 re hon comtuer 1");

        //2, cho biết tên quốc gia sản xuất mt.
        System.out.println(cpt1.getHangSanXuat().getNation());
        System.out.println(cpt2.getHangSanXuat().getNation());
        System.out.println(cpt3.getHangSanXuat().getNation());
    }
}
