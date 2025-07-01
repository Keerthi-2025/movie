package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateTheaterDto;
import com.movieticket.movie.services.theater_service.TheaterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/web/Theater")
public class TheaterController {
    private  final TheaterService theaterService;

    public TheaterController (TheaterService theaterService){
        this.theaterService = theaterService;
    }

    @PostMapping("/v1/createTheater")
    public ResponseEntity<String>createTheater(@RequestBody CreateTheaterDto data){
        String message = theaterService.createTheater(data.theaterId(), data.name(), data.location());
        return ResponseEntity.status(201).body(message);
    }
}
