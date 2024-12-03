package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist; 
    private ArrayList<Track> tracks;
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
        return artist;
    }
	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director); // Gọi constructor của lớp cha Disc
        this.artist = artist;
        this.tracks = new ArrayList<>(); // Khởi tạo danh sách track
    }
	 // Phương thức thêm track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track \"" + track.getTitle() + "\" is already in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track \"" + track.getTitle() + "\" has been added.");
        }
    }

    // Phương thức xóa track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track \"" + track.getTitle() + "\" has been removed.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" does not exist in the list.");
        }
    }

    // Phương thức tính tổng chiều dài của CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
	
	@Override
    public void play() {
        System.out.println("Playing Compact Disc: " + this.getTitle() + " by " + this.getArtist());
        for (Track track : tracks) {
            track.play(); // Gọi phương thức play() của từng track
        }
    }
	@Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

}
