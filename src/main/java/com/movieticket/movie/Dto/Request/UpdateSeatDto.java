package com.movieticket.movie.Dto.Request;

public record UpdateSeatDto(String seatId,String seatRow, String showtimeId, String seatNumber, String seatType, String seatSection) {
}
