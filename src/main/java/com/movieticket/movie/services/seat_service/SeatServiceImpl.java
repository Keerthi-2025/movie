package com.movieticket.movie.services.seat_service;


import com.movieticket.movie.Mappers.SeatMapper;
import com.movieticket.movie.repositories.SeatRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

@Service
public class SeatServiceImpl implements SeatService{
    private final SeatRepository seatRepository;
    private  final SeatMapper seatMapper;
    private  final UUIDUtil uuidUtil;

    public  SeatServiceImpl(SeatRepository seatRepository, SeatMapper seatMapper, UUIDUtil uuidUtil){
        this.seatRepository = seatRepository;
        this.seatMapper = seatMapper;
        this.uuidUtil = uuidUtil;
    }


}
