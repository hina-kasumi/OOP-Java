package Example.ViDuQuanLyMayTinh;

public class HangSanXuat {
    //hãng sản xuất:tên hãng, quốc gia.
    //Attributes
    private String name, nation;

    //Constructor
    public HangSanXuat(String name, String nation) {
        this.name = name;
        this.nation = nation;
    }

    //Getter And Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return name + "(" + nation + ")";
    }
}
