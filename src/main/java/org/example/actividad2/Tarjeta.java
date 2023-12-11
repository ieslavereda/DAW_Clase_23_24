package org.example.actividad2;

import org.example.actividad1.Cuenta;

public class Tarjeta {

    private static int siguienteNumero = 1;

    private final int LIMITE_MAXIMO;
    private Cuenta cuentaAsociada;
    private float saldoCredito;
    private int numeroTarjeta;

    public Tarjeta(int limite_maximo, Cuenta cuenta) {

        this.LIMITE_MAXIMO = limite_maximo;
        this.cuentaAsociada = cuenta;
        numeroTarjeta = siguienteNumero++;
        saldoCredito = LIMITE_MAXIMO;

    }

    public Tarjeta(Cuenta cuenta) {

        this(3000, cuenta);

    }

    public Tarjeta(int limite_maximo, String nombre) {
        this(limite_maximo, new Cuenta(nombre));
    }

    public boolean pagoCredito(float cantidad) {

        if (cantidad <= 0) return false;

        if (cantidad <= saldoCredito) {
            saldoCredito -= cantidad;
            return true;
        } else return false;

    }

    public boolean pagoDebito(float cantidad) {

        return cuentaAsociada.reintegro(cantidad);

    }

    public void reiniciarCredito() {

        if (!cuentaAsociada.reintegro(LIMITE_MAXIMO - saldoCredito)) {
            float nuevoSaldo = cuentaAsociada.getSaldo() - (LIMITE_MAXIMO - saldoCredito);
            cuentaAsociada.setSaldo(nuevoSaldo);
        }
        saldoCredito = LIMITE_MAXIMO;

    }

    public float getSaldoCredito() {
        return saldoCredito;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public Cuenta getCuentaAsociada() {
        return cuentaAsociada;
    }

    public int getLIMITE_MAXIMO() {
        return LIMITE_MAXIMO;
    }

    @Override
    public String toString() {

        return "Numero Tarjeta: " + numeroTarjeta + "\n" +
                "Saldo disponible credito: " + saldoCredito + "\n" +
                cuentaAsociada;

    }

}
