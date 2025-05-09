package com.movieticket.movie.Dto.Request;

public record CreateMovieDto(String title, String genre, String duration, String rating, String poster) {
}
