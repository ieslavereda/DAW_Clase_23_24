package org.example.farwest;

public class Main {
    public static void main(String[] args) {

        Pistola pistola = new Pistola(7);



        pistola.cargar();

        pistola.quitarSeguro();

        pistola.disparar();
        pistola.disparar();
        pistola.disparar();
        pistola.disparar();
        pistola.disparar();
        pistola.disparar();

        System.out.println(pistola);
    }
}
