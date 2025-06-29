package com.movieticket.movie.services.booking_service;

import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    String createBooking(String bookingId, String bookingDate,String paymentMethod, String paymentStatus, String user,String seatAvailability, String showtime);

}
