package Example.Enum;

public enum Thang {
    //các tháng 1-> 12 giống như một hàm
    thang1(31),
    thang2(29),
    thang3(31),
    thang4(30),
    thang5(31),
    thang6(30),
    thang7(31),
    thang8(31),
    thang9(30),
    thang10(31),
    thang11(30),
    thang12(31);

    //biến final sau khi bị gán 1 lần thì không thể thay dổi giá trị được nữa
    private final int soNgay;
    Thang(int ngay){
        this.soNgay = ngay;
    }
    public int getSoNgay(){
        return this.soNgay;
    }
}
