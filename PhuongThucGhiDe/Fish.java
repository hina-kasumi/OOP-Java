package Example.PhuongThucGhiDe;

public class Fish extends Animals{
    //Constructor
    public Fish() {
        super("Fish");
    }

    //Ghi đề method

    @Override
    public void eat() {
        System.out.println("eating worm");
    }
    @Override
    public void makeSound() {
        System.out.println("oooooooo");
    }
}
