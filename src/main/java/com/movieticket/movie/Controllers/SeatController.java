package com.movieticket.movie.Controllers;


import com.movieticket.movie.services.seat_service.SeatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/Seat")
public class SeatController {
    private SeatService seatService;

    public SeatController(SeatService seatService){
        this.seatService = seatService;
    }

    @PostMapping("/v1/createSeat")
    ResponseEntity<String>createSeat(@RequestBody CreateSe)
}
