package com.movieticket.movie.mappers;

import com.movieticket.movie.models.Seat;

public class SeatMapper {
    public Seat toSeat(String seatId, String seatRow, String seatNumber, String seatType, String seatSection,String theater, String availabilities){
        return Seat.builder()
                .seatId(seatId)
                .seatRow(seatRow)
                .seatNumber(seatNumber)
                .seatType(seatType)
                .seatSection(seatSection)
                .theater(theater)
                .availabilities(availabilities)
                .build();
    }
}
