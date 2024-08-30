package com.poo.exerciciosroni;

import java.util.Scanner;

/*8) Calcule a área e o preço de um terreno
    area = largura x comprimento
    preco = área x preco do metro quadrado */

public class Exercicio8 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        float largura, comprimento;

        System.out.println("Escreva a largura: ");
        largura = leia.nextFloat();

        System.out.println("Escreva o comprimento: ");
        comprimento = leia.nextFloat();

        float area = (largura * comprimento);
        System.out.println("Area: " + area);

        float preco_m_quadrado;
        System.out.println("Preço M²: ");
        preco_m_quadrado = leia.nextFloat();

        float preco = (area * preco_m_quadrado);
        System.out.println("Valor total: R$" + preco);


    }

}
