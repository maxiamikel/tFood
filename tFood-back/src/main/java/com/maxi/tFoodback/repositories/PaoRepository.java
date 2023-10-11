package com.maxi.tFoodback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maxi.tFoodback.domains.Pao;

public interface PaoRepository extends JpaRepository<Pao, Long> {
    @Query("SELECT p FROM Pao p")
    List<Pao> findAll();
}
