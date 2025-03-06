package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Movie implements Comparable<Movie> {
	
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
	
	// implementing compareTo for default sorting by year
	@Override
	public int compareTo(Movie o) {// sorting movies in ascending order
		// TODO Auto-generated method stub
		return this.year - o.year;
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		Movie ob1 = new Movie("Tyrant", 7.1, 2020);
		Movie ob2 = new Movie("JFK", 7.5, 2000);
		Movie ob3 = new Movie("Godfather", 8, 1990);
		
		List<Movie> list = new ArrayList<Movie>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		
		System.out.println("---------Before Sorting--------");
		
		Iterator<Movie> iterator = list.iterator();
		while (iterator.hasNext()) {
			Movie ob4 = (Movie) iterator.next();
			System.out.println(ob4);
			
		}
		
		System.out.println("--------After inserting-------");
		
		Collections.sort(list);
		
		Iterator<Movie> iterator1=list.iterator();
		while (iterator1.hasNext()) {
			Movie ob4 = (Movie) iterator1.next();
			System.out.println(ob4);
			
		}
		
	}

}
