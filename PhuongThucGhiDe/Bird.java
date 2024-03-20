package Example.PhuongThucGhiDe;

public class Bird extends Animals{
    //Constructor
    public Bird() {
        super("Bird");
    }

    //Ghi đề method

    @Override
    public void eat() {
        System.out.println("eating mouse");
    }

    @Override
    public void makeSound() {
        System.out.println("chip chip");
    }
}
