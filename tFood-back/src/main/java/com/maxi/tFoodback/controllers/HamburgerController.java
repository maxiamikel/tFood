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

import com.maxi.tFoodback.domains.Hamburger;
import com.maxi.tFoodback.dtos.HamburgerDTO;
import com.maxi.tFoodback.services.HamburgerService;

@RestController
@RequestMapping(value = "/api/hamburgers")
@CrossOrigin("*")
public class HamburgerController {

    @Autowired
    private HamburgerService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Hamburger obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Hamburger>> findAll() {
        List<Hamburger> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody HamburgerDTO obj) {
        Hamburger hamburger = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).body(hamburger);
    }
}
