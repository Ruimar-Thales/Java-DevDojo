package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        Professor professor3 = new Professor();

        professor1.nome = "Raoni";
        professor1.idade = 28;
        professor1.sexo = 'M';

        professor2.nome = "Almi";
        professor2.idade = 60;
        professor2.sexo = 'M';

        professor3.nome = "Gabriela";
        professor3.idade = 39;
        professor3.sexo = 'F';

        System.out.println("| Nome: " + professor1.nome + " | Idade: " + professor1.idade + " | Sexo: " + professor1.sexo + " |");
        System.out.println("| Nome: " + professor2.nome + " | Idade: " + professor2.idade + " | Sexo: " + professor2.sexo + " |");
        System.out.println("| Nome: " + professor3.nome + " | Idade: " + professor3.idade + " | Sexo: " + professor3.sexo + " |");
    }
}
