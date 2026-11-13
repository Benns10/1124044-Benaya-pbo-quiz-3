package pbo.controllers;

import java.util.ArrayList;
import java.util.List;

import pbo.models.Product;

public class ProductControllers {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void printAllProduct() {
        if (productList.isEmpty()) {
            System.out.println("Belum ada product yang terdaftar");
            return;
        }
        for (Product p : productList) {
            System.out.println("> " + p.getProductDetails());
        }
    }
}
