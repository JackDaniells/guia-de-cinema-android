package com.guiacinemamaneiro.guia_cinema.Model.Entities;


import java.io.Serializable;

public class Usuario implements Serializable {

    private String nome;
    private String endereco;
    private String login;
    private String senha;
    private Filme[] favoritos;


    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Filme[] getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Filme[] favoritos) {
        this.favoritos = favoritos;
    }
}
