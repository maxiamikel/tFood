package com.maxi.tFoodback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maxi.tFoodback.domains.Complemento;

public interface ComplementoRepository extends JpaRepository<Complemento, Long> {
    @Query("SELECT c FROM Complemento c")
    List<Complemento> findAll();
}
