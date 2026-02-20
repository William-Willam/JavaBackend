package Exercicio.atividade1;

public class IngressoFamilia extends Ingresso {

    private int pessoas;

    public IngressoFamilia(Double valor, String nomeFilme, boolean dublado, int pessoas) {
        super(valor, nomeFilme, dublado);
        this.pessoas = pessoas;
    }

    public IngressoFamilia(){}

    @Override
    public double ValorReal() {
        double total = getValor() * pessoas;

        if (pessoas > 3) {
            total *= 0.95;
        }

        return total;
    }
}