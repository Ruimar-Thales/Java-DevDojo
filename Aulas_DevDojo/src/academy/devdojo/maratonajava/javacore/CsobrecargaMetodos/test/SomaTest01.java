package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Soma;

public class SomaTest01 {
    public static void main(String[] args) {

        Soma soma = new Soma();

        soma.somar(12, 8);
        System.out.println("-----------------------");
        soma.somar(12.5, 22.3);
        System.out.println("-----------------------");
        soma.somar(12, 3, 45);

    }
}
