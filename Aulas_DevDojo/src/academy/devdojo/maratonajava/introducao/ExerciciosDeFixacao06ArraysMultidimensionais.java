package academy.devdojo.maratonajava.introducao;

public class ExerciciosDeFixacao06ArraysMultidimensionais {
    public static void main(String[] args) {
        /*
        36. Crie uma matriz 3x3 de inteiros e preencha com os valores de 1 a 9. Exiba no formato de tabela.

        37. Dada a matriz abaixo, calcule a soma de todos os elementos:
            int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        38. Crie uma matriz 3x3 e exiba apenas os elementos da diagonal principal (onde linha == coluna).

        39. Dada uma matriz 3x3, exiba a transposta (troque linhas por colunas).

        40. Crie uma matriz 4x4 de inteiros e exiba a soma de cada linha separadamente.

        41. Usando um array multidimensional, simule um jogo da velha: crie um tabuleiro 3x3
            preenchido com 'X', 'O' e ' ' e exiba-o formatado no console.

        42. Dado um array bidimensional representando notas de 4 alunos em 3 matérias,
            calcule e exiba a média de cada aluno.
         */

        // Questão 36 e 37

        int numQ36[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < numQ36.length; i++) {
            for (int j = 0; j < numQ36.length; j++) {
                System.out.print(" | " + numQ36[i][j] + " | ");
                sum += numQ36[i][j];
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos é " + sum);
        System.out.println();

        // Questão 38

        int numQ38[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < numQ38.length; i++) {
            System.out.println(numQ38[i][i]);
        }
        System.out.println();

        // QUestão 39

        int numQ39[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < numQ39.length; i++) {
            for (int j = 0; j < numQ39.length; j++) {
                System.out.print(" | " + numQ39[j][i] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        // Questão 40

        int numQ40[][] = new int[][]{{1, 2, 3, 14}, {4, 5, 6, 15}, {7, 8, 9, 15}, {10, 11, 12, 13}};
        int columnSum[] = new int[4];
        int sumQ40 = 0;

        for (int i = 0; i < numQ40.length; i++) {
            for (int j = 0; j < numQ40.length; j++) {
                sumQ40 += numQ40[i][j];
            }
            columnSum[i] = sumQ40;
            sumQ40 = 0;
        }

        for (int soma : columnSum){
            System.out.println(soma);
        }
        System.out.println();

        // Questão 41 não vai ser possível já qu não sei usar o scanner

        // Questão 42 (4 alunos em 3 matérias)

        int notas[][] = new int[][]{{7, 2, 3}, {5, 2, 3}, {8, 9, 7}, {1, 4, 7}};
        double media[] = new double[4];
        int sumNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < (notas.length - 1); j++) {
                sumNotas += notas[i][j];
            }
            media[i] = sumNotas;
            sumNotas = 0;
        }


        for (int i = 0; i < media.length; i++) {
            System.out.println(media[i] / 3 );
        }

    }
}
