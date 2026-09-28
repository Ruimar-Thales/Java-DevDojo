package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.saldo();

        conta.depositar(2000);

        conta.saldo();

    }
}
