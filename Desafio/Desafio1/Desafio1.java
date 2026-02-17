package Desafio.Desafio1;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============== Serviço AWS ==============");
        System.out.print("Informe seu serviço: ");
        String solicitacao = scanner.nextLine();
        String texto = solicitacao.toLowerCase();

        if(texto.contains("servidor")){
            System.out.println("EC2");
        } else if(texto.contains("armazenar") || texto.contains("imagens") || texto.contains("videos")){
            System.out.println("S3");
        } else if(texto.contains("banco de dados") || texto.contains("relacional")){
            System.out.println("RDS");
        } else if(texto.contains("funcoes") || texto.contains("sem servidor")){
            System.out.println("Lambda");
        } else {
            System.out.println("Servico desconhecido");
        }

        scanner.close();
    }
}