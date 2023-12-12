package org.example.actividad4;

public class Main {
    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(3,4);
        Fraccion f2 = new Fraccion(4,5);
        Fraccion f3 = new Fraccion(6,8);
        Fraccion f4 = new Fraccion(16,4);

        Fraccion resultado = f1.multiplicar(f2);

        //System.out.println(f1 + " * " + f2 +" = " + resultado);



        System.out.println(f3);
        f3.simplificar();
        System.out.println(f3);

        System.out.println();

        System.out.println(f4);
        System.out.println(Fraccion.simplificar(f4));
        System.out.println(f4);

        Fraccion f5=new Fraccion(2,6);
        Fraccion f6 = new Fraccion(5,2);
        System.out.println(f5.sumar(f6));
    }
}
