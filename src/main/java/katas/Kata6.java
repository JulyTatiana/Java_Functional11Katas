package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();

        return "someUrl";
    }

    public static void main(String[] args){

        Kata4 kata4 = new Kata4();
        System.out.println(kata4.execute());
    }
}
