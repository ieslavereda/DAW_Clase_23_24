package org.example.otro;

public class Segmento {

    private Punto inicio;
    private Punto fin;

    public Segmento(Punto inicio,Punto fin){
        this.inicio=inicio;
        this.fin=fin;
    }

    public void subir(){
        inicio.subir();
        fin.subir();
    }


    @Override
    public String toString(){
        return inicio + "---" + fin;
    }
}
