package com.movieticket.movie.Mappers;

import com.movieticket.movie.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public User toUser(String id, String username, String email, String password){
        return User.builder()
                .id(id)
                .username(username)
                .email(email)
                .password(password)
                .build();
    }
}
