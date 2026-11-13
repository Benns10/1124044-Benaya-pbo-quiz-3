package pbo.models;

public class Buah extends Product implements Discountable, Expireable{
    private String jenis;
    private double berat;
    private String tanggalKadaluarsa;

    public Buah(String id, String nama, double harga, int stok, String jenis, double berat, String tanggalKadaluarsa) {
        super(id, nama, harga, stok);
        this.jenis = jenis;
        this.berat = berat;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override 
    public double calculateDiscount(int amount) {
        if (amount >= 15) {
            return getHarga() * amount * 0.05;
        } else if (amount >= 10 && amount < 15) {
            return getHarga() * amount * 0.03;
        } else if (amount >= 5 && amount < 10) {
            return  getHarga() * amount * 0.02;
        } else {return getHarga() * amount;}
    }

    @Override 
    public double calculateSubTotal(int amount) {
        return getHarga() * amount - calculateDiscount(amount);
    }

    @Override 
    public String Expire() {
        return tanggalKadaluarsa;
    }

    @Override
    public String getProductDetails() {
        return "Buah-buahan [" + getNama() + "] (ID: " + getId() + ") - Harga: " + getHarga() + " | Stok: " + getStok() + " | Jenis: " + jenis + " | Berat: " + berat + " | Tanggal Kadaluarsa: " + tanggalKadaluarsa;
    
    }
}
