package com.movieticket.movie.Controllers;

import com.movieticket.movie.Dto.Request.CreateUserDto;
import com.movieticket.movie.Dto.Request.UpdateUserDto;
import com.movieticket.movie.models.Theater;
import com.movieticket.movie.models.User;
import com.movieticket.movie.services.user_service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/web/api/user")
public class UserController {
    private final UserService userService;

    UserController(UserService userService){

        this.userService = userService;
    }

    @PostMapping("/v1/create")
    public ResponseEntity<String> createUser(@RequestBody CreateUserDto data){
        String message = userService.createUser(data.username(), data.email(), data.password());
        return ResponseEntity.status(201).body(message);
    }

    @GetMapping("/v1/getAllUser")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.status(200).body(userService.getAllUser());
    }

    @GetMapping("/v1/getUserById")
    public ResponseEntity<User> getUserById(@RequestParam("UserId") String id){
        return ResponseEntity.status(200).body(userService.getUserById(id));
    }

    @PostMapping("v1/updateUser")
    public ResponseEntity<String> updateUser(@RequestBody UpdateUserDto data){
        String message = userService.updateUser(data.id(), data.username(), data.email(), data.password());
        return ResponseEntity.status(201).body(message);
    }

    @GetMapping("/v1/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam("UserId") String id){
        return ResponseEntity.status(200).body(userService.deleteUser(id));
    }






}
