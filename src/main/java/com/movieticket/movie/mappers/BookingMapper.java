package com.movieticket.movie.mappers;

import com.movieticket.movie.models.Booking;

public class BookingMapper {
    public Booking toBooking(String bookingId, String bookingDate, String paymentMethod, String paymentStatus, String user,String seatAvailability, String showtime){
        return  Booking.builder()
                .bookingId(bookingId)
                .bookingDate(bookingDate)
                .paymentMethod(paymentMethod)
                .paymentStatus(paymentStatus)
                .user(user)
                .seatAvailability(seatAvailability)
                .showtime(showtime)
                .build();

    }
}
