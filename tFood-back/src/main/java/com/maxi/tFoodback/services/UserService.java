package com.maxi.tFoodback.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.tFoodback.domains.User;
import com.maxi.tFoodback.exceptions.ObjectNotFoundException;
import com.maxi.tFoodback.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow( () -> new ObjectNotFoundException("The "+User.class.getSimpleName()+" ID ["+id+"] is not present!"));
    }
    
}
