package academy.devdojo.maratonajava.introducao;

import java.util.Queue;

public class ExerciciosDeFixacao03EstruturasCondicionais {
    public static void main(String[] args) {
        System.out.println();

        /*
        Q11. Leia a idade de uma pessoa e exiba se ela é "Menor de idade", "Adulto" ou "Idoso" (60+).

        Q12. Dado um valor de salário, aplique um imposto: até R$2.000 isento, até R$5.000 paga 10%,
        acima paga 20%. Exiba o salário líquido.

        Q13. Usando switch, receba um número de 1 a 7 e exiba o dia da semana correspondente.

        Q14. Usando switch, receba o nome de um mês e exiba quantos dias ele tem (considere fevereiro com 28 dias).

        Q15. Verifique se um triângulo é válido dados três lados. Se for, diga se é equilátero, isósceles ou escaleno.
         */

        // Questão 11

        int idade;
        idade = 19;
        boolean menorDeIdade = idade < 18, adulto = idade >= 18 && idade < 60;

        if (menorDeIdade){
            System.out.println("Menor de idade");
        } else if (adulto) {
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }

        System.out.println();

        // Questão 12

        double wage, netWage, tax = 0;
        wage = 5000;

        if (wage <= 2000){
            tax = 0;
        } else if (wage > 2000 && wage <= 5000) {
            tax = (wage - 2000) * 0.1;
        }else {
            tax = 300 + (wage - 5000) * 0.2;
        }
        netWage = wage - tax;

        System.out.println("Salário Líquido: " + netWage);


        System.out.println();

        // Questão 13

        int dia;
        dia = 2;

        switch (dia) {
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Invalido");
                break;
        }

        System.out.println();
        // Questão 14

        // Questão 13

        int mes;
        mes = 2;

        switch (mes) {
            case 1:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("Invalido");
                break;
        }
        System.out.println();
        // Questão 15
        
        double lado1, lado2, lado3;
        lado1 = 12;
        lado2 = 12;
        lado3 = 15;
        
        if (lado2 == lado1 && lado2 == lado3){
            System.out.println("Triangulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 ||  lado2 == lado3) {
            System.out.println("Triangulo Isósceles");
        }else {
            System.out.println("Triangulo Escaleno");
        }
    }
}
