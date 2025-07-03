package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateShowtimeDto;
import com.movieticket.movie.models.Showtime;
import com.movieticket.movie.services.showtime_service.ShowtimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("web/api/Showtime")
public class ShowtimeController {

    private ShowtimeService showtimeService;

    public ShowtimeController(ShowtimeService showtimeService){
        this.showtimeService = showtimeService;
    }

    @PostMapping("/v1/createShowtime")
    ResponseEntity<String>createShowtime(@RequestBody CreateShowtimeDto data){
        String message = showtimeService.createShowtime(data.showtimeId(), data.movieId(),data.theaterId(),data.startTime(),data.endTime());
        return  ResponseEntity.status(201).body(message);
    }

    @GetMapping("/v1/getAllShowtimes")
    ResponseEntity<List<Showtime>>getAllShowtimes(){
        return ResponseEntity.status(200).body(showtimeService.getAllShowtimes());
    }

    @GetMapping("/v1/getShowtimeId")
    ResponseEntity<Showtime>getShowtimeId(@RequestParam("showtimeId")String showtimeId){
        return ResponseEntity.status(200).body(showtimeService.getShowtimeId(showtimeId));
    }
}
