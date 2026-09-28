package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Roberta");
        funcionario01.setIdade(41);
        funcionario01.setSalario(new double[]{1200, 2000, 5000});

        System.out.println(funcionario01.getIdade());
        System.out.println(funcionario01.getNome());
        System.out.println(funcionario01.getMedia());

        funcionario01.mediaSalarialFuncionario(funcionario01);

    }
}
