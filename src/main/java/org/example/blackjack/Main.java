package org.example.blackjack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Jugador jugador1 = new Jugador("Joaquin");
        Jugador jugador2 = new Jugador("Carmen");

        Game game = new Game(jugador1,jugador2);
        game.start();



    }
}
