package com.maxi.tFoodback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.tFoodback.domains.Hamburger;
import com.maxi.tFoodback.dtos.HamburgerDTO;
import com.maxi.tFoodback.exceptions.ObjectNotFoundException;
import com.maxi.tFoodback.repositories.HambuegerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HamburgerService {

    @Autowired
    private HambuegerRepository repo;

    public Hamburger findById(Long id) {
        Optional<Hamburger> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "The " + Hamburger.class.getSimpleName() + " ID [" + id + "] was not found!"));
    }

    public List<Hamburger> findAll() {
        List<Hamburger> list = repo.findAll();
        return list;
    }

    public Hamburger create(HamburgerDTO obj) {

        Hamburger hamburger = new Hamburger(obj.getCostumerName(), obj.getFoneNnumber(), obj.getCarne(), obj.getPao(),
                obj.getComplementos());
        hamburger.setId(null);
        hamburger = repo.save(hamburger);
        return hamburger;
    }
}
