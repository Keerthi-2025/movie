package com.movieticket.movie.services.user_service;

import com.movieticket.movie.Exceptions.ApiRequestException;
import com.movieticket.movie.Mappers.UserMapper;
import com.movieticket.movie.models.User;
import com.movieticket.movie.repositories.UserRepository;
import com.movieticket.movie.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UUIDUtil uuidUtil;



    UserServiceImpl(UserRepository userRepository, UserMapper userMapper, UUIDUtil uuidUtil){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.uuidUtil = uuidUtil;
    }

    @Override
    public String createUser(String userName, String email, String password) {
        if (userRepository.existsByEmail(email)){
            throw new ApiRequestException("Email already exits ");
        }
        User user = userMapper.toUser(uuidUtil.generateUuid(), userName, email, password);
        userRepository.save(user);
        return "User Created Successfully";
    }

    @Override
    public String updateUser(String id, String username, String email, String password) {
        User user = userRepository.findById(id).orElseThrow(()->new ApiRequestException("UserId Not found"));
        user.setId(id);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
        return "User updated ";
    }

    @Override
    public String deleteUser(String id) {
        if(!userRepository.existsById(id)){
            throw new ApiRequestException("User not found");
        }
        userRepository.deleteById(id);
        return "User deleted";
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(()-> new ApiRequestException("No user ID exits"));
    }
}
