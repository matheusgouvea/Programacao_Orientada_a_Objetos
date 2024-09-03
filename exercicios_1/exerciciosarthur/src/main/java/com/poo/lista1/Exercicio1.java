package com.poo.lista1;

import java.util.Scanner;

/*1) Escreva um programa que faça a soma entre 2 números.*/

public class Exercicio1 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = leia.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = leia.nextInt();

        int soma;

        soma = (num1 + num2);
        System.out.println(num1+" + "+num2+" = "+soma);

    }

}
