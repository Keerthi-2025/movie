package com.movieticket.movie.mappers;
import com.movieticket.movie.models.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service

public class BookingMapper {
    public Booking toBooking(String bookingId,LocalDateTime  bookingDate,PaymentMethod  paymentMethod, PaymentStatus paymentStatus, User user, SeatAvailability seatAvailability, Showtime showtime) {
        return Booking.builder()
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
