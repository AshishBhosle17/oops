package comparator;

import java.util.Comparator;

public class RatingComp implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		if(o1.getRatings()<o2.getRatings()) {
			return -1;
			
		}
		else if(o1.getRatings()>o2.getRatings()) {
			return 1;
			
		}else {
			return 0;
		}
	}

}
