package Example.Generic;

public class Box2 <T>{
    private T obj;

    public Box2(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
