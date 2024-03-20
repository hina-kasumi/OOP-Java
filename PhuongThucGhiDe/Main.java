package Example.PhuongThucGhiDe;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.eat();
        dog.makeSound();
        dog.sleep();

        Bird bird = new Bird();
        System.out.println("\nBird");
        bird.eat();
        bird.makeSound();
        bird.sleep();

        Fish fish = new Fish();
        System.out.println("\nFish");
        fish.eat();
        fish.makeSound();
        fish.sleep();

    }
}
