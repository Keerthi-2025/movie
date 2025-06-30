package com.movieticket.movie.services.booking_service;


import com.movieticket.movie.Exceptions.ApiRequestException;
import com.movieticket.movie.mappers.BookingMapper;
import com.movieticket.movie.models.*;
import com.movieticket.movie.repositories.BookingRepository;
import com.movieticket.movie.utils.UUIDUtil;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;
    private final UUIDUtil uuidUtil;


    public BookingServiceImpl(BookingRepository bookingRepository, BookingMapper bookingMapper, UUIDUtil uuidUtil) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
        this.uuidUtil = uuidUtil;
    }


    @Override
    public String createBooking(String bookingId, String bookingDate, PaymentMethod paymentMethod, PaymentStatus paymentStatus, User user, SeatAvailability seatAvailability, Showtime showtime) {

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime BookingDate = LocalDateTime.parse(bookingDate, formatter);

        Booking booking = bookingMapper.toBooking(uuidUtil.generateUuid(),BookingDate, paymentMethod, paymentStatus, user, showtime, seatAvailability);
        bookingRepository.save(booking);
        return "Booking Created";

    }


    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingId(String bookingId) {
        return bookingRepository.findById(bookingId).orElseThrow(()-> new ApiRequestException("Invalid Booking Id"));}
}






