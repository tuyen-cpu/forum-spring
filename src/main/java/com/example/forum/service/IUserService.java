package com.example.forum.service;

import com.example.forum.entity.User;
import com.example.forum.model.UserDTO;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<UserDTO> getUsers();
Optional<User> getUser(String userName);
}
