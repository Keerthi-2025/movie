package com.movieticket.movie.services.showtime_service;


import com.movieticket.movie.mappers.ShowtimeMapper;
import com.movieticket.movie.repositories.ShowtimeRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

@Service
public class ShowtimeServiceImpl implements ShowtimeService{
    private final ShowtimeRepository showtimeRepository;
    private final ShowtimeMapper showtimeMapper;
    private final UUIDUtil uuidUtil;

    public ShowtimeServiceImpl(ShowtimeRepository showtimeRepository, ShowtimeMapper showtimeMapper,UUIDUtil uuidUtil){
        this.showtimeRepository = showtimeRepository;
        this.showtimeMapper =  showtimeMapper;
        this.uuidUtil = uuidUtil;
    }
}
