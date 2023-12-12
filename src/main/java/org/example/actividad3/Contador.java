package org.example.actividad3;

public class Contador {

    //private static int cantidad = 0;
    private int cantidad = 0;

    public void incrementar(){
        cantidad++;
    }

    public void decrementar(){
        cantidad--;
    }

    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    @Override
    public String toString(){
        return "Total: " + cantidad;
    }

}
