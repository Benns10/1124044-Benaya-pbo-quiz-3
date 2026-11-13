package pbo.models;

public class Mahasiswa {
    private int nim;
    private String nama;
    private String email;
    private int umur;

    public Mahasiswa(int nim, String nama, String email, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.email = email;
        this.umur = umur;
    }

    public int getNim() { return nim; }
    public void setNim(int nim) { this.nim = nim; }

    public String getNama() { return nama;}
    public void setNama(String nama) { this.nama = nama; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }
}
