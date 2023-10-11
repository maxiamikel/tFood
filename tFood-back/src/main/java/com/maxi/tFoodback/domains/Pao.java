package com.maxi.tFoodback.domains;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "paes")
public class Pao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    @OneToMany(mappedBy = "pao", fetch = FetchType.LAZY)
    private List<Hamburger> hamburgers;

    public Pao() {
    }

    public Pao(String tipo) {
        this.tipo = tipo;
    }

    public Pao(Long id, String tipo) {
        this.tipo = tipo;
        this.id = id;
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
