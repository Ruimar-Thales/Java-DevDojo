package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Ruimar";
        estudante01.sexo = 'M';
        estudante01.idade = 18;

        estudante02.nome = "Nicolas";
        estudante02.sexo = 'M';
        estudante02.idade = 18;

        estudante01.imprime();



    }
}
