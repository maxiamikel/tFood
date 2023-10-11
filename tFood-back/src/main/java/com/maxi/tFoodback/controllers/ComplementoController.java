package com.maxi.tFoodback.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.maxi.tFoodback.domains.Complemento;
import com.maxi.tFoodback.dtos.ComplementoDTO;
import com.maxi.tFoodback.services.ComplementoService;

@RestController
@RequestMapping(value = "/api/complementos")
@CrossOrigin("*")
public class ComplementoController {

    @Autowired
    private ComplementoService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Complemento obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Complemento>> findAll() {
        List<Complemento> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody ComplementoDTO obj) {
        Complemento complemento = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).body(complemento);
    }

}
