package Example.ViDuPackage.test;

import Example.ViDuPackage.ViDu1.ViDu;

public class Main {
    public static void main(String[] args) {
        ViDu vd1 = new ViDu(5, 6);
        System.out.println(vd1);

        Example.ViDuPackage.ViDu2.ViDu vd2 = new Example.ViDuPackage.ViDu2.ViDu(1, 2 ,3);
        System.out.println(vd2);
    }
}
