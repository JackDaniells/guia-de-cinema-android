package com.guiacinemamaneiro.guia_cinema.Model.Entities;

import java.io.Serializable;

public class Filme implements Serializable {

    //título original, diretor, elenco, pôster do filme, sinopse, duração, salas e horários das sessões, se é dublado ou legendado,

    private String titulo;
    private String diretor;
    private String[] elenco;
    private String poster;
    private String sinopse;
    private int duracao;
    private boolean legendado;
    private String trailer;
    private String genero;
    private boolean favorito;

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Filme(){}

    public Filme(String titulo, String diretor, String[] elenco, String poster, String sinopse, int duracao, boolean legendado, String trailer, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.poster = poster;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.legendado = legendado;
        this.trailer = trailer;
        this.genero = genero;
        this.favorito = false;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //getters and setters

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public boolean isLegendado() {
        return legendado;
    }

    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    @Override
    public String toString() {
        return getTitulo() + "\n" + getGenero();
    }
}
