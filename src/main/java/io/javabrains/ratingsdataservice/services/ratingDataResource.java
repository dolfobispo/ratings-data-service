package io.javabrains.ratingsdataservice.services;

import io.javabrains.ratingsdataservice.models.Rating;
import io.javabrains.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class ratingDataResource {

    @GetMapping("/{movieId}")
    public Rating getRating (@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }
    @RequestMapping("/users/{userId}")
    public UserRating getRatings(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(new Rating("1234",4),
                new Rating("12345",5));
        UserRating userRating = new UserRating(ratings);
        return userRating;
    }
}
