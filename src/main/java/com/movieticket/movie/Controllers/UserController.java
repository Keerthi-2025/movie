package com.movieticket.movie.Controllers;


import com.movieticket.movie.Dto.Request.CreateTheaterDto;
import com.movieticket.movie.Dto.Request.CreateUserDto;
import com.movieticket.movie.models.Theater;
import com.movieticket.movie.models.User;
import com.movieticket.movie.services.user_service.UserService;
import com.movieticket.movie.services.user_service.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/web/api/User")

public class UserController {
    private  final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/v1/createUser")
    public ResponseEntity<String> createUser(@RequestBody CreateUserDto data) {
        String message = userService.createUser(data.userId(), data.username(), data.password(), data.email());
        return ResponseEntity.status(201).body(message);
    }

    @GetMapping("/v1/getAllUsers")
    ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.status(200).body(userService.getAllUsers());
    }

    @GetMapping("/v1/getUserId")
    ResponseEntity<User>getUserId(@RequestParam ("userId")String userId){
        return ResponseEntity.status(200).body(userService.getUserId(userId));
    }

}
