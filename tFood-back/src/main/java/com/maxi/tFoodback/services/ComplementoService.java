package com.maxi.tFoodback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.tFoodback.domains.Complemento;
import com.maxi.tFoodback.dtos.ComplementoDTO;
import com.maxi.tFoodback.exceptions.ObjectNotFoundException;
import com.maxi.tFoodback.repositories.ComplementoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ComplementoService {

    @Autowired
    private ComplementoRepository repo;

    public Complemento findById(Long id) {
        Optional<Complemento> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "The " + Complemento.class.getSimpleName() + " ID [" + id + "] was not found!"));
    }

    public List<Complemento> findAll() {
        List<Complemento> list = repo.findAll();
        return list;
    }

    public Complemento create(ComplementoDTO obj) {

        Complemento complemento = new Complemento(obj.getTipo());
        complemento.setId(null);
        complemento = repo.save(complemento);
        return complemento;
    }

}
