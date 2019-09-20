package com.capgemini.se_track.models;

public class CartLine {
    private Product product;
    private int amount;
    private double cartLineCost;



    /**
     * Create a new OrderLine without specifying amount, this defaults to 1
     * @param product The product you want to add
     */
    public CartLine(Product product) {
        this.product = product;
        this.amount = 1;
        this.cartLineCost = product.getPrice();
    }

    public CartLine(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.cartLineCost = product.getPrice() * amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCartLineCost() {
        return cartLineCost;
    }

    public void setCartLineCost(double cartLineCost) {
        this.cartLineCost = cartLineCost;
    }

    public void add (int amount) {
        if (amount <= 0) {
            System.out.println("Please enter a positive amount");
            return;
        }
        this.amount += amount;
    }

    public void remove (int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Please enter a positive amount");
        } else if (amount >= this.getAmount()) {
            throw new UnsupportedOperationException("Amount too large, remove entire cartLine");
        }
        this.amount -= amount;
    }
}
