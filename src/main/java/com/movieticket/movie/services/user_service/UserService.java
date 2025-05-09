package com.movieticket.movie.services.user_service;

import com.movieticket.movie.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    String createUser(String userName, String email, String password);

    String updateUser(String id, String username, String email, String password);

    String deleteUser(String id);

    List<User> getAllUser();

    User getUserById(String id);


}
