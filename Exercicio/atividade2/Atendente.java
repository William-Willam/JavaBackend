package Exercicio.atividade2;

public class Atendente extends Usuario {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorEmCaixa = 0.0;
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento recebido: R$ " + valor);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor total: R$ " + valorEmCaixa);
        valorEmCaixa = 0;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
}