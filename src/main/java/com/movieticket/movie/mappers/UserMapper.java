package com.movieticket.movie.mappers;

import com.movieticket.movie.models.User;

public class UserMapper {
    public User toUser(String userId, String username, String password, String email, String bookings){
        return User.builder()
                .userId(userId)
                .username(username)
                .password(password)
                .bookings(bookings)
                .build();
    }
}
