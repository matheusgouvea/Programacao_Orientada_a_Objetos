package com.poo.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){

        //8) Calcule a área e o preço de um terreno.

        double area, preco;

        System.out.print("Escreva a metragem quadrada: ");
        Scanner leia = new Scanner(System.in);
        area = leia.nextDouble();

        System.out.print("Escreva o valor do m²: ");
        preco = leia.nextDouble();

        System.out.print("O preço do terreno é de R$" + preco * area);


    }

}
