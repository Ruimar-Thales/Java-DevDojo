package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int num1, num2;
        num1 = 2;
        num2 = 5;

        double result = calc.divideDoisNumeros(num1, num2);

        System.out.println(result);

        System.out.println("----------");

        calc.imprimeDivisaoDeDoisNumeros02(num1, num2);


    }
}
