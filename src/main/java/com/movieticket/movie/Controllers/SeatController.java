package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateSeatDto;
import com.movieticket.movie.models.Seat;
import com.movieticket.movie.services.seat_service.SeatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/web/api/Seat")
public class SeatController {
    private SeatService seatService;

    public SeatController(SeatService seatService){
        this.seatService = seatService;
    }

    @PostMapping("/v1/createSeat")
    ResponseEntity<String>createSeat(@RequestBody CreateSeatDto data){
        String message = seatService.createSeat(data.seatId(), data.seatRow(), data.seatNumber(), data.seatType(), data.seatSection(), data.theater());
        return  ResponseEntity.status(201).body(message);
    }

    @GetMapping("/v1/getAllSeats")
    ResponseEntity<List<Seat>>getAllSeats(){
        return ResponseEntity.status(201).body(seatService.getAllSeats());
    }

}
