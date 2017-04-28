package common;

import java.util.*;

/**
 *
 * @author cscherbert1
 */
public class LabStartup {
    public static void main(String[] args) {
        System.out.println("Lab 2:");
        
        Movie m1 = new Movie("Star Wars Ep. IV", "George Lucas", "300");
        Movie m2 = new Movie("Pirates of the Caribbean", "Gore Verbinski", "600");
        Movie m3 = new Movie("The Lord of the Rings", "Peter Jackson", "400");
        Movie m4 = new Movie("Pirates of the Caribbean", "Gore Verbinski", "100");
        
        Map<String, Movie> map = new HashMap<String, Movie>();
        map.put("300", m1);
        map.put("600", m2);
        map.put("400", m3);
        map.put("100", m4);
        
        Movie m = map.get("100");
        System.out.println("Individual Movie w/ Key of 100 found: " + m);
        
        System.out.println("");
        System.out.println("Unsorted list of movies");
        Set<String> keys = map.keySet();
        for(String key : keys){
            Movie found = map.get(key);
            System.out.println(found.toString());
        }
        System.out.println("");
        System.out.println("Lab 3: ");
        
        Map<String, Movie> map2 = new TreeMap<String, Movie>(map);
        
        System.out.println("Sorted list of movies by Key (movieId): ");
        Set<String> keys2 = map2.keySet();
        for(String key: keys2){
            Movie found = map.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("");
        System.out.println("Using a collection of values, get Movies sorted by movieId");
        Collection<Movie> values = map2.values();
        List<Movie> sortedList = new ArrayList<>(values);
        Collections.sort(sortedList);
        for(Movie mov : sortedList){
            System.out.println(mov);
        }
        
        System.out.println("");
        System.out.println("Lab 4: ");
        
        Collection<Movie> values2 = map2.values();
        List<Movie> sortedList2 = new ArrayList<Movie>(values2);
        Collections.sort(sortedList2, new MovieByTitle());
        for(Movie mov: sortedList2){
            System.out.println(mov);
        }
        
        System.out.println("");
        System.out.println("Lab 5: ");
        Set<Movie> set = new TreeSet<Movie>();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        
        List<Movie> list = new ArrayList<>(set);
        Collections.sort(list, new MovieByTitle());
        for(Movie mov: set){
            System.out.println(mov);
        }
    }
}
