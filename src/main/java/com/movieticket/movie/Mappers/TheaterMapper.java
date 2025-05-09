package com.movieticket.movie.Mappers;

import com.movieticket.movie.models.Theater;
import org.springframework.stereotype.Service;

@Service
public class TheaterMapper {
    public Theater toTheater(String theaterId, String name, String location){
        return  Theater.builder()
                .theaterId(theaterId)
                .name(name)
                .location(location)
                .build();
    }
}
