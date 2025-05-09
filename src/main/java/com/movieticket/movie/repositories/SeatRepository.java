package com.movieticket.movie.repositories;

import com.movieticket.movie.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat,String>{
}
