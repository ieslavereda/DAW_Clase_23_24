package org.example.blackjack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Baraja b =new Baraja();
        b.shuffle();
        System.out.println(b);
    }
}
