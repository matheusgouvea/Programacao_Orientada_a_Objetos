package com.poo.lista4;

/*1) Voce é gerente de um supermercado e sabe que os valores das
     vendas do dia são gravados em um vetor. Digite um código que faça o
     fechamento (soma) de vendas do dia de maneira automatizada. */

import java.util.Scanner;

public class Exercicio1 {
    
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        int nVendas;
        double soma = 0;
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("Bem-vindo ao sistema de vendas!");
        System.out.print("\nPor favor digite quantas vendas foram realizadas hoje: ");
        nVendas = leia.nextInt();
        System.out.print("\n");
        double[] vendas = new double[nVendas];

        for (int i = 0 ; i < nVendas ; i++) {
            System.out.print("Digite o valor da " + (i+1) + "° venda" + ": R$");
            vendas[i] = leia.nextDouble();
            
        }
        for (double venda : vendas) {
            soma += venda;    
        }
        System.out.print("\nO total das vendas foi: R$" + soma+ "\n\n");
        System.out.println("Programa encerrado.");
        System.out.println("\n\n");
    }
}