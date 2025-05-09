package com.movieticket.movie.services.booking_service;


import com.movieticket.movie.Exceptions.ApiRequestException;
import com.movieticket.movie.Mappers.BookingMapper;
import com.movieticket.movie.models.Booking;
import com.movieticket.movie.models.PaymentMethod;
import com.movieticket.movie.models.User;
import com.movieticket.movie.repositories.BookingRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private  final BookingMapper bookingMapper;
    private  final UUIDUtil uuidUtil;

    public  BookingServiceImpl(BookingRepository bookingRepository, BookingMapper bookingMapper, UUIDUtil uuidUtil){
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
        this.uuidUtil = uuidUtil;
    }

      @Override
    public String createBooking(String showtimeId, String seatId, LocalDateTime bookingDate, String paymentStatus, PaymentMethod paymentMethod) {
        Booking booking = bookingMapper.toBooking(uuidUtil.generateUuid(), showtimeId, seatId, bookingDate, paymentStatus, paymentMethod);
        bookingRepository.save(booking);
        return "Booking Created";
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(String bookId) {
        return bookingRepository.findById(bookId).orElseThrow(()->new ApiRequestException("Booking ID Invalid"));
    }
}
