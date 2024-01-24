package org.example.blackjack;

import java.util.Arrays;

public class Mano {

    private Lista<Carta> cartas;

    public Mano(){
        cartas = new Lista<>();
    }

    public int obtenerPuntuacion(){

        int puntuacion=0;

        for(int i=0;i<cartas.getSize();i++)
            puntuacion+= cartas.get(i).getValues()[0];

        return puntuacion;

    }

    public void addCard(Carta carta){

        cartas.addHead(carta);

    }

    @Override
    public String toString(){
        return cartas.toString();
    }

}
