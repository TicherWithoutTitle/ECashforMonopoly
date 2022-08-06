package com.ticher.ecashformonopoly.Entidad;

public class Banquero {
    @SuppressWarnings("FieldMayBeFinal")
    private Jugador[] listaJugadores=new Jugador[8];
    @SuppressWarnings("FieldMayBeFinal")
    private int numeroDeJugadores;

    public Banquero(int n) {
        this.numeroDeJugadores = n;
    }
    public int dioLaVuelta(int i){
        listaJugadores[i].setPlata(listaJugadores[i].getPlata()+200);
        return 0;
    }
    public int transaccion(int i,int k,int monto){
        int rtr=0;
        listaJugadores[k].setPlata(listaJugadores[k].getPlata()-monto);
        listaJugadores[i].setPlata(listaJugadores[i].getPlata()+monto);
        if(listaJugadores[k].getPlata()<0){
            rtr=1;
        }
        return rtr;
    }

    public String getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(Jugador nombre, int i) {
        this.listaJugadores[i] = nombre;
    }
    public void setNombre(String nombre,int i){
        listaJugadores[i].setNombre(nombre);
    }
}
