package org.example.actividad2;

import org.example.actividad1.Cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Manolo",1000);

        Tarjeta t = new Tarjeta(3000,c1);

        t.pagoCredito(2000);
        t.pagoDebito(500);
        t.reiniciarCredito();



        System.out.println(t);

    }
}
