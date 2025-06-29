package com.movieticket.movie.mappers;

import com.movieticket.movie.models.Seat;
import com.movieticket.movie.models.SeatAvailability;

public class SeatAvailabilityMapper {
    public SeatAvailability toSeatAvailbility(String seatAvailid, String seat, boolean available, String showtime){
        return Seat.builder()
                .seatAvailId(seatAvailid)
                .seat(seat)
                .available(available)
                .showtime(showtime)
                .build();
    }
}
