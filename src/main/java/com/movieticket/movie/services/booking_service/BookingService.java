package com.movieticket.movie.services.booking_service;

import com.movieticket.movie.models.*;
import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    String createBooking(String bookingId, String bookingDate, PaymentMethod paymentMethod, PaymentStatus paymentStatus, User user, SeatAvailability seatAvailability, Showtime showtime);



}
