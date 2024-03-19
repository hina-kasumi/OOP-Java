package Example.KeThua;

public class ConNguoi {
    //Attributes
    private String name;
    private int age;

    //Constructor
    public ConNguoi(String name, int age) {
        this.name = name;
        if (age <= 150)
            this.age = age;
        else
            this.age = 1;
    }

    //Getter And Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (this.age <= age)
            this.age = age;
    }

    //Method
    public void eat(){
        System.out.println("yum yum");
    }

    public void drink(){
        System.out.println("uc uc");
    }
    public void sleep(){
        System.out.println("zzz zzz");
    }
}
