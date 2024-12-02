package hust.soict.dsai.aims.media;

import java.util.Objects;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public Media(int id, String title,String category,float cost ) {
		this.id = id;
		this.category= category;
		this.title= title;
		this.cost=cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public abstract boolean isMatch(String title2);
	 @Override
	    public boolean equals(Object obj) {
	        // Kiểm tra nếu obj là thể hiện của Media
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Media media = (Media) obj;  // Ép kiểu Object thành Media
	        return Objects.equals(title, media.title);  // So sánh title
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(title);  // Cần ghi đè phương thức hashCode khi ghi đè equals
	    }
	

}
