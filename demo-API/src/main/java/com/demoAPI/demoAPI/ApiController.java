package com.demoAPI.demoAPI;

import com.demoAPI.demoAPI.modals.CatalogItem;
import com.demoAPI.demoAPI.modals.Movie;
import com.demoAPI.demoAPI.modals.Rating;
import com.demoAPI.demoAPI.modals.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/APIHIT")
public class ApiController {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;
    @RequestMapping("/")
    public void Index(){
        System.out.println("APIHITTED-------------->");
    }

    @RequestMapping("/{userId}")
    public List<CatalogItem> setCatalogItem(@PathVariable("userId") String userId){

        // get all rated movie Id
       UserRating ratings= restTemplate.getForObject("http://localhost:8083/ratingData/users/"+userId, UserRating.class);

        // get movie info for each movie.

        // put them all together

        return  ratings.getUserRating().stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://localhost:8082/Movies/" + rating.getMovieId(), Movie.class);
            // flow waits untill api return somethings
            return new CatalogItem(movie.getName(), "test Moview", rating.getRating());
        }).collect(Collectors.toList());
    }

//    @RequestMapping("/RP/{userId}") // for Reactive Programming way of doiing it , Controller using web Client
//    public List<CatalogItem> setCatalogItem2(@PathVariable("userId") String userId){
//        WebClient.Builder builder=WebClient.builder();
//        // get all rated movie Id
//        List<Rating>  ratings= Arrays.asList(
//                new Rating("1234",3),
//                new Rating("3456",4)
//        );
//        // get movie info for each movie.
//
//        // put them all together
//
//        return  ratings.stream().map(rating -> {
//            // for post=> post();
//            // mono means these things is not getting right now,but its a promise in future you will get.
//            // getting Asynchronously.
//           Movie movie= webClientBuilder.build()
//                    .get()
//                    .uri("http://localhost:8082/Movies/" + rating.getMovieId())
//                    .retrieve()
//                    .bodyToMono(Movie.class)
//                   .block(); // blocking execution untill getting that all something.
//            // flow doesnot waits untill api return somethings.It flows faster (i.e., inbuild thread )
//            return new CatalogItem(movie.getName(), "test Moview", rating.getRating());
//        }).collect(Collectors.toList());
//    }

}
