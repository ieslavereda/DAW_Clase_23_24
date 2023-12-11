package org.example.otro;

public class Persona {

    private String nombre;
    private String apellidos;
    private float peso;
    protected int edad;

    public Persona(String nombre,String apellidos,float peso){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.peso = peso;
        edad=0;

    }
    public static void otroMetodo(){

    }
    public void cumpleAnyos(){
        edad++;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if(edad>0)
            this.edad=edad;
    }

    public String toString(){
        return "Nombre: " + nombre +", apellidos: "+apellidos;
    }

}
