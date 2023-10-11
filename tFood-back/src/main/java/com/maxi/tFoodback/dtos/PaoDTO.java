package com.maxi.tFoodback.dtos;

import com.maxi.tFoodback.domains.Pao;

public class PaoDTO {

    private Long id;

    private String tipo;

    public PaoDTO() {
    }

    public PaoDTO(Pao obj) {
        this.tipo = obj.getTipo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
