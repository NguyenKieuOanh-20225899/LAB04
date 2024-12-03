package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {

    private List<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println(dvd.getTitle() + " has been added to the store.");
    }
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add((DigitalVideoDisc) media);
            System.out.println("Added \"" + media.getTitle() + "\" to the store.");
        } else {
            System.out.println("The item \"" + media.getTitle() + "\" is already in the store.");
        }
    }

    // Phương thức xóa Media khỏi Store
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Removed \"" + media.getTitle() + "\" from the store.");
        } else {
            System.out.println("The item \"" + media.getTitle() + "\" is not found in the store.");
        }
    }
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (title.equals(media.getTitle())) {
                return media;
            }
        }
        System.out.println("No match is found!"); 
        return null;
    }

    public void print() {
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println(i+1 + ". " + itemsInStore.get(i));
        }
    }

}