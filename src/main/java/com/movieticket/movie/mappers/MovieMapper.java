package com.movieticket.movie.mappers;


import com.movieticket.movie.models.Genre;
import com.movieticket.movie.models.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieMapper {

    public Movie toMovie(String movieId, String title, Genre genre, String duration,String rating,String poster){
        return  Movie.builder()
                .movieId(movieId)
                .title(title)
                .genre(genre)
                .duration(duration)
                .rating(rating)
                .poster(poster)
                .build();
    }
}
