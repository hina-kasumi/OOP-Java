package Example.ViDuPackage.ViDu2;

public class ViDu {
    //Attributes
    private int a, b, c;

    //Constructor
    public ViDu(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    //toString

    @Override
    public String toString() {
        return a + " " + b + " " + c;
    }
}
