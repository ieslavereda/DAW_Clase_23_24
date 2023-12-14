package org.example.blackjack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Baraja b =new Baraja();
//        System.out.println(b);

        for (Tipo tipo : Tipo.values())
            System.out.println(tipo);

        for (Palo palo : Palo.values())
            System.out.println(palo);
    }
}
