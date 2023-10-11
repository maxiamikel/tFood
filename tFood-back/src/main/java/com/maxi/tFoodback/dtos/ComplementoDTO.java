package com.maxi.tFoodback.dtos;

public class ComplementoDTO {
    private Long id;

    private String tipo;

    public ComplementoDTO() {
    }

    public ComplementoDTO(String tipo) {
        this.tipo = tipo;
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
