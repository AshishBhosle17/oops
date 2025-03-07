package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie ob1 = new Movie("Tyrant", 7.1, 2020);
        Movie ob2 = new Movie("JFK", 7.5, 2000);
        Movie ob3 = new Movie("Godfather", 8.0, 1990);

        List<Movie> list = new ArrayList<>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);

        Collections.sort(list, new RatingComp());

        // Display sorted movies
        for (Movie movie : list) {
            System.out.println(movie);
        }
    }
}
