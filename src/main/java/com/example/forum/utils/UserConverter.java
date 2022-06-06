package com.example.forum.utils;

import com.example.forum.entity.User;
import com.example.forum.model.UserDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserConverter {
  public UserDTO convertToDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
       userDTO.setUserName(user.getUserName());
       userDTO.setEmail(user.getEmail());
       userDTO.setJoinDate(user.getJoinDate());
       return userDTO;
    }
}
