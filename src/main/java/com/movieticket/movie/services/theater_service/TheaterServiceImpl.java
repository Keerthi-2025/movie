package com.movieticket.movie.services.theater_service;


import com.movieticket.movie.Exceptions.ApiRequestException;
import com.movieticket.movie.Mappers.TheaterMapper;
import com.movieticket.movie.models.Theater;
import com.movieticket.movie.repositories.TheaterRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterServiceImpl implements TheaterService{
    private final TheaterRepository theaterRepository;
    private  final TheaterMapper theaterMapper;
    private  final UUIDUtil uuidUtil;

    public  TheaterServiceImpl(TheaterRepository theaterRepository, TheaterMapper theaterMapper, UUIDUtil uuidUtil){
        this.theaterRepository = theaterRepository;
        this.theaterMapper = theaterMapper;
        this.uuidUtil = uuidUtil;
    }

    @Override
    public String createTheater(String name, String location) {
        Theater theater = theaterMapper.toTheater(uuidUtil.generateUuid(), name,location);
        theaterRepository.save(theater);
        return "Theater created";
    }

    @Override
    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    @Override
    public Theater getTheaterById(String theaterId) {
        return theaterRepository.findById(theaterId).orElseThrow(()->new ApiRequestException("No theaterId exists"));
    }

    @Override
    public String deleteTheater(String theaterId) {
        if (!theaterRepository.existsById(theaterId)){
            throw new ApiRequestException("Theater not found");
        }
        theaterRepository.deleteById(theaterId);
        return "Theater deleted";
    }

    @Override
    public String updateTheater(String theaterId, String name, String location) {
        Theater theater = theaterRepository.findById(theaterId).orElseThrow(()->new ApiRequestException("Theater not found"));
        theater.setTheaterId(theaterId);
        theater.setName(name);
        theater.setLocation(location);
        theaterRepository.save(theater);
        return "Theater Updated";
    }

    @Override
    public List<Theater>findTheatersByLocations(String location) {
        List<Theater>theaters = theaterRepository.findByLocationIgnoreCase(location);
        if (theaters.isEmpty()){
            throw new ApiRequestException("No theaters are found in the specified location");
        }
        return theaters;
    }

    @Override
    public List<Theater> findTheatersByName(String name) {
        List<Theater>theaters = theaterRepository.findByNameIgnoreCase(name);
        if ((theaters.isEmpty())){
            throw new ApiRequestException("No theaters found in this name");
        }
        return theaters;
    }
}
