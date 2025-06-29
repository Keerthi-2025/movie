package com.movieticket.movie.Mappers;

import com.movieticket.movie.models.Showtime;

public class ShowtimeMapper {
    public Showtime toShowtime(String showtimeId, String movie, String theater, String startTime, String endTime, String seatAvailabilities ){
        return Showtime.builder()
                .showtimeId(showtimeId)
                .movie(movie)
                .theater(theater)
                .startTime(startTime)
                .endTime(endTime)
                .seatAvailabilities(seatAvailabilities)
    }



}
