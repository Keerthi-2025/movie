package com.movieticket.movie.services.seat_service;


import com.movieticket.movie.Exceptions.ApiRequestException;
import com.movieticket.movie.Mappers.SeatMapper;
import com.movieticket.movie.models.Seat;
import com.movieticket.movie.repositories.SeatRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    private final SeatRepository seatRepository;
    private final SeatMapper seatMapper;
    private  final  UUIDUtil uuidUtil;

    public  SeatServiceImpl(SeatRepository seatRepository, SeatMapper seatMapper, UUIDUtil uuidUtil){
        this.seatRepository = seatRepository;
        this.seatMapper = seatMapper;
        this.uuidUtil = uuidUtil;
    }

    @Override
    public String createSeat(String showtimeId, String seatRow, String seatNumber, String seatType, String seatSection) {
        Seat seat = seatMapper.toSeat(uuidUtil.generateUuid(), showtimeId, seatRow, seatNumber, seatType, seatSection);
        seatRepository.save(seat);
        return "seat created";
    }

    @Override
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public Seat getSeatById(String seatId) {
        return seatRepository.findById(seatId).orElseThrow(()-> new ApiRequestException("No seat found By this SeatId"));
    }

    @Override
    public String deleteSeat(String seatId) {
        if (!seatRepository.existsById(seatId)){
            throw  new ApiRequestException("Seat not found");
        }
        seatRepository.deleteById(seatId);
        return "seat deleted";
    }

    @Override
    public String updateSeat(String seatId, String showtimeId, String seatRow, String seatNumber, String seatType, String seatSection) {
        Seat seat = seatRepository.findById(seatId).orElseThrow(()-> new ApiRequestException("Seat not found"));
        seat.setSeatId(seatId);
        seat.setShowtimeId(showtimeId);
        seat.setSeatRow(seatRow);
        seat.setSeatNumber(seatNumber);
        seat.setSeatType(seatType);
        seat.setSeatSection(seatSection);
        seatRepository.save(seat);
        return "seat updated";
    }







}


