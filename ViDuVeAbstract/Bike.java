package Example.ViDuVeAbstract;

public class Bike extends PhuongTiendiChuyen{
    //Constructor
    public Bike(HangSanXuat hangSanXuat) {
        super("Bike", hangSanXuat);
    }

    @Override
    public double vanToc(){
        return 20;
    }
}
