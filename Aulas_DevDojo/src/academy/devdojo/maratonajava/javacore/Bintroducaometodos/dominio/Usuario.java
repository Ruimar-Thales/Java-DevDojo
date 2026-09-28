package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Objects;

public class Usuario {
    private String login;
    private String senha = "senha";

    public void alterarSenha(String senhaAntiga, String senhaNova){
        if (Objects.equals(senhaAntiga, senha)){
            senha = senhaNova;
        }else{
            System.out.println("Senha inválida");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

}
