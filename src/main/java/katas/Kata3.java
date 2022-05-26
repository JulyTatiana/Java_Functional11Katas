package katas;

import com.google.common.collect.ImmutableList;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video ids (flatMap(c -> c.stream()))
    DataSource: DataUtil.getMovieLists()
    Output: List of Integers
*/
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        //return ImmutableList.of(1, 2, 3);
        return movieLists.stream().flatMap(m -> m.getVideos().stream()).map(Movie::getId).collect(Collectors.toList());
    }

    public static void main(String[] args){

        //Kata Class is instantiated
        Kata3 kata3 = new Kata3();
        //print Kata3
        System.out.println(kata3.execute());
    }
}
