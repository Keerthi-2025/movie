package com.movieticket.movie.services.theater_service;


import org.springframework.stereotype.Service;

@Service
public interface TheaterService {
    String createTheater(String theaterId, String name, String location);
}
