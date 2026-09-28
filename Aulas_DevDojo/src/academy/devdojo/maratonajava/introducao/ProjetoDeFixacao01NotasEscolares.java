package academy.devdojo.maratonajava.introducao;

public class ProjetoDeFixacao01NotasEscolares{
    public static void main(String[] args) {

        String names[] = new String[]{"Joao", "Artur", "Pedro", "Jamal", "Jovan"};
        double notas[][] = new double[5][3];
        double sum[] = new double[5];
        double mediaFinal[] = new double[5];
        int aprovados = 0, recuperacao = 0, reprovados = 0;


        notas[0][0] = 8.5;
        notas[0][1] = 8.5;
        notas[0][2] = 8.5;

        notas[1][0] = 7.5;
        notas[1][1] = 7.5;
        notas[1][2] = 7.5;

        notas[2][0] = 6.5;
        notas[2][1] = 6.5;
        notas[2][2] = 6.5;

        notas[3][0] = 4.5;
        notas[3][1] = 4.5;
        notas[3][2] = 4.5;

        notas[4][0] = 3.5;
        notas[4][1] = 3.5;
        notas[4][2] = 3.5;

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++) {
                sum[i] += notas[i][j];
            }
        }

        for (int i = 0; i < mediaFinal.length; i++) {
            mediaFinal[i] += sum[i];
            mediaFinal[i] = mediaFinal[i] / 3;
        }

        for (int i = 0; i < 5; i++) {
            if (mediaFinal[i] < 5){
                System.out.println("Aluno: " + names[i] + " Está com a média: " + mediaFinal[i] + " e ficou reprovado");
                reprovados++;
            }else if (mediaFinal[i] < 7){
                System.out.println("Aluno: " + names[i] + " Está com a média: " + mediaFinal[i] + " e ficou de recuperação");
                recuperacao++;
            }else {
                System.out.println("Aluno: " + names[i] + " Está com a média: " + mediaFinal[i] + " e foi aprovado");
                aprovados++;
            }
        }
        System.out.println(aprovados + " Alunos foram aprovados\n" + recuperacao + " Alunos estão de recuperação\n" + reprovados + " Alunos foram reprovados");

        double maiorMedia = mediaFinal[0], menorMedia = mediaFinal[0];

        for (int i = 0; i < mediaFinal.length; i++) {
            for (int j = 0; j < (mediaFinal.length - 1) ; j++) {
                if (mediaFinal[i] > maiorMedia){
                    maiorMedia = mediaFinal[i];
                }else if (mediaFinal[i] < menorMedia)
                    menorMedia = mediaFinal[i];
            }
        }

        System.out.println("A maior média foi " + maiorMedia + "\nA menor média foi " + menorMedia);

    }
}
