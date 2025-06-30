package com.movieticket.movie.services.movie_service;


import com.movieticket.movie.models.Genre;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {
    String createMovie(String movieId, String title,  Genre genre, String duration, String rating, String poster);
}
