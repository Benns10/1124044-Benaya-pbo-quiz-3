package pbo.models;

public class FrozenFood extends Product implements Discountable, Expireable{
    private double suhu;
    private String tanggalKadaluarsa;
    private int amount;

    public FrozenFood(String id, String nama, double harga, int stok, double suhu, String tanggalKadaluarsa) {
        super(id, nama, harga, stok);
        this.suhu = suhu;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override 
    public double calculateDiscount(int amount) {
        if (amount >= 8) {
            return getHarga() * amount * 0.08;
        } else if (amount >= 4 && amount < 8) {
            return getHarga() * amount * 0.04;
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
        return "Buah-buahan [" + getNama() + "] (ID: " + getId() + ") - Harga: " + getHarga() + " | Stok: " + getStok() + " | Suhu: " + suhu + " | Tanggal Kadaluarsa: " + tanggalKadaluarsa;
    
    }
}
