package Example.ViDuQuanLySinhVien;

public class Strudent {
    private int MSV;
    private String fullName;
    private Date dateOfBirth;
    private float diemTB;
    private Lop lop;

    //Constructor
    public Strudent(int MSV, String fullName, Date dateOfBirth, float diemTB, Lop lop) {
        this.MSV = MSV;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    //Getter And Setter
    public int getMSV() {
        return MSV;
    }
    public void setMSV(int MSV) {
        this.MSV = MSV;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Lop getLop() {
        return lop;
    }
    public void setLop(Lop lop) {
        this.lop = lop;
    }

    //1, cho biết tên khoa sinh viên đang theo học
    public void inKhoa() {
        System.out.println(this.getFullName() + ": " + this.getLop().getKhoaName());
    }

    //2, cho biết học sinh có đậu hay không (điểm trung bình >= 5)
    public boolean KiemTra(){
        return this.diemTB >= 5;
    }
    public void InDau(){
        if (this.KiemTra())
            System.out.println("sinh vien " + this.fullName + " dau");
        else
            System.out.println("sinh vien " + this.fullName + " khong dau");
    }

    //3, kiểm tra sinh viên có ngày sinh giống với một sinh viên khác không
    public boolean SameBirth(Strudent other){
        return this.dateOfBirth.equals(other.dateOfBirth);
    }
    public void inSameBirth(Strudent obj){
        if (this.SameBirth(obj))
            System.out.println(this.getFullName() + " sinh cung ngay " + obj.getFullName());
        else
            System.out.println(this.getFullName() + " sinh khac ngay " + obj.getFullName());
    }
}
