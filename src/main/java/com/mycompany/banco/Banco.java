package com.mycompany.banco;

class Banco {

    public static void main(String[] args) {
        Conta c1 = new ContaNormal();
        c1.setNumero("1654-3");
        c1.setSaldo(500);

        ContaDebEspecial c2 = new ContaDebEspecial();
        ContaDebEspecial c3 = new ContaDebEspecial("4067-6", 2500, 5050);

        c2.setNumero("4067-6");
        c2.setSaldo(2500);
        c2.setLimite(1000.67);

        System.out.println("A conta número " + c1.getNumero() + " possui saldo R$ " + c1.getSaldo());
        c1.creditar(1000);
        System.out.println("Após o crédito de R$ 1000,00, a conta número " + c1.getNumero() + " passou a ter saldo R$ " + c1.getSaldo());
        c1.debitar(100);
        System.out.println("Após o débito de R$ 100,00, a conta número " + c1.getNumero() + " passou a ter saldo R$ " + c1.getSaldo());

        System.out.println();
        System.out.println("A conta número " + c2.getNumero() + " possui saldo R$ " + c2.getSaldo());
        c2.debitar(500);
        System.out.println("Após o débito de R$ 500,00, a conta número " + c2.getNumero() + " passou a ter saldo R$ " + c2.getSaldo());
        System.out.println("A conta número " + c2.getNumero() + " possui saldo R$ " + c2.getSaldo() + " e limite de R$ " + c2.getLimite());
        c2.setLimite(10000);
        System.out.println("A conta número " + c2.getNumero() + " possui saldo R$ " + c2.getSaldo() + " e novo limite de R$ " + c2.getLimite());
    }
}
