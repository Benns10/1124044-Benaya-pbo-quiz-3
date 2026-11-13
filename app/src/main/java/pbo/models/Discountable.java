package pbo.models;

interface Discountable {
    double calculateDiscount(int amount);
    double calculateSubTotal(int amount);
}