package org.example.actividad7;

public class NIF {

    private final static char[] letras = new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    private int numero;
    private char letra;

    public NIF(int numero){
        this.numero=numero;
        this.letra=calcularLetra();
    }

    private char calcularLetra(){
        return letras[numero%23];
    }

    public int getNumero(){
        return numero;
    }
    public char getLetra(){
        return letra;
    }

    @Override
    public String toString(){
        return numero+"-"+letra;
    }

}
