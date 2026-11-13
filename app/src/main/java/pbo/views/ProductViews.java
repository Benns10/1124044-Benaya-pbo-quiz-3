package pbo.views;

import pbo.controllers.ProductControllers;
import pbo.models.Buah;
import pbo.models.FrozenFood;
import pbo.models.Mie;
import pbo.util.InputUtil;

public class ProductViews {
    public void showMenu() {
        ProductControllers controller = new ProductControllers();
        boolean running = true;

        while (running) {
            System.out.println("\n=== PRODUCT ===");
            System.out.println("1. Tambah Product");
            System.out.println("2. Print Semua Product");
            System.out.println("3. Pesan");
            System.out.println("4. Keluar");
            int choice = InputUtil.readInt("Pilih menu: ");

            switch (choice) {
                case 1:
                    System.out.println("\nPilih Product:");
                    System.out.println("1. Mie");
                    System.out.println("2. Buah-buahan");
                    System.out.println("3. Frozen Food");
                    int subChoice = InputUtil.readInt("Masukkan pilihan jenis: ");

                    String id = InputUtil.readString("Masukkan ID: ");
                    String nama = InputUtil.readString("Masukkan Nama Product: ");
                    double harga = InputUtil.readDouble("Masukkan Harga: ");
                    int stok = InputUtil.readInt("Masukkan Stok: ");

                    if (subChoice == 1) {
                        String rasa = InputUtil.readString("Masukkan Rasa yng pernah ada: ");
                        double berat = InputUtil.readDouble("Masukan Berat: ");
                        Mie mie = new Mie(id, nama, harga, stok, rasa, berat);
                        controller.addProduct(mie);
                        System.out.println("Data Mie berhasil ditambahkan!");
                    } else if (subChoice == 2) {
                        String jenis = InputUtil.readString("Masukkan Jenis (Lokal/Import): ");
                        double berat = InputUtil.readDouble("Masukan Berat: ");
                        String tanggalKadaluarsa = InputUtil.readString("Expire (10-09-2026): ");
                        Buah buah = new Buah(id, nama, harga, stok, jenis, berat, tanggalKadaluarsa);
                        controller.addProduct(buah);
                        System.out.println("Data Buah berhasil ditambahkan!");
                    } else if (subChoice == 3) {
                        double suhu = InputUtil.readDouble("Masukkan Suhu (C): ");
                        String tanggalKadaluarsa = InputUtil.readString("Expire (10-09-2026): ");
                        FrozenFood frozenFood = new FrozenFood(id, nama, harga, stok, suhu, tanggalKadaluarsa);
                        controller.addProduct(frozenFood);
                        System.out.println("Data Frozen Food berhasil ditambahkan!");
                    } else {
                        System.out.println("Pilihan product tidak valid!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- DAFTAR PRODUCT TERSIMPAN ---");
                    controller.printAllProduct();
                    break;
                case 3:
                    System.out.println("Maintenance!");
                    break;
                case 4:
                    running = false;
                    System.out.println("Keluar dari program!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        }
    }
}
