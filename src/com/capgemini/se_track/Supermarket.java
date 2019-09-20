package com.capgemini.se_track;

import com.capgemini.se_track.controller.Register;
import com.capgemini.se_track.controller.ShoppingCart;
import com.capgemini.se_track.model.Diapers;
import com.capgemini.se_track.model.Soap;

public class Supermarket {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Register register = new Register(cart);
    	cart.addToCart(new Soap());
    	cart.addToCart(new Diapers());
		cart.addToCart(new Diapers());
		cart.addToCart(new Diapers());
    	cart.addToCart(new Soap());
		cart.addToCart(new Diapers());

    	register.calculatePrice();
    	register.pay(10);

    	register.printReceipt();
    }

}
