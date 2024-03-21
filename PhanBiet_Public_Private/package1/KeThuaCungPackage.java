package Example.PhanBiet_Public_Private.package1;

public class KeThuaCungPackage extends Infor{
    //Method
    public void get1(){
        //super.a = 1; không truy cập được
        super.b = 1; //truy cập được
        super.c = 1; //truy cập được
        super.d = 1; //truy cập được
    }
}
