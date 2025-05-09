package com.movieticket.movie.Dto.Request;

import com.movieticket.movie.models.PaymentMethod;
import com.movieticket.movie.models.User;

import java.time.LocalDateTime;

public record CreateBookingDto(String showtimeId, String seatId, LocalDateTime bookingDate, String paymentStatus, PaymentMethod paymentMethod) {
}
