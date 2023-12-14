package org.example.blackjack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private Carta[] cartas;


    public Baraja(){

        // cartas = new Carta[52];
        cartas = new Carta[Palo.values().length*Tipo.values().length];

        int i=0;

        for (Palo palo : Palo.values())
            for (Tipo tipo : Tipo.values())
                cartas[i++]=new Carta(tipo,palo);

    }

    public void shuffle(){
        List<Carta> aux = Arrays.asList(cartas);
        Collections.shuffle(aux);

        int i=0;
        for(Carta c : aux)
            cartas[i++]=c;
    }

    @Override
    public String toString(){
        return Arrays.toString(cartas);
    }

}
