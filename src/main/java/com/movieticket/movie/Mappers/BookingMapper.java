package com.movieticket.movie.Mappers;

import com.movieticket.movie.models.Booking;

import java.awt.print.Book;

public class BookingMapper {
    public Booking toBooking(String bookingId, String paymentMethod, String paymentStatus, String user,String seatAvailability, String showtime){
        return Booking.builer()
                .bookingId(bookingId)
                .payementMethod(paymentMethod)
                .paymentStatus(paymentStatus)
                .user(user)
                .seatAvailability(seatAvailability)
                .showtime(showtime)
                .build();

    }
}
