package com.movieticket.movie.services.movie_service;


import com.movieticket.movie.mappers.MovieMapper;
import com.movieticket.movie.models.Genre;
import com.movieticket.movie.models.Movie;
import com.movieticket.movie.repositories.MovieRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

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
    public String createMovie(String movieId, Genre genre, String duration, String rating, String poster) {
        Movie movie = movieMapper.toMovie(uuidUtil.generateUuid(), genre,duration,rating,poster);
        movieRepository.save(movie);
        return "Movie created";
    }
}
