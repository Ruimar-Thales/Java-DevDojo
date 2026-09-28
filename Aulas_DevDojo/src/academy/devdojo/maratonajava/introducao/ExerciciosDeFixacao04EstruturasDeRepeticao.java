package academy.devdojo.maratonajava.introducao;

public class ExerciciosDeFixacao04EstruturasDeRepeticao {
    public static void main(String[] args) {
        /*
            16. Usando for, exiba os números de 1 a 100.

            17. Usando while, some todos os números pares de 1 a 200 e exiba o resultado.

            18. Usando do while, peça ao usuário um número positivo
            e continue pedindo enquanto ele digitar um valor negativo.

            19. Usando for com break, percorra os números de 1 a 100
            e pare quando encontrar o primeiro múltiplo de 7 maior que 50.

            20. Usando for com continue, exiba todos os números de 1 a 50 que não sejam múltiplos de 3.

            21. Construa a tabuada de um número informado pelo usuário usando for.

            22. Usando laços aninhados, exiba um quadrado de asteriscos * de tamanho 5x5.

            23. Usando laços aninhados, exiba um triângulo de asteriscos com 5 linhas:

            24. Usando for, calcule o fatorial de um número informado pelo usuário.

            25. Exiba a sequência de Fibonacci até o 15º termo usando for.
         */

        // Questão 16

        for (int i = 0; i <= 5; i++){ // não coloquei até 100 pra ver os outros exercicios
            System.out.println(i);
        }
        System.out.println();

        // Questão 17

        int sum = 0, num = 1;
        while (num <= 200){
            if (num % 2 == 0){
                sum += num;
                num++;
            }else{
                num++;
            }
        }
        System.out.println("Soma: " + sum);
        System.out.println();

        // Questão 18

        int numQ18 = -12;

        while (numQ18 < 0){
            System.out.println("Digite um número positivo");
            break;
        }
        System.out.println();

        // Questão 19

        for (int i = 1; i <= 100; i++) {

            System.out.println(i);

            if (i > 50 && i % 7 == 0) {
                break;
            }

        }
        System.out.println();

        // Questão 20

        for (int i = 0; i <= 24; i++) {

            if (i % 3 == 0) {
                continue;
            }else{
                System.out.println(i);
            }
        }
        System.out.println();

        // Questão 21

        int tabuada = 4;

        for (int i = 1;i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
        System.out.println();

        // Questão 22

        for (int i = 1; i <= 5; i++){
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Questão 23

        for (int i = 1; i <= 5; i++){

            for (int j = 1; j <= 5; j++) {
                if (j < i){
                    System.out.print("*");
                }else {
                    break;
                }
            }
            System.out.println("*");
        }
        System.out.println();

        // Questão 24
        int numQ24 = 5, fatorial = 1;

        for (int i = 1; i <= numQ24; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);
        System.out.println();

        // Questão 25

        int termo = 15, anterior = 0, atual = 1;

        System.out.println(anterior + "\n" + atual);

        for (int i = 3; i <= termo; i++){
            int prox = anterior + atual;

            System.out.println(prox);

            anterior = atual;
            atual = prox;
        }
    }
}
