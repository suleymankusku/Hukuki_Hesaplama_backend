package com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.controller;

import com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.model.SystemUser;
import com.tr.edu.trakya.ssuleymankusku.hukukiHesaplama.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/User/userGetAll")

    public Iterable<SystemUser> getAll(){
        return userRepository.findAll();
    }

    @PostMapping("api/systemUser/saveUser")
    public Long saveUser (@RequestBody SystemUser systemUser){
        userRepository.save(systemUser);
        return 1L;
    }
}
