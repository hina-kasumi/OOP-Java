package Example.Map;

import java.util.*;

public class DuLieu {
    //Attribute
    Map<String, String> duLieu = new TreeMap<String, String>(); // xắp xếp
    //Map<String, String> duLieu = new HashMap<String, String>(); // không xắp xếp
    //Constructor
    public DuLieu() {
    }

    //methods
    void themTu(String tu, String nghia){
        duLieu.put(tu, nghia);
    }

    void xoaTu(String tu){
        duLieu.remove(tu);
    }

    String traTu(String tu){
        return duLieu.get(tu);
    }

    void inDanhSach(){
        Set<String> danhSach = duLieu.keySet();
        System.out.println(Arrays.toString(danhSach.toArray()));
    }

    int laySoLuongTu(){
        return duLieu.size();
    }

    void xoaAll(){
        duLieu.clear();
    }
}
