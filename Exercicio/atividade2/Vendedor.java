package Exercicio.atividade2;

public class Vendedor extends Usuario {

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Quantidade de vendas: " + quantidadeVendas);
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
}