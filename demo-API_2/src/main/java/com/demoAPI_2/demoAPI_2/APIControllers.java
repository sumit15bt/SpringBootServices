package com.demoAPI_2.demoAPI_2;

import com.demoAPI_2.demoAPI_2.modal.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Movies")
public class APIControllers {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movie_id){
        System.out.println("movie_id hitted ===========>  " + movie_id);
        return new Movie(movie_id,"TEST MOVIE NAME");
    }
}
