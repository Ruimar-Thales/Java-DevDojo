package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        System.out.println("Teste\n");
        int x = 110, y = 12;

        boolean isXMaiorQueY = x > y;
        // !
        if (isXMaiorQueY){
            System.out.println("X ("+x+") é maior que Y ("+y+")");
        }else{
            System.out.println("Y ("+y+") é maior que X ("+x+")");
        }
    }
}
