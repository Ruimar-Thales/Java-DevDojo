package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante01.nome = "Ruimar";
        estudante01.sexo = 'M';
        estudante01.idade = 18;

        estudante02.nome = "Nicolas";
        estudante02.sexo = 'M';
        estudante02.idade = 18;

        imprimeEstudante.imprime(estudante01);
        imprimeEstudante.imprime(estudante02);
        imprimeEstudante.imprime(estudante01);


    }
}
