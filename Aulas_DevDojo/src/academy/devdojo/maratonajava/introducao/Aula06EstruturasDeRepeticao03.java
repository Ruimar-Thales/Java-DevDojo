package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //imprimir os 25 primeiros numeros de um dado valor

        int valorMax = 50;

        // Só pode usar break no IF se ele estiver em um switch ou loop
        for (int i = 0; i < valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
