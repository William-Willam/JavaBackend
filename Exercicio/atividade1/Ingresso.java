package Exercicio.atividade1;

public abstract class Ingresso {
    // atributos
    private Double valor;
    private String nomeFilme;
    private boolean dublado;

    // construtor
    public Ingresso(Double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public Ingresso() {
    }

    // getters e setters
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    // metodos
    public abstract double ValorReal();

}
