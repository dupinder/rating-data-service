package io.doc.ratingdataservice.resources;

import io.doc.ratingdataservice.models.Rating;
import io.doc.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating geRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getRating(@PathVariable("userId") String userId){

        List<Rating> ratings =  Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 5)
        );
        UserRating userRatings = new UserRating();
        userRatings.setUserRating(ratings);

        return userRatings;
    }
}
