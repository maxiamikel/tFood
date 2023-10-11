package com.maxi.tFoodback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.tFoodback.domains.Carne;
import com.maxi.tFoodback.dtos.CarneDTO;
import com.maxi.tFoodback.exceptions.ObjectNotFoundException;
import com.maxi.tFoodback.repositories.CarneRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CarneService {

    @Autowired
    private CarneRepository repo;

    public Carne findById(Long id) {
        Optional<Carne> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "The " + Carne.class.getSimpleName() + " ID [" + id + "] was not found!"));
    }

    public List<Carne> findAll() {
        List<Carne> list = repo.findAll();
        return list;
    }

    public Carne create(CarneDTO obj) {

        Carne carne = new Carne(null, obj.getTipo());
        carne.setId(null);
        carne = repo.save(carne);
        return carne;
    }

}
