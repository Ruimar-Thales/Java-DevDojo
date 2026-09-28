package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.TesteDeParametros;

public class TesteDeParametrosTest01 {
    public static void main(String[] args) {

        TesteDeParametros test = new TesteDeParametros(12, "Dentro dos parametros do Main");

        System.out.println(test.numero);

    }
}
