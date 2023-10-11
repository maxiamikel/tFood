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

import com.maxi.tFoodback.domains.Pao;
import com.maxi.tFoodback.dtos.PaoDTO;
import com.maxi.tFoodback.services.PaoService;

@RestController
@RequestMapping(value = "/api/paes")
@CrossOrigin("*")
public class PaoController {

    @Autowired
    private PaoService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Pao obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Pao>> findAll() {
        List<Pao> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody PaoDTO obj) {
        Pao pao = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).body(pao);
    }
}
