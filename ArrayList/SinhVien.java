package Example.ArrayList;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
    //Attributes
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    //Constructor
    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        if (namSinh >= 0)
            this.namSinh = namSinh;
        else
            this.namSinh = 0;
        if (diemTrungBinh >= 0 && diemTrungBinh <= 10)
            this.diemTrungBinh = diemTrungBinh;
        else
            this.diemTrungBinh = 0;
    }

    //Getter And Setter
    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        if (namSinh < 0)
            this.namSinh = 0;
        else
            this.namSinh = namSinh;
    }
    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(float diemTrungBinh) {
        if (diemTrungBinh >= 0 && diemTrungBinh <= 10)
            this.diemTrungBinh = diemTrungBinh;
        else
            this.diemTrungBinh = 0;
    }

    //to String
    @Override
    public String toString() {
        return this.maSinhVien + "|" + this.hoVaTen + "|" +  this.namSinh +  "|" + this.diemTrungBinh;
    }

    //hàm so sánh để cố thể phục vụ cho mục đích sắp xếp theo mã sinh viên
    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    //hàm so sánh để kiểm tra 2 objects có bằng nhau hay không dựa trên mã sinh viên
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(maSinhVien, sinhVien.maSinhVien); //là phương thức so sánh nhưng bắt lỗi một thuộc tính là null
    }

}
