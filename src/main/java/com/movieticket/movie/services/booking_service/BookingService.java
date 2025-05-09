package com.movieticket.movie.services.booking_service;


import com.movieticket.movie.models.Booking;
import com.movieticket.movie.models.PaymentMethod;
import com.movieticket.movie.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface BookingService {
    String createBooking(String showtimeId, String seatId, LocalDateTime bookingDate, String paymentStatus, PaymentMethod paymentMethod);

    List<Booking>getAllBookings();

    Booking getBookingById(String bookId);

}
