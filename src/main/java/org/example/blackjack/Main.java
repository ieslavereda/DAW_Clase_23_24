package org.example.blackjack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Carta c = new Carta(Tipo.OCHO,Palo.HEART);
        System.out.println(c);
        System.out.println(Arrays.toString(c.getValues()));

        Baraja b =new Baraja();
        System.out.println(b);
    }
}
