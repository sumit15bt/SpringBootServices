package com.demoAPI_3.demoAPI_3;

import com.demoAPI_3.demoAPI_3.modal.Rating;
import com.demoAPI_3.demoAPI_3.modal.UserRating;
import jdk.nashorn.internal.runtime.JSType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("ratingData")
public class API_3_Controller {

    @RequestMapping("/{movie_id}")
    public Rating getRating(@PathVariable("movie_id") String movieId){
        System.out.println("movieId = " + movieId);
        return new Rating(movieId, JSType.toInteger(movieId));
    }
    @RequestMapping("/users/{user_id}")
    public UserRating getUserRating(@PathVariable("user_id") String movieId){
        System.out.println("user_id movieId = " + movieId);
        List<Rating> ratings= Arrays.asList(
                new Rating("1234",3),
                new Rating("3456",4)
        );
        UserRating userRating=new UserRating();
        userRating.setUserRating(ratings);
        return userRating ;
    }
}
