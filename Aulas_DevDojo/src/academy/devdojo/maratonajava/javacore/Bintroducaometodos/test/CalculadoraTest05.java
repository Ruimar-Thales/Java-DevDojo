package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int[] nums = {1, 2, 3, 4, 5};

        calc.somaArray(nums);

        calc.somaVarArgs(1, 2, 4, 5, 7);

    }
}
