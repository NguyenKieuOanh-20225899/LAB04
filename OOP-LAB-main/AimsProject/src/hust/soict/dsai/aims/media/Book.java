package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	private static int nbBook = 0;
	public Book() {
		
		
	}
	public Book(String title, String category, float cost, List<String> authors) {
        super( title, category, cost);
        nbBook++;
        setId(nbBook);
        this.authors=authors;
    }

	public List<String> getAuthors() {
		return authors;
	}

	
	
	
	public void addAuthor(String authorName) {
		    if (authorName == null || authorName.trim().isEmpty()) {
		        System.out.println("Invalid author name!");
		        return;
		    }
		    
		    if (!authors.contains(authorName)) {
		        authors.add(authorName);
		        System.out.println("Author added: " + authorName);
		    } else {
		        System.out.println("Author already exists: " + authorName);
		    }
		}

	public void removeAuthor(String authorName) {
	    if (authorName == null || authorName.trim().isEmpty()) {
	        System.out.println("Invalid author name!");
	        return;
	    }
	    
	    if (authors.contains(authorName)) {
	        authors.remove(authorName);
	        System.out.println("Author removed: " + authorName);
	    } else {
	        System.out.println("Author not found: " + authorName);
	    }
	}

	@Override
	public boolean isMatch(String title2) {
		// TODO Auto-generated method stub
		return false;
	}
	public String toString() {
        return "Book: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost() + ", Authors: " + authors;
    }
	

}
