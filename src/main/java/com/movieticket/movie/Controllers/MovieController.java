package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateMovieDto;
import com.movieticket.movie.services.movie_service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web/api/Movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping("/v1/createMovie")
    public ResponseEntity<String>createMovie(@RequestBody CreateMovieDto data){
        String message = movieService.createMovie(data.movieId(), data.title(), data.genre(), data.duration(), data.rating(), data.poster());
        return ResponseEntity.status(201).body(message);
    }

    @GetMapping("/v1/getAllMovies")
    public  ResponseEntity<String>
}
