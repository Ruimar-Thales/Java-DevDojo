package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class ExerciciosDeFixacao05Arrays {
    public static void main(String[] args) {

        /*
        26. Crie um array com 5 números inteiros e exiba todos os elementos usando for com índice.

        27. Crie um array com 5 números inteiros e exiba todos usando foreach.

        28. Dado o array {3, 8, 1, 6, 2, 9, 4}, encontre e exiba o maior e o menor valor.

        29. Dado um array de 10 inteiros, calcule e exiba a média dos valores.

        30. Dado um array de String com nomes, exiba apenas os nomes que começam com a letra "A".

        31. Crie um array de 8 números e inverta a ordem dos elementos, exibindo o array invertido.

        32. Dado um array de inteiros, conte quantos números são positivos, negativos e zeros.

        33. Crie dois arrays de 5 elementos cada e gere um terceiro array
            que seja a soma dos elementos nas mesmas posições.

        34. Dado um array de inteiros, verifique se um número informado pelo usuário existe nele
            e exiba em qual índice foi encontrado (ou que não existe).

        35. Dado o array {4, 2, 7, 1, 9, 3}, ordene-o manualmente
            usando um algoritmo de Bubble Sort com laços e exiba o resultado.
         */

        // Questão 26

        int numQ26[] = new int[5];
        numQ26[0] = 2;
        numQ26[1] = 4;
        numQ26[2] = 8;
        numQ26[3] = 16;
        numQ26[4] = 32;

        for (int i = 0; i < numQ26.length; i++){
            System.out.println("Posição " + i + ": " + numQ26[i]);
        }
        System.out.println();

        // Questão 27

        int numQ27[] = new int[5];
        numQ27[0] = 3;
        numQ27[1] = 9;
        numQ27[2] = 27;
        numQ27[3] = 81;
        numQ27[4] = 243;

        for (int numerosQ27 : numQ27){
            System.out.println(numerosQ27);
        }
        System.out.println();

        // Questão 28

        int numQ28[] = new int[]{3, 8, 1, 6, 2, 9, 4};

        int min = numQ28[0];
        int max = numQ28[0];

        for (int i = 0; i < numQ28.length; i++){

            if (max < numQ28[i]){
                max = numQ28[i];
            }
            if (min > numQ28[i]) {
                min = numQ28[i];
            }
        }
        System.out.println("Maior número: " + max);
        System.out.println("Menor número: " + min);
        System.out.println();

        // Questão 29

        int numQ29[] = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int sum = 0;
        double avg;

        for (int i = 0; i < numQ29.length; i++) {
            sum += numQ29[i];
        }
        avg = sum / numQ29.length;
        System.out.println("A média é: " + avg);
        System.out.println();

        // Questão 30

        String nomes[] = new String[]{"Alberto", "Anderson", "Bruna", "Maria", "Cauã", "Sérgio"};

        for (int A = 0; A < nomes.length; A++){

            if (nomes[A].charAt(0) == 'A'){
                System.out.println(nomes[A]);
            }

        }
        System.out.println();

        // Questão 31

        int numQ31[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = (numQ31.length - 1); i >= 0; i--){
            System.out.println(numQ31[i]);
        }
        System.out.println();

        // Questão 32

        int numQ32[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0};
        int even = 0, odd = 0, zero = 0;

        for (int i = 0; i < numQ32.length; i++){

            if (numQ32[i] % 2 == 0 && numQ32[i] != 0){
                even++;
            }else if (numQ32[i] % 2 != 0){
                odd++;
            }else {
                zero++;
            }

        }
        System.out.println("Quantidade de Pares: " + even + "\nQuantidade de Ímpares: " + odd + "\nQuantidade de Zeros: " + zero);
        System.out.println();

        // Questão 33

        int array1[] = new int[]{2, 4, 8, 16, 32};
        int array2[] = new int[]{3, 9, 27, 81, 243};
        int arraySoma[] = new int[5];

        for (int i = 0; i < arraySoma.length; i++){
            arraySoma[i] = array1[i] + array2[i];
            System.out.println(arraySoma[i]);
        }
        System.out.println();

        // Questão 34

        int numQ34[] = new int[]{1, 5, 64, 12, 99, 101};
        int numeroNoArray = 12;
        String existeNoArray = "Não existe no array";

        for (int i = 0; i < numQ34.length; i++) {
            if (numeroNoArray == numQ34[i]) {
                existeNoArray = ("O numero (" + numeroNoArray + ") existe e está no índice: " + i);
                break;
            }
        }

        System.out.println(existeNoArray);
        System.out.println();

        // Questão 35

        int numQ35[] = new int[]{4, 2, 7, 1, 9, 3};
        //bubble sort
        int aux;

        for (int i = 0; i < numQ35.length; i++) {
            for (int j = 0; j < (numQ35.length - 1); j++) {
                if (numQ35[j] > numQ35[j + 1]) {
                    aux = numQ35[j];
                    numQ35[j] = numQ35[j + 1];
                    numQ35[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < numQ35.length; i++) {
            System.out.println(numQ35[i]);
        }
    }
}
