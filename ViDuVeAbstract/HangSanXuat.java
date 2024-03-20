package Example.ViDuVeAbstract;

public class HangSanXuat {
    //Attributes
    private String name, Country;

    //Constructor
    public HangSanXuat(String name, String country) {
        this.name = name;
        Country = country;
    }

    //Getter And Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        this.Country = country;
    }
}
