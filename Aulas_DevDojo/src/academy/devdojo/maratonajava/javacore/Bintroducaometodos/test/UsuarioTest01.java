package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Usuario;

public class UsuarioTest01 {
    public static void main(String[] args) {

        Usuario user = new Usuario();

        user.alterarSenha("senha", "12345");

        System.out.println(user.getSenha());

    }
}
