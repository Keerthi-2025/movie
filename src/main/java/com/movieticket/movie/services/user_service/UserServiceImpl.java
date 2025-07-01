package com.movieticket.movie.services.user_service;


import com.movieticket.movie.Exceptions.ApiRequestException;
import com.movieticket.movie.mappers.UserMapper;
import com.movieticket.movie.models.User;
import com.movieticket.movie.repositories.UserRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements  UserService{
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UUIDUtil uuidUtil;

    private UserServiceImpl(UserRepository userRepository, UserMapper userMapper, UUIDUtil uuidUtil){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.uuidUtil = uuidUtil;
    }

    @Override
    public String createUser(String userId, String username, String password, String email) {
        User user = userMapper.toUser(userId,username,password,email);
        userRepository.save(user);
        return "User Created";
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserId(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ApiRequestException("User ID does not exists"));
    }
}
