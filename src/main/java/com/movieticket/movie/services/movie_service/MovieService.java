package com.movieticket.movie.services.movie_service;

import com.movieticket.movie.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MovieService {
    String createMovie(String title, String genre,String duration, String rating, String poster);

    List<Movie>getAllMovies();

    String updateMovie(String movieId, String title, String genre, String duration, String rating,String poster);

    String deletemovie(String movieId);

    List<Movie>findMoviesByTitle(String title);

    List<Movie>findMoviesByGenre(String genre);

}
