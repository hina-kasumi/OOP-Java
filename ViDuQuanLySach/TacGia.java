package Example.ViDuQuanLySach;

import java.lang.reflect.Constructor;

public class TacGia {
    //Attributes
    private String name;
    private Ngay ngaySinh;

    //the constructor
    public TacGia(String ten, Ngay dayOfBirth){
        this.name = ten;
        this.ngaySinh = dayOfBirth;
    }

    //Getter
    public String getName() {
        return name;
    }
    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    //toString method
    @Override
    public String toString() {
        return name + " (" + ngaySinh + ") ";
    }
}
