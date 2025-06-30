package com.movieticket.movie.services.seat_service;


import com.movieticket.movie.models.Theater;
import org.springframework.stereotype.Service;

@Service
public interface SeatService {

    String createSeat(String seatId, String seatRow, String seatNumber,String seatType, String seatSection, Theater theater);
}
