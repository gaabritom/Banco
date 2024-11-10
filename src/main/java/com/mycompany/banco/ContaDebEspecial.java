package com.mycompany.banco;

class ContaDebEspecial extends ContaEspecial {

    ContaDebEspecial() {
        super();
    }

    ContaDebEspecial(String n, double s, double l) {
        numero = n;
        saldo = s;
        limite = l;
    }

    @Override
    public void debitar(double valor) {
        if ((limite + saldo - valor) >= 0) {
            saldo = saldo - valor;
        }
    }
}
