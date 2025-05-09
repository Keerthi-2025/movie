package com.movieticket.movie.repositories;

import com.movieticket.movie.models.Booking;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  BookingRepository extends JpaRepository<Booking, String> {

}
