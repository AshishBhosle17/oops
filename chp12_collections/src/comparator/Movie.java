package comparator;

public class Movie {
	String name;
	double ratings;
	int year;
	
	public Movie(String name, double ratings, int year) {
		super();
		this.name = name;
		this.ratings = ratings;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", ratings=" + ratings + ", year=" + year + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
