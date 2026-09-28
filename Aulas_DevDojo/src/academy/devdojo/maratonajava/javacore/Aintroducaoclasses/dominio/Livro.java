package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;


    public Livro(String titulo, String  autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void imprime(){
        System.out.println("-----------------------");
        System.out.println(autor);
        System.out.println(titulo);
        System.out.println(paginas);

    }
}
