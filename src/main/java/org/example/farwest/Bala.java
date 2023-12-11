package org.example.farwest;

public class Bala {

    private boolean fogueo;
    private boolean usada;

    public Bala(){
        this.usada=false;
        this.fogueo = (int)(Math.random()*10)<5;
    }
//    public Bala(boolean fogueo){
//        this.usada=false;
//        this.fogueo = fogueo;
//    }
//    public Bala(boolean usada,boolean fogueo){
//        this.usada=usada;
//        this.fogueo=fogueo;
//    }

    public boolean disparar(){

        if(usada){
            System.out.println("Clic!");
            return false;
        } else if(fogueo){
            System.out.println("Cloc!");
            usada=true;
            return false;
        } else {
            System.out.println("BOOOOOM!!!");
            usada=true;
            return true;
        }

    }

    @Override
    public String toString(){
        if(usada) return "*";
        if(fogueo) return "@";
        return "O";
    }

}
