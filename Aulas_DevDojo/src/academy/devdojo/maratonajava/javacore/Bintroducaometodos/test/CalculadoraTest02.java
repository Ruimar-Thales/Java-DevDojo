package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int num1, num2;
        num1 = 4;
        num2 = 3;

        calc.multiplicaDoisNumeros(num1, num2);

    }
}
