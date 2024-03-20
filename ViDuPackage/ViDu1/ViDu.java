package Example.ViDuPackage.ViDu1;

public class ViDu {
    private int a, b;

    //Constructor
    public ViDu(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Getter And Setter
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " " + b;
    }
}
