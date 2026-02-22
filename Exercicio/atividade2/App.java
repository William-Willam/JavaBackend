package Exercicio.atividade2;

public class App {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", "carlos@empresa.com", "123");
        Vendedor vendedor = new Vendedor("Ana", "ana@empresa.com", "456");
        Atendente atendente = new Atendente("João", "joao@empresa.com", "789");

        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.realizarLogoff();

        System.out.println();

        vendedor.realizarLogin();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.realizarLogoff();

        System.out.println();

        atendente.realizarLogin();
        atendente.receberPagamento(150.00);
        atendente.receberPagamento(50.00);
        atendente.fecharCaixa();
        atendente.realizarLogoff();
    }
}