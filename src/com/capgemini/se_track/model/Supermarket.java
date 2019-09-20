package com.capgemini.se_track.model;

public class Supermarket {
    private ShoppingCart shoppingCart;
    private CashRegister cashRegister;

    public Supermarket(ShoppingCart shoppingCart, CashRegister cashRegister) {
        this.shoppingCart = shoppingCart;
        this.cashRegister = cashRegister;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public CashRegister getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }
}
