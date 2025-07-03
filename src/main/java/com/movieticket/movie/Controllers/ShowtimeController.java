package com.movieticket.movie.Controllers;


import com.movieticket.movie.services.showtime_service.ShowtimeService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web/api/Showtime")
public class ShowtimeController {

    private ShowtimeService showtimeService;

    public ShowtimeController(ShowtimeService showtimeService){
        this.showtimeService = showtimeService;
    }

    @PostMapping("v1/createShowtime")
    ResponseEntity<String>createShowtime
}
