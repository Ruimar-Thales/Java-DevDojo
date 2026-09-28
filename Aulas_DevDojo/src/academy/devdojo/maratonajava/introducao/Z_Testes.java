package academy.devdojo.maratonajava.introducao;

public class Z_Testes {
    public static void main(String[] args) {

        int triangleSize = 5;

        for (int i = 1; i <= triangleSize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
