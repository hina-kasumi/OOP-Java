package Example.PhuongThucGhiDe;

public class Dog extends Animals{
    //Constructor

    public Dog() {
        super("Dog");
    }

    //ghi đè method
    @Override
    public void eat(){
        System.out.println("eating bone");
    }

    @Override
    public void makeSound() {
        System.out.println("gau gau");
    }
}
