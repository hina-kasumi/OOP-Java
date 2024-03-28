package Example.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    //Attributes
    private ArrayList<SinhVien> danhSach;

    //Constructor

    public DanhSachSinhVien(){
        this.danhSach = new ArrayList<SinhVien>(); //khai báo một arraylistS
    }
    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    //Methods

    //1. thêm sinh viên vào danh sách.
    public void themSinhVien(SinhVien sinhVien){
        danhSach.add(sinhVien);
    }

    //2. In danh sách sinh viên ra màn hình.
    public void inDanhSach(){
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    //3. kiểm tra danh sách có rỗng hay không.
    //4. lấy ra số lượng sinh viên trong danh sách.
    public int soSinhVien (){
        return danhSach.size();
    }

    //5. làm rỗng danh sách sinh viên.
    public void donDanhSach(){
        danhSach.clear();
    }

    //6. kiểm tra sinh viên có tồn tại trong danh sách hay ko, dựa trên mã sinh viên.
    public boolean timMaSinhVien(SinhVien sinhVien){
        return this.danhSach.contains(sinhVien);
    }

    //7. xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
    public boolean xoaSinhVien(SinhVien sinhVien){
        return this.danhSach.remove(sinhVien);
    }

    //8. tìm kiếm tất cả sinh viên sinh viên dựa trên tên.
    public void inRaTimDuoc(String sv){
        for (SinhVien sinhVien: danhSach){
            if (sinhVien.getHoVaTen().equalsIgnoreCase(sv))
                System.out.println(sinhVien);
        }
    }

    //9. xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sort(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int)(o1.getDiemTrungBinh() - o2.getDiemTrungBinh());
            }
        });
    }
}
