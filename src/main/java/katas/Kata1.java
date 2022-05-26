package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
*/
public class Kata1 {
    public static List<Map> execute() {

        //import Movies from DataUtil file
        List<Movie> movies = DataUtil.getMovies();

        return movies
                .stream()
                .map(m -> {

            HashMap<String, String> map = new HashMap<>();
            map.put("id", m.getId().toString());
            map.put("title", m.getTitle().toString());
            return map;

        }).collect(Collectors.toList());
        //return ImmutableList.of(ImmutableMap.of("id", 5, "title", "Bad Boys"));
    }

    public static void main(String[] args){

        //Kata Class is instantiated
        Kata1 kata1 = new Kata1();
        //print Kata1
        System.out.println(kata1.execute());
    }
}
