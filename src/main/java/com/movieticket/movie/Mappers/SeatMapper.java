package com.movieticket.movie.Mappers;

import com.movieticket.movie.models.Seat;
import org.springframework.stereotype.Service;

@Service
public class SeatMapper {
    public  Seat toSeat(String seatId, String showtimeId, String seatRow, String seatNumber, String seatAvail, String seatType, String seatSection){
        return Seat.builder()
        .seatId(seatId)
        .showtimeId(showtimeId)
        .seatRow(seatRow)
        .seatNumber(seatNumber)
        .seatType(seatType)
        .seatSection(seatSection)
        .build();

    }

}
