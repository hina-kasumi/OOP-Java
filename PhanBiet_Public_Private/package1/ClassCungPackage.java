package Example.PhanBiet_Public_Private.package1;

public class ClassCungPackage {
    Infor infor = new Infor();
    public void Get1(){
        //infor.a = 1; không truy cập được
        infor.b = 1; //truy cập được
        infor.c = 1; //truy cập được
        infor.d = 1; //truy cập được
    }
}
