package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Retangulo;

public class RetanguloTest01 {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(10);
        retangulo.setLargura(12);

        retangulo.calcularArea();

    }
}
