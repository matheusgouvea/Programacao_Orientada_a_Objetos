package com.poo.exerciciosarthur;

import java.util.Scanner;

/*3) Escreva uma calculadora que receba um valor em reais e
converta para dólar. Considere o valor do dólar a R$5,25. */

public class Exercicio3 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        float num1;

        System.out.println("Digite um valor em (R$): ");
        num1 = leia.nextFloat();

        System.out.println("O valor convertido será: $" + (num1 / 5.25));


    }

}
