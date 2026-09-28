package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void dadosFuncionario(Funcionario funcionario) {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double salarios : salario) {
            System.out.print(" | " + salarios + " | ");
        }
    }

    public void mediaSalarialFuncionario(Funcionario funcionario) {
        if (salario == null) {
            return;
        }

        double soma = 0;
        double media;

        for (double salarios : salario) {
            soma += salarios;
        }
        media = (soma / (salario).length);
        System.out.println("\nA média salarial de " + this.nome + " é de R$" + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
