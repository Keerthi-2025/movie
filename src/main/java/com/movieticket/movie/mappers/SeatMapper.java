package com.movieticket.movie.mappers;

import com.movieticket.movie.models.Seat;
import com.movieticket.movie.models.SeatAvailability;
import com.movieticket.movie.models.Theater;
import org.springframework.stereotype.Service;

@Service
public class SeatMapper {

    public Seat toSeat(String seatId, String seatRow, String seatNumber, String seatType, String seatSection, Theater theater){
        return Seat.builder()
                .seatId(seatId)
                .seatRow(seatRow)
                .seatNumber(seatNumber)
                .seatType(seatType)
                .seatSection(seatSection)
                .theater(theater)
                //.availabilities(availabilities)
                .build();
    }


}
