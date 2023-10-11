package com.maxi.tFoodback.domains;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pedidos")
public class Hamburger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String costumerName;
    private String foneNnumber;

    @Temporal(TemporalType.DATE)
    private LocalDate dataPedido;

    @Temporal(TemporalType.TIME)
    private LocalTime horaPedido;

    @ManyToOne
    @JoinColumn(name = "carne-fk")
    private Carne carne;

    @ManyToOne
    @JoinColumn(name = "pao-fk")
    private Pao pao;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Complemento> complementos;

    private String status;

    public Hamburger() {
        this.dataPedido = LocalDate.now();
        this.horaPedido = LocalTime.now();
        this.status = "Solicitado";
    }

    public Hamburger(String costumerName, String foneNnumber, Carne carne, Pao pao, List<Complemento> complementos) {
        this.costumerName = costumerName;
        this.foneNnumber = foneNnumber;
        this.carne = carne;
        this.pao = pao;
        this.complementos = complementos;
        this.status = "Solicitado";
        this.dataPedido = LocalDate.now();
        this.horaPedido = LocalTime.now();
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

    public LocalTime getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalTime horaPedido) {
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

    public void addComplementos(Complemento obj) {
        this.complementos.add(obj);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
