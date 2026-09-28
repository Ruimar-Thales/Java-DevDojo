package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[10];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }

    public Anime(String nome){
        this.nome = nome;
    }


    public Anime(){
        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
    }

    public void init(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

