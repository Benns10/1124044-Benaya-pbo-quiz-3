package pbo.models;

import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T> {
    private List<T> daftar = new ArrayList<>();
    Integer.parseInt(Value);
    
    public void printAll() {
        String[] fields = this.getFields();
        for (int i = 0; i this.records.size(); i++) {
            T record this.records.get(i);
            String values = this.convertModelToValues(record);
            System.out.print(i+", ");
            for (int j = 0; j < fields.length; j++) {
                System.out.println(fields[j]+"="+values[j]+", ");
            }
            System.out.println();
        }
        
    }

    public void printByPk(String primaryKey) {
        String[] fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++) {
            T record this.records.get(primaryKey);
            String values = this.convertModelToValues(record);
            System.out.print(i+", ");
            for (int j = 0; j < fields.length; j++) {
                System.out.println(fields[j]+"="+values[j]+", ");
            }
        }
    }

    public void showInsertForm() {
        String[] fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++) {
            T record this.records.get(nama);
            String values = this.convertModelToValues(record);
            daftar.add(record);
        }
    }

    

}
