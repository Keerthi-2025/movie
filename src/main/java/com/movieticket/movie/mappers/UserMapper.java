package com.movieticket.movie.mappers;

import com.movieticket.movie.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapper {

    public User toUser(String userId, String username, String password, String email){
        return User.builder()
                .userId(userId)
                .username(username)
                .password(password)
                .email(email)
                .build();
    }


}