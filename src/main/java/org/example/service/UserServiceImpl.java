package org.example.service;

import org.example.converter.UserConverter;
import org.example.dto.UserDTO;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO getUserById(long id){
        User user =  userRepository.findById(id).orElseThrow(RuntimeException::new);
        return UserConverter.convertUser(user);
    }

}
