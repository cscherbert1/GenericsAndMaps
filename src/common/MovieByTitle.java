package common;

import java.util.Comparator;

/**
 * This Comparator implementation offers an alternate way to sort
 * Movie entities -- by Movie Title
 * 
 * @author cscherbert1
 */
public class MovieByTitle implements Comparator<Movie> {

    public int compare(Movie e1, Movie e2) {
        return e1.getTitle().compareTo(e2.getTitle());
        
    }
}