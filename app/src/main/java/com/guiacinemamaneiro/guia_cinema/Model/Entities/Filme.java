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
}
