package academy.devdojo.maratonajava.introducao;

public class ExerciciosDeFixacao01TiposPrimitivos {
    public static void main(String[] args) {
        /*
        1. Declare variáveis dos 8 tipos primitivos do Java com valores à sua escolha e exiba todas no console.

        2. Declare um int com o valor 130 e tente atribuí-lo a um byte. O que acontece? A: -126
           Corrija usando casting explícito.

        3. Crie uma variável double com o valor 9.99 e converta-a para int. Exiba o antes e o depois,
           explicando com um comentário o que foi perdido.

        4. Declare duas variáveis String com seu nome e sobrenome e exiba a concatenação no formato
           "Nome completo: João Silva".

        5. Declare uma variável char com a letra 'A' e some 1 a ela. Qual caractere é exibido?
         */

        // Questão 1

        byte valorByte = 127;
        int integer = 10000;
        short menosQueInt = 20000;
        float pontoFlutuante = 12.90F;
        double pontoFlutuanteTambem = 15.45;
        long numeroMuitoGrande = 1000000000;
        //long não pode ser decimal
        char caractere = 'a';
        String nomeQ1 = "Ruimar";

        System.out.println(valorByte + " " + integer + " " + menosQueInt + " " + pontoFlutuante);
        System.out.println(pontoFlutuanteTambem + " " + numeroMuitoGrande + " " + caractere + " " + nomeQ1);
        System.out.println();

        // Questão 2

        int numQ2 = 130;
        byte testNum;

        testNum = (byte) numQ2;
        System.out.println(testNum);

        System.out.println();
        // Questão 3

        double numQ3 = (int) 9.99;

        System.out.println(numQ3); // Quando atribui o INT vira 9 apenas
        System.out.println();

        // Questão 4

        String nome, sobrenome;
        nome = "Ruimar";
        sobrenome = "Thales";

        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println();

        // Questão 5

        char letra = 'A';
        System.out.println(letra);
        letra += 1;
        System.out.println(letra);
    }
}
