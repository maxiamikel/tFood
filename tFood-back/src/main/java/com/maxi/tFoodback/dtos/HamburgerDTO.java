package com.maxi.tFoodback.dtos;

import java.time.LocalDate;
import java.util.List;

import com.maxi.tFoodback.domains.Carne;
import com.maxi.tFoodback.domains.Complemento;
import com.maxi.tFoodback.domains.Pao;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class HamburgerDTO {

    private Long id;

    private String costumerName;
    private String foneNnumber;

    // @Temporal(TemporalType.DATE)
    private LocalDate dataPedido;

    // @Temporal(TemporalType.TIME)
    private LocalDate horaPedido;

    @OneToOne
    private Carne carne;

    @OneToOne
    private Pao pao;

    @OneToMany
    private List<Complemento> complementos;

    private String status;

    public HamburgerDTO(String costumerName, String foneNnumber, Carne carne, Pao pao, List<Complemento> complementos) {
        this.costumerName = costumerName;
        this.foneNnumber = foneNnumber;
        this.carne = carne;
        this.pao = pao;
        this.complementos = complementos;
    }

    public HamburgerDTO() {
        this.horaPedido = LocalDate.now();
        this.dataPedido = LocalDate.now();
        this.status = "Solicitado";
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getFoneNnumber() {
        return foneNnumber;
    }

    public void setFoneNnumber(String foneNnumber) {
        this.foneNnumber = foneNnumber;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalDate horaPedido) {
        this.horaPedido = horaPedido;
    }

    public Carne getCarne() {
        return carne;
    }

    public void setCarne(Carne carne) {
        this.carne = carne;
    }

    public Pao getPao() {
        return pao;
    }

    public void setPao(Pao pao) {
        this.pao = pao;
    }

    public List<Complemento> getComplementos() {
        return complementos;
    }

    public void setComplementos(List<Complemento> complementos) {
        this.complementos = complementos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }
}
