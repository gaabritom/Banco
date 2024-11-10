package com.mycompany.banco;

abstract class Conta {

    protected String numero;
    protected double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract public void creditar(double valor);

    abstract public void debitar(double valor);
}
