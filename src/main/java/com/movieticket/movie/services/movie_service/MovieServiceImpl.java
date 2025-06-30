package com.movieticket.movie.services.movie_service;


import com.movieticket.movie.Exceptions.ApiRequestException;
import com.movieticket.movie.mappers.MovieMapper;
import com.movieticket.movie.models.Genre;
import com.movieticket.movie.models.Movie;
import com.movieticket.movie.repositories.MovieRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements  MovieService{
    private  final MovieRepository movieRepository;
    private final MovieMapper movieMapper;
    private  final UUIDUtil uuidUtil;


    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper movieMapper, UUIDUtil uuidUtil){
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
        this.uuidUtil = uuidUtil;
    }


    @Override
    public String createMovie(String movieId, String title,Genre genre, String duration, String rating, String poster) {
        Movie movie = movieMapper.toMovie(movieId, title,genre,duration,rating,poster);
        movieRepository.save(movie);
        return "Movie created";
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieId(String movieId) {
        return movieRepository.findById(movieId).orElseThrow(()-> new ApiRequestException("Movie Id does not exist"));
    }


}
