package com.movieticket.movie.mappers;

import com.movieticket.movie.models.Movie;
import com.movieticket.movie.models.Showtime;
import com.movieticket.movie.models.Theater;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class ShowtimeMapper {

public Showtime toShowtime(String showtimeId, Movie movie, Theater theater, LocalDateTime startTime,LocalDateTime endTime){
    return Showtime.builder()
            .showtimeId(showtimeId)
            .movie(movie)
            .theater(theater)
            .startTime(startTime)
            .endTime(endTime)
            .build();
}
}