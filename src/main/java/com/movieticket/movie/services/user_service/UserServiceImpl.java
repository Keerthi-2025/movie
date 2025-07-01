package com.movieticket.movie.services.user_service;


import com.movieticket.movie.mappers.UserMapper;
import com.movieticket.movie.repositories.UserRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

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
}
