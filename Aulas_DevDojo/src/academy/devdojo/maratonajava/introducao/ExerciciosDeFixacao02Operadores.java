package academy.devdojo.maratonajava.introducao;

public class ExerciciosDeFixacao02Operadores {
    public static void main(String[] args) {
        /*
        Q6. Dados dois números inteiros, calcule e exiba a soma, subtração, multiplicação,
        divisão e o resto da divisão.

        Q7. Declare uma variável int com valor 10 e use os operadores +=, -=, *= e /= em sequência,
         exibindo o valor após cada operação.

        Q8. Crie uma expressão que verifique se um número está entre 10 e 50 (inclusive)
        usando operadores relacionais e lógico AND.

        Q9. Usando operador ternário, verifique se um número é par ou ímpar e exiba "Par" ou "Ímpar"`.

        Q10. Declare dois booleanos a = true e b = false e exiba o resultado de a && b, a || b e !a.
         */

        // Questão 6
        System.out.println();

        int num1 = 12, num2 = 4, sum, sub, div, times;
        sum = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2;
        times = num1 * num2;
        String operations = "Soma: " + sum + "\nSubtração: " + sub + "\nDivisão: " + div + "\nMultiplicação: " + times;
        System.out.println(operations);

        System.out.println();

        // Questão 7

        int num = 10;
        num += 5;
        System.out.println(num);
        num -= 8;
        System.out.println(num);
        num *= 12;
        System.out.println(num);
        num /= 2;
        System.out.println(num);

        System.out.println();

        // Questão 8

        int range;
        range = 0;
        boolean inConditions = range >= 10 && range <=50;

        System.out.println("Está nos termos = " + inConditions);

        System.out.println();

        // Questão 9

        int numQ9;
        numQ9 = 13;

        boolean even = numQ9 % 2 == 0;

        if (even){
            System.out.println("É par");
        }else{
            System.out.println("É ímpar");
        }


        System.out.println();

        // Questão 10

        boolean a = true, b = false;
        System.out.println("a = true \nb = false");
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + !a);


        System.out.println();
    }
}
