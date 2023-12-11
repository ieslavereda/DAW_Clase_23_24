package org.example.otro;

public class Main {
    public static void main(String[] args) {


        Punto p = new Punto(2,2);
        Punto p2 = new Punto();

        Segmento s = new Segmento(p2,p);
        s.subir();


        System.out.println(s);
        

    }
}