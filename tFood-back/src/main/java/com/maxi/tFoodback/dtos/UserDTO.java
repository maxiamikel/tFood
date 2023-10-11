package com.maxi.tFoodback.dtos;

import java.time.LocalDate;

import com.maxi.tFoodback.domains.User;

public class UserDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private LocalDate burthday;
    private boolean active = true;

    public UserDTO() {
    }

    public UserDTO(User obj) {
        this.nome = obj.getNome();
        this.email = obj.getEmail();
        this.telefone = obj.getTelefone();
        this.cpf = obj.getCpf();
        this.burthday = obj.getBurthday();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public void setActive(boolean active) {
        this.active = active;
    }

}
