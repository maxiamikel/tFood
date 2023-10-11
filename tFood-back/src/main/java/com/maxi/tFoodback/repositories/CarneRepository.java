package com.maxi.tFoodback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maxi.tFoodback.domains.Carne;

public interface CarneRepository extends JpaRepository<Carne, Long> {
    @Query("SELECT c FROM Carne c")
    List<Carne> findAll();
}
