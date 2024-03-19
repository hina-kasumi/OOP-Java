package Example.KeThua;

public class HocSinh extends ConNguoi{
    private String schoolName;

    //Constructor
    public HocSinh(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    //Getter And Setter
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //Method
    public void Study(){
        System.out.println("z z z z");
    }
}
