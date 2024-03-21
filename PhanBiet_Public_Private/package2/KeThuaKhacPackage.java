package Example.PhanBiet_Public_Private.package2;

import Example.PhanBiet_Public_Private.package1.Infor;

public class KeThuaKhacPackage extends Infor {
    //Method
    public void get2() {
        //super.a = 1; không truy cập được
        // super.b = 1; không truy cập được
        super.c = 1; //truy cập được
        super.d = 1; //truy cập được
    }
}
