package com.movieticket.movie.Controllers;

import com.movieticket.movie.Dto.Request.CreateTheaterDto;
import com.movieticket.movie.Dto.Request.UpdateTheaterDto;
import com.movieticket.movie.Dto.Request.UpdateUserDto;
import com.movieticket.movie.models.Theater;
import com.movieticket.movie.services.theater_service.TheaterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/web/api/theater")
public class TheaterController {
    private  final TheaterService theaterService;

    public  TheaterController(TheaterService theaterService){
        this.theaterService = theaterService;
    }

    @PostMapping("/v1/createTheater")
    public ResponseEntity<String>createTheater(@RequestBody CreateTheaterDto data){
        String message = theaterService.createTheater(data.name(), data.location());
        return ResponseEntity.status(201).body(message);
    }
    @GetMapping("/v1/getAllTheaters")
    public ResponseEntity<List<Theater>>getAllTheaters(){
        return ResponseEntity.status(200).body(theaterService.getAllTheaters());
    }

    @GetMapping("/v1/getTheaterById")
    public ResponseEntity<Theater>getTheaterById(@RequestParam("TheaterId")String theaterId){
        return ResponseEntity.status(200).body(theaterService.getTheaterById(theaterId));
    }

    @PostMapping("v1/updateTheater")
    public ResponseEntity<String>updateUser(@RequestBody UpdateTheaterDto data){
        String message = theaterService.updateTheater((data.theaterId()), data.name(), data.location());
        return ResponseEntity.status(201).body(message);

    }

    @GetMapping("v1/deleteTheater")
    public  ResponseEntity<String>deleteTheater(@RequestParam("TheaterId")String theaterId){
        return ResponseEntity.status(200).body(theaterService.deleteTheater(theaterId));
    }

  @PostMapping("v1/findTheatersByLocations")
    public ResponseEntity<List<Theater>>findTheatersByLocations(@RequestParam("location") String location){
        return ResponseEntity.status(200).body(theaterService.findTheatersByLocations(location));
}
@PostMapping("v1/findTheatersByName")
    public  ResponseEntity<List<Theater>>findTheatersByName(@RequestParam("name")String name){
        return  ResponseEntity.status(200).body(theaterService.findTheatersByName(name));
}
}
