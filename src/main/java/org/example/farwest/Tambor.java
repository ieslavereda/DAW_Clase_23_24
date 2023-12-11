package org.example.farwest;

public class Tambor {

    private Bala[] array;
    private int posicion;

    public Tambor(){
       this.array = new Bala[5];
       this.posicion = 0;
    }

    public Tambor(int size){
        this.array = new Bala[size];
        this.posicion = 0;
    }

    public void girar(){
        this.posicion = (int)(Math.random()* array.length);
    }

    public void girarSiguient(){
        posicion= (posicion+1) % array.length ;
    }

    public void cargar(){
        for(int i=0;i<array.length;i++)
            array[i] = new Bala();
    }

    public void descargar(){
        for(int i=0;i<array.length;i++)
            array[i] = null;
    }

    public boolean disparar(){
        Bala b = array[posicion];

        girarSiguient();

        if(b!=null)
            return b.disparar();
        else
            return false;
    }

    @Override
    public String toString(){
        String aux = "Posicion= " + posicion +"\n"+
                "Balas = ";

        for(Bala b : array)
            aux+=b +" ";

        return aux;

    }
}
