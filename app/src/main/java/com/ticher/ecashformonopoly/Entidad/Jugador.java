package com.ticher.ecashformonopoly.Entidad;

public class Jugador {
    private int plata;
    private int numeroDeJugador;
    private String nombre;

    public Jugador() {
        this.plata = 1500;
    }

    public Jugador(int plata, int numeroDeJugador) {
        //this.nombre = nombre;
        this.plata = plata;
        this.numeroDeJugador = numeroDeJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getNumeroDeJugador() {
        return numeroDeJugador;
    }

    public void setNumeroDeJugador(int numeroDeJugador) {
        this.numeroDeJugador = numeroDeJugador;
    }

}

