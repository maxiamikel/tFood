package com.maxi.tFoodback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.tFoodback.domains.User;
import com.maxi.tFoodback.services.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    @Autowired
    private UserService usertService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        User obj = usertService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}
