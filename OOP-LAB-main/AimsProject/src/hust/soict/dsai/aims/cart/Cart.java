package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    public int qtyOrdered = 0; 
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void searchByID(int id) {
    	boolean found = false;
    	for (int i = 0; i < qtyOrdered; i++) {
    		if (itemsOrdered.get(i).getId() == id) {
    			System.out.println("Found" + itemsOrdered.get(i));
    			found = true;
    		}
    	}
    	if (!found) {	
    		System.out.println("No DVDs were found!");
    	}
    }
    public void sortByTitle(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    public void sortByCost(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    public void searchByTitle(String title) {
    	boolean found = false;
    	for (int i = 0; i < qtyOrdered; i++) {
    		if (itemsOrdered.get(i).isMatch(title)) {
    			System.out.println("Found" + itemsOrdered.get(i));
    			found = true;
    		}
    	}
    	if (!found) {
    		System.out.println("No DVDs were found!");
    	}
    }
    
    
    
    public void print() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i = 0; i < qtyOrdered; i++) {
    		System.out.println(i+1 + ". " + itemsOrdered.get(i));
    	}
    	System.out.println("Total cost:" + totalCost());
    	System.out.println("***************************************************");
    }
 // Phương thức thêm Media vào giỏ hàng
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Added: " + media.getTitle());
        } else {
            System.out.println("Item already exists in the cart: " + media.getTitle());
        }
    }
 // Phương thức xóa Media khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("Item not found in the cart: " + media.getTitle());
        }
        
    }
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}

