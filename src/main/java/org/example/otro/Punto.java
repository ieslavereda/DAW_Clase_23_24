package org.example.otro;

public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y){
       this.x=x;
       this.y=y;
    }
    public Punto(){
        this.x=0;
        this.y=0;
    }
    public void subir(){
        y++;
    }
    public void subir(int cant){
        y+=cant;
    }



    public void bajar(){
        y--;
    }
    public void derecha(){
        x++;
    }
    public void izquierda(){
        x--;
    }
    public void diagArriDere(){
        subir();
        derecha();
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
