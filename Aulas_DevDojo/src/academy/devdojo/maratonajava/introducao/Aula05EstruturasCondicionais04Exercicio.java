package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        //Quanto de imposto tem que pagar dependendo do salário anual

        double salarioAnual, tax1, tax2, tax3, fullTax2, fullTax3, valorImposto, salarioFinal;
        salarioAnual = 68508;
        tax1 = 9.7 / 100;
        tax2 = 37.35 / 100;
        tax3 = 49.5 / 100;
        fullTax2 = 34712 * tax1;
        fullTax3 = fullTax2 + ((68507 - 34712) * tax2);

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * tax1;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = ((salarioAnual - 34712) * tax2) + fullTax2;
        } else {
            valorImposto = ((salarioAnual - 68507) * tax3) + fullTax3;
        }

        salarioFinal = salarioAnual - valorImposto;

        System.out.println("Impostos a serem pagos: £" + valorImposto);
        System.out.println("Salario Líquido: £" + salarioFinal);

    }
}
