package com.maxi.tFoodback.domains;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The name can't be blank")
    private String nome;
    @NotBlank(message = "The emais is required")
    private String email;
    @NotBlank(message = "The telephone is required")
    private String telefone;
    @NotBlank(message = "The CPF is required")
    private String cpf;
    @NotBlank(message = "The burthday is required")
    private LocalDate burthday;
    private boolean active=true;

    public User() {
    }

    public User(Long id, String nome, String email, String telefone, String cpf, LocalDate burthday) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.burthday = burthday;
        this.active = !active;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBurthday() {
        return burthday;
    }

    public void setBurthday(LocalDate burthday) {
        this.burthday = burthday;
    }

    public boolean isActive() {
        return active;
    }

    public boolean activate(){
        return this.active = true;
    }

    public boolean desactivate(){
        return !activate();
    }

}
