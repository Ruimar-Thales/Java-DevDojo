package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Operador Ternário

        //Doar se salario > 5000
        double salario = 6000;
        String doarSalario = "Eu vou doar 500tão";
        String naoDoarSalario = "Eu não posso doar 500tão no momento";

        //(condição) ? verdadeiro : falso
        String resultado = (salario > 5000) ? doarSalario : naoDoarSalario;

        System.out.println(resultado);
    }
}
