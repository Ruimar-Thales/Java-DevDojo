package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = p1;

        p1.setNome("Carlos");
        p1.setIdade(12);
        p1.imprime();
        p2.imprime();


        p2.setNome("Rafael");
        p2.setIdade(16);
        System.out.println("----------------");
        p1.imprime();
        p2.imprime();

    }
}
