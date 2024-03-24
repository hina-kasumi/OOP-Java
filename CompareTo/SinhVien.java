package Example.CompareTo;

import java.security.PublicKey;
import java.lang.*;

public class SinhVien implements Comparable<SinhVien>{
    //Attributes
    private int maSinhVien;
    private String name;
    private String tenLop;
    private double diemTrungBinh;

    //Constructor
    public SinhVien(int maSinhVien, String name, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    //Getter And Setter
    public int getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getName() {
        String name = this.name.trim();
        name = name.substring(name.lastIndexOf(" ") + 1);
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    //CompareTo method
    @Override
    public int compareTo(SinhVien x){
        return this.getName().compareTo(x.getName());
    }
}
