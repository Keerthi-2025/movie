package com.movieticket.movie.services.showtime_service;


import com.movieticket.movie.models.Movie;
import com.movieticket.movie.models.Theater;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public interface ShowtimeService {

    String createShowtime(String showtimeId, Movie movie, Theater theater, LocalDateTime startTime,LocalDateTime endTime);
}
