package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle (title);
		this.setId(++nbDigitalVideoDiscs) ;
	}
	
	public DigitalVideoDisc(String category, String title, float cost) {
		super();
		this.setCategory(category);
		this.setTitle(title); 
		this.setCost ( cost);
		this.setId( ++nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super();
		this.director = director;
		this.setCategory (category);
		this.setTitle(title); 
		this.setCost ( cost);
		this.setId( ++nbDigitalVideoDiscs);
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title); 
		this.setCategory (category);
		this.director = director;
		this.length = length;
		this.setCost ( cost);
		this.setId( ++nbDigitalVideoDiscs);
	}

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	@Override
    public String toString() {
        return "DVD: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Director: " + this.getTitle() +
                " - DVD length: " + this.length +
                " - Cost: " + this.getCost() + "$";
    }
	
	public boolean isMatch(String title) {
		return getTitle().toLowerCase().contains(title.toLowerCase());
	}
	

	@Override
	public void play() {
	    System.out.println("Playing DVD: " + this.getTitle());
	    System.out.println("DVD length: " + this.getLength());
	}
	

	
}