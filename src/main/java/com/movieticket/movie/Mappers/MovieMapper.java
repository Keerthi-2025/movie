package com.movieticket.movie.Mappers;

import com.movieticket.movie.models.Movie;

public class MovieMapper {
    public Movie toMovie(String movieId, String title, String genre, String duration, String rating, String poster, String showtime){
        return Movie.builder()
                .movieId(movieId)
                .title(title)
                .genre(genre)
                .duration(duration)
                .rating(rating)
                .poster(poster)
                .showtime(showtime)
                .build();
    }
}
