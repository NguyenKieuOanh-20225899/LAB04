package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;      
    private String director; 
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	 // Constructor
    public Disc(int id, String title, String category, float cost, int length, String director) {
    	super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    // Getter cho director
    public String getDirector() {
        return director;
    }
	@Override
	public boolean isMatch(String title2) {
		// TODO Auto-generated method stub
		return false;
	}
}


