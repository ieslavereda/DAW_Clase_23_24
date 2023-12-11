package org.example.actividad1;

public class Main {
    public static void main(String[] args) {


        Cuenta c1 = new Cuenta("Manolo");
        Cuenta c2 = new Cuenta("Teresa",150);

        System.out.println(c1.transferir(c2,500));
        System.out.println(c1);
        System.out.println(c2);
    }
}
