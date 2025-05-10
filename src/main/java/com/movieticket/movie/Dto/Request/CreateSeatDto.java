package com.movieticket.movie.Dto.Request;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public record CreateSeatDto(String showtimeId, String seatRow, String seatNumber, String seatType, String seatSection) {
}
