package Example.ViDuQuanLyPhim;

public class HangSanXuat {
    //attributes
    String name;
    String Country;


    //Constructor
    public HangSanXuat(String name, String country) {
        this.name = name;
        Country = country;
    }

    //Getter
    public String getName() {
        return name;
    }
    public String getCountry() {
        return Country;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "name='" + name + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
