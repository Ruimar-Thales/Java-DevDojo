package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
        idade < 15 categoria infantil
        idade >= 15 && idade < 18 categoria juvenil
        idade >= 18 categoria adulto
         */

        int idade = 72;
        boolean categoriaAdulto = idade >= 18 && idade < 60, categoriaJuvenil = idade >= 15 && idade < 18, categoriaInfantil = idade < 15;
        if (categoriaInfantil){
            System.out.println("Categoria: Infantil");
        }else if (categoriaJuvenil){
            System.out.println("Categoria: Juvenil");
        } else if (categoriaAdulto) {
            System.out.println("Categoria: Adulto");
        }else{
            System.out.println("Categoria: idoso");
        }
    }
}
