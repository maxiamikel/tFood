package com.maxi.tFoodback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.tFoodback.domains.Pao;
import com.maxi.tFoodback.dtos.PaoDTO;
import com.maxi.tFoodback.exceptions.ObjectNotFoundException;
import com.maxi.tFoodback.repositories.PaoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PaoService {

    @Autowired
    private PaoRepository repo;

    public Pao findById(Long id) {
        Optional<Pao> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "The " + Pao.class.getSimpleName() + " ID [" + id + "] was not found!"));
    }

    public List<Pao> findAll() {
        List<Pao> list = repo.findAll();
        return list;
    }

    public Pao create(PaoDTO obj) {

        Pao pao = new Pao(null, obj.getTipo());
        pao.setId(null);
        pao = repo.save(pao);
        return pao;
    }

}
