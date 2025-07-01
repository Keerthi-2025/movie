package com.movieticket.movie.services.theater_service;


import com.movieticket.movie.mappers.TheaterMapper;
import com.movieticket.movie.models.Theater;
import com.movieticket.movie.repositories.TheaterRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterServiceImpl implements TheaterService{
    private final TheaterRepository theaterRepository;
    private final TheaterMapper theaterMapper;
    private final UUIDUtil uuidUtil;

    public TheaterServiceImpl(TheaterRepository theaterRepository,TheaterMapper theaterMapper, UUIDUtil uuidUtil){
        this.theaterRepository = theaterRepository;
        this.theaterMapper = theaterMapper;
        this.uuidUtil = uuidUtil;
    }


    @Override
    public String createTheater(String theaterId, String name, String location) {
        Theater theater = theaterMapper.toTheater(theaterId,name,location);
        theaterRepository.save(theater);
        return "Theater created";
    }

    @Override
    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }
}
