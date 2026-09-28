package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[10];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }

    static {
        System.out.println("Dentro do segundo bloco de inicialização");
    }

    static {
        System.out.println("Dentro do terceiro bloco de inicialização");
    }

    {
        System.out.println("Não estático");
    }

    public Anime(String nome){
        this.nome = nome;
    }


    public Anime(){
        for(int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
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

