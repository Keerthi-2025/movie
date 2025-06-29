package com.movieticket.movie.services.booking_service;


import com.movieticket.movie.mappers.BookingMapper;
import com.movieticket.movie.repositories.BookingRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

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
    public String createBooking(String bookingId, String bookingDate, String paymentMethod, String paymentStatus, String user, String seatAvailability, String showtime) {
        return "";
    }
}





