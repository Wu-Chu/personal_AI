package org.example.service;

import org.example.dto.UserDTO;
import org.example.entity.User;

public interface UserService {
    public UserDTO getUserById(long id);
}
