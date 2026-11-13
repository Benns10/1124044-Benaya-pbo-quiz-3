package pbo.models;

public class Mie extends Product implements Discountable{
    private String rasa;
    private double berat;

    public Mie(String id, String nama, double harga, int stok, String rasa, double berat) {
        super(id, nama, harga, stok);
        this.rasa = rasa;
        this.berat = berat;
    }

    @Override 
    public double calculateDiscount(int amount) {
        if (amount >= 20) {
            return getHarga() * amount * 0.1;
        } else if (amount >= 10 && amount <20) {
            return getHarga() * amount * 0.05;
        } else {return getHarga() * amount  ;}
    }

    @Override 
    public double calculateSubTotal(int amount) {
        return getHarga() * amount - calculateDiscount(amount);
    }

    @Override
    public String getProductDetails() {
       return "Mie [" + getNama() + "] (ID: " + getId() + ") - Harga: " + getHarga() + " | Stok: " + getStok() + " | Rasa: " + rasa + " | Berat: " + berat;
    }
}
