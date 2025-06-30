package com.movieticket.movie.Controllers;

import com.movieticket.movie.Dto.Request.CreateBookingDto;
import com.movieticket.movie.models.Booking;
import com.movieticket.movie.services.booking_service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/web/api/Booking")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/v1/createBooking")
    public ResponseEntity<String> createBooking(@RequestBody CreateBookingDto data) {
        String message = bookingService.createBooking(data.bookingId(), data.bookingDate(), data.paymentMethod(), data.paymentStatus(), data.user(), data.seatAvailability(), data.showtime());
        return ResponseEntity.status(201).body(message);
    }

    @GetMapping("/v1/getAllBookings")
    ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.status(200).body(bookingService.getAllBookings());

    }

    @GetMapping("/v1/getBookingId")
    ResponseEntity<Booking>getBookingId(@RequestParam("bookingId")String bookingId){
        return ResponseEntity.status(200).body(bookingService.getBookingId(bookingId));
    }
}
