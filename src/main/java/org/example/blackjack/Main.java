package org.example.blackjack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Baraja b =new Baraja();
        b.shuffle();

        for(int i=0;i<54;i++)
            System.out.println(b.removeTop());

        System.out.println(b);

    }
}
