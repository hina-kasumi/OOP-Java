package Example.CreateAndHowToUseClass.CoffeeExample;

public class HoaDonCafe {
    //attributes
    private String coffeeName;
    private double pricePerKg;
    private double weight;

    //A constructor
    public HoaDonCafe(String name, double giaTren1Kg, double khoiLuong){
        this.coffeeName = name;
        this.pricePerKg = giaTren1Kg;
        this.weight = khoiLuong;
    }

    //Method tim gia tien cuoi cung
    public double Result(){
        double result = this.pricePerKg * this.weight;
        return result;
    }

    //Method compare
    public boolean Compare(double kl){
        //boolean result = (kl < this.weight)? true:false;
        return this.weight > kl;
    }

    //kiem tra tong tien > 500?
    public boolean lonHon500kKhong(double money){
        return this.Result()>money;
    }

    //giam gia x% doi voi hoa don tren 500k
    public double discount(int x){
        if (lonHon500kKhong(500)){
            return this.Result()/100*x;
        }
        else
            return 0;
    }

    //gia sau khi giam
    public double GiaCuoiCung(int x){
        return Result() - discount(x);
    }
}
