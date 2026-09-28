package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class TesteDeParametros {
    public int numero;
    public String palavra;

    public TesteDeParametros(int numero, String palavra){
        this.numero = numero;
        this.palavra = palavra;
    }

    public void tentaAlterarNumero(int num){
        num = 100;
    }

    public void alteraNumero(TesteDeParametros obj){
        obj.numero = 106;
    }
}
