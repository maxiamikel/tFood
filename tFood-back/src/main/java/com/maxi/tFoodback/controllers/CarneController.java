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

import com.maxi.tFoodback.domains.Carne;
import com.maxi.tFoodback.dtos.CarneDTO;
import com.maxi.tFoodback.services.CarneService;

@RestController
@RequestMapping(value = "/api/carnes")
@CrossOrigin("*")
public class CarneController {

    @Autowired
    private CarneService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Carne obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Carne>> findAll() {
        List<Carne> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody CarneDTO obj) {
        Carne carne = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).body(carne);
    }

}
