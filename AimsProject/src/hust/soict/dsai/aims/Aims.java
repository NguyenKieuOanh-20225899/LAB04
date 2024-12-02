package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart Cart = new Cart(); 
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Pursuit Of Happiness", "Slice Of Life","Gabriele Muccino", 120, 24.95f);
		Cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Queen's Gambit", "Fantasy","Michelle Tesoro", 120, 29.99f);
		Cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Homelander", "The Boys", 20.99f);
		Cart.addMedia(dvd3);
		
		Cart.addMedia(dvd3);
		
		System.out.println("Total cost is: ");
		System.out.println(Cart.totalCost());
	}

}
