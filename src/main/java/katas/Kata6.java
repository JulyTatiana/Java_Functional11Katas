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

        //return "someUrl";
        return movies.stream()
                .map(mapBox -> mapBox.getBoxarts())
                .flatMap(flatBox -> flatBox.stream())
                .reduce((item1, item2) -> item1.getWidth() * item1.getHeight() > item2.getWidth()*item2.getHeight() ? item1:item2)
                        .map(boxArt -> boxArt.getUrl())
                        .orElseThrow();
    }

    public static void main(String[] args){

        Kata6 kata6 = new Kata6();
        System.out.println(kata6.execute());
    }
}
