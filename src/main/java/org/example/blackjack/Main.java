package org.example.blackjack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Baraja b =new Baraja();
        b.shuffle();

        for(int i=0;i<55;i++)
            b.removeBotom();

        System.out.println(b);
        b.cut();
        System.out.println(b);


    }
}
