package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateTheaterDto;
import com.movieticket.movie.models.Movie;
import com.movieticket.movie.models.Theater;
import com.movieticket.movie.services.theater_service.TheaterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/web/api/Theater")
public class TheaterController {
    private final TheaterService theaterService;

    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @PostMapping("/v1/createTheater")
    public ResponseEntity<String> createTheater(@RequestBody CreateTheaterDto data) {
        String message = theaterService.createTheater(data.theaterId(), data.name(), data.location());
        return ResponseEntity.status(201).body(message);
    }

    @GetMapping("/v1/getAllMovies")
    ResponseEntity<List<Theater>> getAllTheaters() {
        return ResponseEntity.status(200).body(theaterService.getAllTheaters());
    }
}
