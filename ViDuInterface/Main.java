package Example.ViDuInterface;

public class Main {
    public static void main(String[] args) {

        //khai báo các biến và mảng sẵn
        double a = 4;
        double b = 3;
        double[] arr = {9, 2, 5, 2, 7, 3};

        //cộng trừ nhân chia casio
        System.out.println("Casio: ");
        MayTinhCasioFX500 casioFX500 = new MayTinhCasioFX500();
        System.out.println(casioFX500.cong(a, b));
        System.out.println(casioFX500.tru(a, b));
        System.out.println(casioFX500.nhan(a, b));
        System.out.println(casioFX500.chia(a, b));

        //cộng trừ nhân chia Vina
        System.out.println("\nVina: ");
        MayTinhVinaCal500MS vinaCal500MS = new MayTinhVinaCal500MS();
        System.out.println(vinaCal500MS.cong(a, b));
        System.out.println(vinaCal500MS.tru(a, b));
        System.out.println(vinaCal500MS.nhan(a, b));
        System.out.println(vinaCal500MS.chia(a, b));


        //sắp xếp chọn
        SapXepChon sortChon = new SapXepChon();
        System.out.println("\nsap xep chon: ");

        //tăng
        System.out.println("tang");
        sortChon.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        //giảm
        System.out.println("\ngiam");
        sortChon.sapXepGiam(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");



        //sắp xếp chèn
        SapXepChen sortChen = new SapXepChen();
        System.out.println("\n\nsap xep chen: ");

        //tăng
        System.out.println("tang");
        sortChon.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        //giảm
        System.out.println("\ngiam");
        sortChon.sapXepGiam(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");


        //phần mềm bỏ túi đa hiện thực hóa
        System.out.println("\n\nphan mem may tinh: ");
        PhanMemMayTinhBoTui pmmt = new PhanMemMayTinhBoTui();

        System.out.println("a * b = " + pmmt.nhan(a, b));

        System.out.println("xap xep: ");
        pmmt.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
