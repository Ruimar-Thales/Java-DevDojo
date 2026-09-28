package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Utilizando o switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;

        switch (dia){
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            case 1, 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
