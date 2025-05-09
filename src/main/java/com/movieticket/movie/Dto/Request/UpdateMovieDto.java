package com.movieticket.movie.Dto.Request;

public record UpdateMovieDto(String movieId, String title,String genre, String duration, String rating, String poster) {
}
