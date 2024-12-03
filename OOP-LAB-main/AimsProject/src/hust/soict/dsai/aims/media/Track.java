package hust.soict.dsai.aims.media;

import java.util.Objects;

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
@Override
public boolean equals(Object obj) {
    // Kiểm tra nếu obj là thể hiện của Track
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    if (!super.equals(obj)) {  // So sánh title từ lớp cha Media
        return false;
    }
    Track track = (Track) obj;  // Ép kiểu Object thành Track
    return length == track.length;  // So sánh length
}

@Override
public int hashCode() {
    return Objects.hash(super.hashCode(), length);  // Cần ghi đè hashCode khi ghi đè equals
}

}
