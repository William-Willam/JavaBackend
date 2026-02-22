package Exercicio.atividade1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("+++         Cinema       +++");
        System.out.println("============================");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do filme: ");
        String nomeFilme = teclado.nextLine();

        System.out.print("Digite o valor do ingresso: ");
        double valor = teclado.nextDouble();

        System.out.print("O filme é dublado? (true/false): ");
        boolean dublado = teclado.nextBoolean();

        System.out.print("Quantidade de pessoas (ingresso família): ");
        int pessoas = teclado.nextInt();

        MeiaEntrada meia = new MeiaEntrada(valor, nomeFilme, dublado);
        IngressoFamilia familia = new IngressoFamilia(valor, nomeFilme, dublado, pessoas);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Meia entrada: R$ " + meia.ValorReal());
        System.out.println("Ingresso família: R$ " + familia.ValorReal());

        teclado.close();
    }
}