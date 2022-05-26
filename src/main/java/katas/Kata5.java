package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();

        //return 3.0;
        return movies.stream() .map(m -> m.getRating()).reduce(0.0, (subtotal, element) -> element > subtotal ? element: subtotal);
    }

    public static void main(String[] args){
        Kata5 kata5 = new Kata5();
        System.out.println(kata5.execute());
    }
}
