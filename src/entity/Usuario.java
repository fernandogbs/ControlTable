package entity;

public class Usuario {

    private int idusuario;
    private String nome;
    private String login;
    private String senha;
    private String email;
    

    public int getIdusuario() {
        return idusuario;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }


    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
}
