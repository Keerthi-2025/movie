package com.movieticket.movie.services.showtime_service;


import com.movieticket.movie.models.Movie;
import com.movieticket.movie.models.Showtime;
import com.movieticket.movie.models.Theater;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface ShowtimeService {

    String createShowtime(String showtimeId, Movie movieId, Theater theaterId, LocalDateTime startTime,LocalDateTime endTime);

    List<Showtime>getAllShowtimes();

    Showtime getShowtimeId(String showtimeId);
}
