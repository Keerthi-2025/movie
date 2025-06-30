package com.movieticket.movie.Dto.Request;

import com.movieticket.movie.models.*;

public record CreateBookingDto(String bookingId, String bookingDate, PaymentMethod paymentMethod, PaymentStatus paymentStatus, User user, SeatAvailability seatAvailability, Showtime showtime)  {



}
