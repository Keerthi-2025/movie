package com.movieticket.movie.repositories;

import com.movieticket.movie.models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheaterRepository extends JpaRepository<Theater, String> {



}
