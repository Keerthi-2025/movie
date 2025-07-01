package com.movieticket.movie.services.user_service;


import com.movieticket.movie.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    String createUser(String userId, String username, String password, String email);

    List<User>getAllUsers();

    User getUserId(String userId);
}
