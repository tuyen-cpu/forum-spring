package com.example.forum.service.iml;

import com.example.forum.entity.User;
import com.example.forum.model.UserDTO;
import com.example.forum.repo.UserRepo;
import com.example.forum.service.IUserService;
import com.example.forum.utils.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {
@Autowired
private UserRepo userRepo;
    @Autowired
    private UserConverter userConverter;

    @Override
    public List<UserDTO> getUsers() {
        return userRepo.findAll().stream().map(userEntity->userConverter.convertToDTO(userEntity)).collect(Collectors.toList());
    }

    @Override
    public Optional<User> getUser(String userName) {
        return userRepo.findByUserName(userName);
    }

}
