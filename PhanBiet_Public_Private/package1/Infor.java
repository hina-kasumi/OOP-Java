package Example.PhanBiet_Public_Private.package1;

public class Infor {
    //Attributes
    private int a; //chỉ trong class xem được
    int b; //có thể được truy cập trong cùng package
    protected int c;//có thể truy cập được trong bởi các lớp con (có thể khác package)

    public int d; //có thể truy cập được bởi bất kỳ class nào

    //Methods
    public void get(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
    }
}
