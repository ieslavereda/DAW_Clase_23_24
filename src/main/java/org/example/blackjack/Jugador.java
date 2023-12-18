package org.example.blackjack;

public class Jugador {

    private Mano mano;
    private String nombre;

    public Jugador(String nombre){
        this.nombre=nombre;
        mano = new Mano();
    }

    public void cogerCarta(Carta carta){
        mano.addCard(carta);
    }

    public int getPuntuacion(){
        return mano.obtenerPuntuacion();
    }

    public boolean pasado(){
        return getPuntuacion()>21;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString(){
        return "Jugador: " + nombre+"\n"+
                "Cartas: " + mano + " Puntuacion: " + getPuntuacion();
    }

}
