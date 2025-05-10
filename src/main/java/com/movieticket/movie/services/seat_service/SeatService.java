package com.movieticket.movie.services.seat_service;

import com.movieticket.movie.models.Seat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatService {
    String createSeat(String showtimeId, String seatRow, String seatNumber, String seatType, String seatSection);

    List<Seat>getAllSeats();

    Seat getSeatById(String seatId);

    String deleteSeat(String seatId);

    String updateSeat(String seatId, String showtimeId, String seatRow, String seatNumber, String seatType, String seatSection);


    //  String bookSeat(String seatId, String showtimeId, String paymentStatus, String paymentMethod);

   // String cancelSeat(String seatId);
}
