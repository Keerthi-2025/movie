package com.movieticket.movie.services.booking_service;

import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    String createBooking(String userId, String username, String password, String email);

}
