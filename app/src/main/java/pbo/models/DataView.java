package pbo.models;

import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T> {
    private List<T> daftar = new ArrayList<>();
    
    public void printAll() {
        for (T t : daftar) {
            System.out.println(t);
        }
    }

    public void printByPk(String primaryKey) {
        for (T t : daftar) {
            primaryKey = getPrimaryKeyValue(T data);
        }
    }


}
