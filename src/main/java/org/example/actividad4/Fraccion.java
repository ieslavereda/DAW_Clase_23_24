package org.example.actividad4;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
        //simplificar();
    }

    public Fraccion sumar(Fraccion f){
        int n = numerador*f.denominador + f.numerador*denominador;
        int d = denominador * f.denominador;
        return simplificar(new Fraccion(n,d));
    }
    public Fraccion restar(Fraccion f){
        int n = numerador*f.denominador - f.numerador*denominador;
        int d = denominador * f.denominador;
        return simplificar(new Fraccion(n,d));
    }

    public Fraccion multiplicar(Fraccion f){
        return simplificar(new Fraccion(this.numerador*f.numerador,denominador*f.denominador));
    }

    public Fraccion dividir(Fraccion f){
        return simplificar(new Fraccion(numerador*f.denominador,denominador*f.numerador));
    }

    public Fraccion multiplicar(int numero){
        return multiplicar(new Fraccion(numero,1));
    }

    private static int maximoComunDivisor(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public static Fraccion simplificar(Fraccion f){
        int mcd = maximoComunDivisor(f.numerador,f.denominador);
        return new Fraccion(f.numerador/mcd,f.denominador/mcd);
    }

    public void simplificar(){
        int mcd = maximoComunDivisor(numerador,denominador);
        numerador/=mcd;
        denominador/=mcd;
    }


    @Override
    public String toString(){
        return numerador + "/" + denominador;
    }
}
