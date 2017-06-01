package com.guiacinemamaneiro.guia_cinema.Model.Entities;


import java.io.Serializable;

public class Cinema implements Serializable {

    private Sala[] salas;
    private String nome;
    private String localizacao;

    //getters and setters

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
