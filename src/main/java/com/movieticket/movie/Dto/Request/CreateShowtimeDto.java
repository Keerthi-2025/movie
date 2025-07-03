package com.movieticket.movie.Dto.Request;

import com.movieticket.movie.models.Movie;
import com.movieticket.movie.models.Theater;

import java.time.LocalDateTime;

public record CreateShowtimeDto(String showtimeId, Movie movieId, Theater theaterId, LocalDateTime startTime, LocalDateTime endTime) {
}
