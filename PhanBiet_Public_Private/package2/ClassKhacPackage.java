package Example.PhanBiet_Public_Private.package2;

import Example.PhanBiet_Public_Private.package1.Infor;

public class ClassKhacPackage {
    Infor infor = new Infor();

    public void get() {
        //infor.a = 1; không truy xuất được
        //infor.b = 1; không truy xuất được
        //infor.c = 1; không truy xuất được
        infor.d = 1;
    }
}
