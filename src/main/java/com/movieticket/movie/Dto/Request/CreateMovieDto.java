package com.movieticket.movie.Dto.Request;

import com.movieticket.movie.models.Genre;

public record CreateMovieDto(String movieId, String title, Genre genre, String duration, String rating, String poster) {
}
