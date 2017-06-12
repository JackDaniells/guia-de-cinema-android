package com.guiacinemamaneiro.guia_cinema.Model.Entities;


import java.io.Serializable;

public class Cinema implements Serializable {

    private Sala[] salas;
    private String nome;
    private double latitude;
    private double longitude;
    private String foto;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Cinema(String nome, double latitude, double longitude){

        this.nome = nome;

        this.latitude = latitude;

        this.longitude = longitude;

    }

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

}
