package com.maxi.tFoodback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.tFoodback.domains.User;
import com.maxi.tFoodback.dtos.UserDTO;
import com.maxi.tFoodback.exceptions.ObjectNotFoundException;
import com.maxi.tFoodback.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "The " + User.class.getSimpleName() + " ID [" + id + "] was not found!"));
    }

    public List<User> findAll() {
        List<User> list = userRepository.findAll();
        return list;
    }

    public User create(UserDTO obj) {
        /*
         * Product newProduct = new Product(null, obj.getName(),obj.getStock(),
         * obj.getPrice());
         * newProduct.setId(null);
         * newProduct = productRepository.save(newProduct);
         */
        User user = new User(null, obj.getNome(), obj.getEmail(), obj.getTelefone(), obj.getCpf(), obj.getBurthday());
        user.setId(null);
        user = userRepository.save(user);
        return user;
    }

}
