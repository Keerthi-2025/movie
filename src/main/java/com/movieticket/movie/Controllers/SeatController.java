package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateSeatDto;
import com.movieticket.movie.Dto.Request.UpdateSeatDto;
import com.movieticket.movie.models.Seat;
import com.movieticket.movie.services.seat_service.SeatService;
import org.apache.catalina.LifecycleState;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.directory.SearchControls;
import java.util.List;

@RestController
@RequestMapping("web/api/seat")
public class SeatController {
    public final SeatService seatService;
    public SeatController(SeatService seatService){
        this.seatService = seatService;
    }
    @PostMapping("/v1/createSeat")
    public ResponseEntity<String >createSeat(@RequestBody CreateSeatDto data){
        return  ResponseEntity.status(201).body(seatService.createSeat(data.showtimeId(), data.seatRow(), data.seatNumber(), data.seatType(), data.seatSection()));
    }

    @GetMapping("/v1/getSeatById")
    public ResponseEntity<Seat>getSeatById(@RequestParam("SeatId")String seatId){
        return  ResponseEntity.status(200).body(seatService.getSeatById(seatId));
    }

    @PostMapping("v1/updateSeat")
    public  ResponseEntity<String>updateSeat(@RequestBody UpdateSeatDto data){
        return ResponseEntity.status(201).body(seatService.updateSeat(data.seatId(), data.showtimeId(), data.seatRow(), data.seatNumber(), data.seatSection(), data.seatType()));
    }

    @GetMapping("v1/deleteSeat")
    public ResponseEntity<String>deleteSeat(@RequestParam("SeatId")String seatId){
        return  ResponseEntity.status(200).body(seatService.deleteSeat(seatId));
    }

    @GetMapping("v1/getAllSeats")
    public  ResponseEntity<List<Seat>>getAllSeats(){
        return ResponseEntity.status(200).body(seatService.getAllSeats());
    }
}
