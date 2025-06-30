package com.movieticket.movie.Dto.Request;

import com.movieticket.movie.models.Theater;

public record CreateSeatDto(String seatId, String seatRow, String seatNumber, String seatType, String seatSection, Theater theater) {
}
