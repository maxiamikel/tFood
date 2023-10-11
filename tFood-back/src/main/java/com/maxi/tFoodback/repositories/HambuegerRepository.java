package com.maxi.tFoodback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maxi.tFoodback.domains.Hamburger;

public interface HambuegerRepository extends JpaRepository<Hamburger, Long> {
    @Query("SELECT h FROM Hamburger h")
    List<Hamburger> findAll();
}

/*
 * @GetMapping(value = "/{id}")
 * public ResponseEntity<SaleDTO> findSaleById(@PathVariable Long id)
 * throws ResourceNotFoundException {
 * SaleDTO saleDto = saleService.findById(id)
 * .orElseThrow(() -> new
 * ResourceNotFoundException("Não foi encontrado uma venda com id: " + id));
 * return ResponseEntity.ok().body(saleDto);
 * }
 * public Optional<SaleDTO> findById(long id) {
 * return saletRepository.findById(id)
 * .map(sale -> modelMapper.map(sale, SaleDTO.class));
 * }
 */