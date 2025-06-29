package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateBookingDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/booking")
public class BookingController {
    private  final BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping("v1/createBooking")
    public ResponseEntity<String> createBooking(@RequestBody CreateBookingDto data){
        String message = bookingService.createBooking(data.userId(), data.username(),data.password(),data.email());
        return ResponseEntity.status(201).body(message);
    }
}
