package com.movieticket.movie.mappers;

import com.movieticket.movie.models.*;
import org.springframework.stereotype.Service;

@Service
public class SeatAvailabilityMapper {

    public Movie toMovie(String movieId, String title, Genre genre,String duration, String rating, String poster){
        return Movie.builder()
                .movieId(movieId)
                .title(title)
                .genre(genre)
                .duration(duration)
                .rating(rating)
                .poster(poster)
                .build();
    }


}