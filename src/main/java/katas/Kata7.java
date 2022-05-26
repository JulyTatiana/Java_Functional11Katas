package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxArt": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        //return ImmutableList.of(ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", "url"));

        return movieLists.stream()
                .flatMap(movie -> movie.getVideos().stream())
                .map(movieVideo -> Map.of("id", movieVideo.getId(), "title", movieVideo.getTitle(), "boxArt", movieVideo
                        .getBoxarts()
                        .stream()
                        .reduce((item2, item1)-> item1.getWidth() *item1.getHeight() < item2.getHeight()*item2.getWidth() ? item2:item1)
                        .map(m -> m.getUrl())
                )).collect(Collectors.toList());

    }

    public static void main(String[] args){

        Kata7 kata7 = new Kata7();
        System.out.println(kata7.execute());
    }
}
