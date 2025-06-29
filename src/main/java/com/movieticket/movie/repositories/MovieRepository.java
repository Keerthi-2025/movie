package com.movieticket.movie.repositories;

import com.movieticket.movie.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,String> {

}
