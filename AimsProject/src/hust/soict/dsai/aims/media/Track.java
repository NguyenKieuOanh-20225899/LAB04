package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;  
    private int length; 
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
	// Getter cho title
    public String getTitle() {
        return title;
    }
 // Getter cho length
    public int getLength() {
        return length;
    }
@Override
public void play() {
    System.out.println("Playing DVD: " + this.getTitle());
    System.out.println("DVD length: " + this.getLength());
}

}
