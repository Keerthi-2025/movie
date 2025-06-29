package com.movieticket.movie.repositories;

import com.movieticket.movie.models.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowtimeRepository extends JpaRepository<Showtime,String> {
}
