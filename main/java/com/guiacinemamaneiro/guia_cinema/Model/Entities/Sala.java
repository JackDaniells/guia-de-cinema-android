package com.guiacinemamaneiro.guia_cinema.Model.Entities;

import java.io.Serializable;

public class Sala implements Serializable {

    private Sessao[] sessoes;
    private String numSala;
    private int qtdeAssentos;
    private int tipoSala;

    //getters and setters
    public Sessao[] getSessoes() {
        return sessoes;
    }

    public void setSessoes(Sessao[] sessoes) {
        this.sessoes = sessoes;
    }

    public String getNumSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }

    public int getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(int tipoSala) {
        this.tipoSala = tipoSala;
    }

    public int getQtdeAssentos() {
        return qtdeAssentos;
    }

    public void setQtdeAssentos(int qtdeAssentos) {
        this.qtdeAssentos = qtdeAssentos;
    }
}
