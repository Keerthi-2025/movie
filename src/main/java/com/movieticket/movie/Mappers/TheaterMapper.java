package com.movieticket.movie.Mappers;

import com.movieticket.movie.models.Theater;

public class TheaterMapper {
    public Theater toTheater(String theaterId, String location, String seats){
        return Theater.builder()
                .theaterId(theaterId)
                .location(location)
                .seats(seats)
                .build();
    }
}
