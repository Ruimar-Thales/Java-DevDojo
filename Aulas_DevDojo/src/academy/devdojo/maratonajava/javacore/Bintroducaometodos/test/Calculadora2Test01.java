package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora2;

public class Calculadora2Test01 {
    public static void main(String[] args) {

        Calculadora2 calc = new Calculadora2(25, 12);
        Calculadora2 calc2 = new Calculadora2(20, 10);

        calc.somar();
        calc.subtrair();
        calc.multiplicar();
        calc2.dividir();

        double resultSoma = calc.somar();
        System.out.println("Soma = "  + resultSoma);
    }
}
