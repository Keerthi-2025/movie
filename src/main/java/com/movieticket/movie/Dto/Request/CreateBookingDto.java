package com.movieticket.movie.Dto.Request;

public record CreateBookingDto(String bookingId, String bookingDate, String paymentMethod, String paymentStatus, String user, String seatAvailability, String showtime)  {



}
