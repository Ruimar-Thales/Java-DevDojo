package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        double num1 = 15, num2 = 27;
        // + - * /
        System.out.println("Valor " + (num1 + num2));
        System.out.println("Valor " + (num1 - num2));
        System.out.println("Valor " + (num1 * num2));
        System.out.println("Valor " + (num1 / num2));

        // %
        int resto = 20 % 3;
        System.out.println("\n" + resto);

        // < > <= >= == !=
        boolean isQuinzeMaiorQueQuatro = 15 > 4;
        System.out.println("\nisQuinzeMaiorQueQuatro " + isQuinzeMaiorQueQuatro);

        // && (and), || (or), ! (not)
        int idade = 27;
        int cargaHorariaSemanal = 48;
        boolean isCargaHorariaMaiorDeIdadeNaLei = idade >= 18 && (cargaHorariaSemanal >= 40 || cargaHorariaSemanal < 40);
        boolean isCargaHorariaMenorDeIdadeNaLei = idade < 18 && cargaHorariaSemanal <= 40;
        System.out.println("\nisCargaHorariaMaiorDeidadeNaLei " + isCargaHorariaMaiorDeIdadeNaLei);
        System.out.println("\nisCargaHorariaMenorDeidadeNaLei " + isCargaHorariaMenorDeIdadeNaLei);

        // = += -= *= /= %=
        int bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 200; // 2600
        bonus *= 2; // 5200
        System.out.println("\n"+bonus);

        // ++ --
        int contador = 0;
        contador++;
        ++contador;
        --contador;
        contador--;
        System.out.println(contador++);
        System.out.println(contador);
    }
}
