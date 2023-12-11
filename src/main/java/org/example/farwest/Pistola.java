package org.example.farwest;

public class Pistola {

    private Tambor tambor;
    private boolean seguro;

    public Pistola(int capacidad){
        tambor = new Tambor(capacidad);
        seguro = true;
    }



    public void quitarSeguro(){
        seguro=false;
    }
    public void ponerSeguro(){
        seguro=true;
    }

    public boolean disparar(){
        if(!seguro)
            return tambor.disparar();
        else {
            System.out.println("El seguro esta activado");
            return false;
        }
    }

    public void cargar(){
        tambor.cargar();
    }
    public void descargar(){
        tambor.descargar();
    }

    public void girarTambor(){
        tambor.girar();
    }

    @Override
    public String toString(){
        return "Seguro = " + seguro + "\n"+
                "Tambor \n" + tambor;
    }

}
