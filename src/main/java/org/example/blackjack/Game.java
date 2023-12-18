package org.example.blackjack;

import java.util.Scanner;

public class Game {

    private Jugador[] jugadores;
    private Jugador banca;
    private Baraja baraja;

    public Game(){
        baraja = new Baraja();
        banca = new Jugador("PC");
        init();
    }
    public Game(Jugador... jugadores){

        baraja = new Baraja();
        banca = new Jugador("PC");
        this.jugadores=jugadores;

    }


    private void init() {
        // TODO
    }

    public void start(){

        boolean quiereCarta;

        for(Jugador jugador: jugadores) {

            do {

                jugador.cogerCarta(baraja.removeTop());
                System.out.println(jugador);
                quiereCarta = solicitarQuiereCarta(jugador);

            } while (quiereCarta && !jugador.pasado());


        }

    }

    private boolean solicitarQuiereCarta(Jugador jugador) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres carta " + jugador.getNombre()+"? [s|n]");

        return sc.nextLine().toLowerCase().charAt(0)=='s';

    }
}
