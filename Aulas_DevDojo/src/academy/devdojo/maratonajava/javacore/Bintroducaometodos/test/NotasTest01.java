package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Notas;

public class NotasTest01 {
    public static void main(String[] args) {

        Notas notas1 = new Notas();

        notas1.setNotas(new double[]{7, 9, 1});

        double mediaNotas1 = notas1.mediaDeTresNotas();

        System.out.println(mediaNotas1);

    }
}
