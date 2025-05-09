package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateMovieDto;
import com.movieticket.movie.Dto.Request.UpdateMovieDto;
import com.movieticket.movie.models.Movie;
import com.movieticket.movie.services.movie_service.MovieService;
import org.apache.catalina.LifecycleState;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/web/api/movie/")

public class MovieController {
    private  final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping("v1/createMovie")
    public ResponseEntity<String>createMovie(@RequestBody CreateMovieDto data){
        String message = movieService.createMovie(data.title(), data.genre(), data.duration(), data.rating(), data.poster());
        return  ResponseEntity.status(201).body(message);
    }

    @GetMapping("v1/getAllMovies")
   public ResponseEntity<List<Movie>>getAllMovies(){
        return ResponseEntity.status(200).body(movieService.getAllMovies());
    }

    @PostMapping("v1/updateMovie")
    public ResponseEntity<String >updateMovie(@RequestParam UpdateMovieDto data){
        String message = movieService.updateMovie((data.movieId()), data.title(), data.duration(), data.genre(), data.rating(), data.poster());
        return  ResponseEntity.status(201).body(message);
    }

    @GetMapping("v1/deletemovie")
   public ResponseEntity<String>deletemovie(@RequestParam("MovieId")String movieId){
        return ResponseEntity.status(200).body(movieService.deletemovie(movieId));
    }

   @PostMapping("v1/findMoviesByTitle")
    public  ResponseEntity<List<Movie>>findMoviesByTitle(@RequestParam("Title")String title){
        return ResponseEntity.status(200).body(movieService.findMoviesByTitle(title));
   }

   @PostMapping("v1/findMoviesByGenre")
    public  ResponseEntity<List<Movie>>findMoviesByGenre(@RequestParam("Genre")String genre){
        return  ResponseEntity.status(200).body(movieService.findMoviesByGenre(genre));
   }
}
