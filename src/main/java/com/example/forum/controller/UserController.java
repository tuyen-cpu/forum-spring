package com.example.forum.controller;

import com.example.forum.entity.User;
import com.example.forum.model.ResponseObject;
import com.example.forum.model.UserDTO;
import com.example.forum.repo.UserRepo;
import com.example.forum.service.IUserService;
import com.example.forum.utils.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private UserConverter userConverter;
    @GetMapping("/all")
    public List<UserDTO> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/login")
    public ResponseEntity<ResponseObject> Login(@RequestParam() String userName,
                                                @RequestParam() String password){
        try{
            User user = userService.getUser(userName).get();
            if(!user.getPassword().equals(password)){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("failed","Mật khẩu không chính xác!",""));
            }else{
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("success","Login success",userConverter.convertToDTO(user)));
            }
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("Failed","Tài khoản không tồn tại",""));
        }


    }

}
