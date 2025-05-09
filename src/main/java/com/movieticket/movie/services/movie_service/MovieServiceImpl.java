package com.movieticket.movie.services.movie_service;


import com.movieticket.movie.Exceptions.ApiRequestException;
import com.movieticket.movie.Mappers.MovieMapper;
import com.movieticket.movie.models.Movie;
import com.movieticket.movie.repositories.MovieRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private  final MovieRepository movieRepository;
    private  final MovieMapper movieMapper;
    private  final UUIDUtil uuidUtil;

    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper movieMapper, UUIDUtil uuidUtil){
        this.movieMapper = movieMapper;
        this.movieRepository = movieRepository;
        this.uuidUtil = uuidUtil;
    }


    @Override
    public String createMovie(String title, String genre, String duration, String rating, String poster) {
        Movie movie = movieMapper.toMovie(uuidUtil.generateUuid(),title,genre,duration,rating,poster);
        movieRepository.save(movie);
        return "Movie created";
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


    @Override
    public String updateMovie(String movieId, String title, String genre, String duration, String rating, String poster) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(()-> new ApiRequestException("Movie Id does not exists"));
        movie.setMovieId(movieId);
        movie.setTitle(title);
        movie.setGenre(genre);
        movie.setDuration(duration);
        movie.setRating(rating);
        movie.setPoster(poster);
        return "";
    }

    @Override
    public String deletemovie(String movieId) {
        if (!movieRepository.existsById(movieId)){
            throw new ApiRequestException("Movie name not found");
        }
        movieRepository.deleteById(movieId);
        return "movie name deleted";
    }

    @Override
    public List<Movie> findMoviesByTitle(String title) {
        List<Movie>movies = movieRepository.findByTitleIgnoreCase(title);
        if (movies.isEmpty()){
            throw new ApiRequestException("No Movies found in this name");
        }
        return movies;
    }

    @Override
    public List<Movie> findMoviesByGenre(String genre) {
        List<Movie>movies = movieRepository.findByGenreIgnoreCase(genre);
        if (movies.isEmpty()){
            throw new ApiRequestException("No Movies found in under this Genre");
        }
        return movies ;
    }
}
