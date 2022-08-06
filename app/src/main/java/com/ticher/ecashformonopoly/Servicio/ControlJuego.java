package com.ticher.ecashformonopoly.Servicio;

import com.ticher.ecashformonopoly.Entidad.Banquero;
import com.ticher.ecashformonopoly.Entidad.Jugador;

public class ControlJuego {
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador jugador1= new Jugador(1500,1);
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador jugador2= new Jugador(1500,2);
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador jugador3= new Jugador(1500,3);
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador jugador4= new Jugador(1500,4);
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador jugador5= new Jugador(1500,5);
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador jugador6= new Jugador(1500,6);
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador jugador7= new Jugador(1500,7);
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador jugador8= new Jugador(1500,8);
    public Banquero banquero= new Banquero(8);
    public void crearJuego(){
        banquero.setListaJugadores(jugador1, 0);
        banquero.setListaJugadores(jugador2, 1);
        banquero.setListaJugadores(jugador3, 2);
        banquero.setListaJugadores(jugador4, 3);
        banquero.setListaJugadores(jugador5, 4);
        banquero.setListaJugadores(jugador6, 5);
        banquero.setListaJugadores(jugador7, 6);
        banquero.setListaJugadores(jugador8, 7);
    }
    public void crearJugador(String nombre, int n){
        banquero.setNombre(nombre,n);
    }
}
