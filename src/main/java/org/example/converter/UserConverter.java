package org.example.converter;

import org.example.dto.UserDTO;
import org.example.entity.User;

public class UserConverter {
    public static UserDTO convertUser(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        return  userDTO;
    }
}
