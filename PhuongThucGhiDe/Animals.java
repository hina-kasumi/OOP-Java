package Example.PhuongThucGhiDe;

public class Animals {
    //Attribute
    private String name;

    //Constructor
    public Animals(String name) {
        this.name = name;
    }

    //Getter And Stter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Method
    public void eat(){
        System.out.println("eating");
    }

    public void makeSound(){
        System.out.println("....");
    }

    public void sleep(){
        System.out.println("zzzzz");
    }
}
