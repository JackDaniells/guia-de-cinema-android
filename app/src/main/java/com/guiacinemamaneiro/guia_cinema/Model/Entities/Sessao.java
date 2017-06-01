package com.guiacinemamaneiro.guia_cinema.Model.Entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;


public class Sessao implements Serializable {

    private Date data;
    private Time hora;
    private Filme filmeExibido;
    private int precoEntrada;


    //getters and setters

    public int getPrecoEntrada() {
        return precoEntrada;
    }

    public void setPrecoEntrada(int precoEntrada) {
        this.precoEntrada = precoEntrada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Filme getFilmeExibido() {
        return filmeExibido;
    }

    public void setFilmeExibido(Filme filmeExibido) {
        this.filmeExibido = filmeExibido;
    }
}
