package Example.ViDuQuanLySinhVien;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Lop lop1 = new Lop("CNTT3-K64", "CNTT2");
        Date dob1 = new Date(27, 9, 2005);
        Strudent student1 = new Strudent(123456, "Hieu", dob1, 10, lop1);

        Lop lop2 = new Lop("CNTT2-K64", "CNTT1");
        Date dob2 = new Date(27, 9, 2005);
        Strudent student2 = new Strudent(654321, "Tung", dob2, 4, lop2);

        Lop lop3 = new Lop("CNTT3-K64", "CNTT3");
        Date dob3 = new Date(12, 5, 2004);
        Strudent student3 = new Strudent(16353, "Duong", dob3, 5, lop3);

        //1, cho biết tên khoa sinh viên đang theo học
        System.out.println("khoa sinh vien dang theo hoc:");
        student1.inKhoa();
        student2.inKhoa();
        student3.inKhoa();

        //2, cho biết học sinh có đậu hay không (điểm trung bình >= 5)
        student1.InDau();
        student2.InDau();
        student3.InDau();

        //3, kiểm tra sinh viên có ngày sinh giống với một sinh viên khác không
        student1.inSameBirth(student2);
        student1.inSameBirth(student3);
        student3.inSameBirth(student2);
    }
}
