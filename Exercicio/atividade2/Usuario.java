package Exercicio.atividade2;

public abstract class Usuario {

    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;

    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    // Getters e Setters (somente os que fazem sentido)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    // email pode ser alterado
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    // senha protegida
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    public void realizarLogin() {
        System.out.println(nome + " realizou login.");
    }

    public void realizarLogoff() {
        System.out.println(nome + " realizou logoff.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso.");
    }
}