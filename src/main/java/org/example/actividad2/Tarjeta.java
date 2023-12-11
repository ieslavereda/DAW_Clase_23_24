package org.example.actividad2;

import org.example.actividad1.Cuenta;

public class Tarjeta {

    private static int siguienteNumero=1;

    private final int LIMITE_MAXIMO;

    private Cuenta cuentaAsociada;

    private float saldoCredito;

    private int numeroTarjeta;

    public Tarjeta(int limite_maximo,Cuenta cuenta){

        this.LIMITE_MAXIMO=limite_maximo;
        this.cuentaAsociada = cuenta;
        numeroTarjeta = siguienteNumero++;
        saldoCredito=LIMITE_MAXIMO;

    }
    public Tarjeta(Cuenta cuenta){

        this(3000,cuenta);

    }

}
