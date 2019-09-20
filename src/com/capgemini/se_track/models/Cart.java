package com.capgemini.se_track.models;

import com.capgemini.se_track.enums.ContentUnit;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;

public class Cart {
    private ArrayList<CartLine> cartLines;
    private double totalOrderCost; // TODO Currency means no primitives

    public Cart() {
        // Testdata
        cartLines = new ArrayList<>();

        ProductBrand brand = new ProductBrand("Quaker","Cruesli");
        Category category = new Category("Cereals");
        double price = 2.50d;
        Content content = new Content(300f, ContentUnit.G);
        Product product = new Product(brand, category, price, content);
        addProductToCart(product, 3);
        addProductToCart(product, 2);
    }

    public void addProductToCart (Product product, int amount) {
        for (CartLine cartLine : cartLines) {
            if (cartLine.getProduct().getName().equals(product.getName())) { // Check if cartLine with passed Product exists
                cartLine.add(amount); // If the order already exists, just add to the amount
            } else {
                CartLine newCartLine = new CartLine(product, amount);
                cartLines.add(newCartLine);
            }
        }
    }

    public void removeFromCart (Product product) throws IllegalArgumentException {
        CartLine currentLine = null;
        try {
            currentLine = getCurrentCartLine(product);
        } catch (IllegalArgumentException iae) {
            throw iae;
        }
        cartLines.remove(currentLine);
    }

    public void removeAmountFromCart (Product product, int amount) throws IllegalArgumentException {
        CartLine currentLine = null;
        try {
            currentLine = getCurrentCartLine(product);
        } catch (IllegalArgumentException iae) {
            throw iae;
        }

        try {
            currentLine.remove(amount);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (UnsupportedOperationException uoe) {
            System.out.println(uoe.getMessage());
            cartLines.remove(currentLine);
        }
    }

    private CartLine getCurrentCartLine (Product product) {
        for (CartLine cartLine : cartLines) {
            if (cartLine.getProduct().getName().equals(product.getName())) {
                return cartLine;
            }
        }
        throw new IllegalArgumentException("Can't remove " + product.getName() + ", the product does not exist in shopping cart");
    }

    public ArrayList<CartLine> getCartLines() {
        return cartLines;
    }
}
