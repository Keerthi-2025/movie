package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateMovieDto;
import com.movieticket.movie.services.movie_service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/Movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping("/v1/createMovie")
    public ResponseEntity<String>createMovie(@RequestParam CreateMovieDto data){
        String message = movieService.createMovie(data.movieId(), data.title(), data.genre(), data.duration(), data.rating(), data.poster());
        return ResponseEntity.status(201).body(message);
    }
}
