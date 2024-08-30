package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio1 {

    public static void resolucao() {
        
        //1) Leia dois valores pelo teclado 

		int n1; //variavel 1 inteiro n1
		int n2; //variavel 2 inteiro n2

		System.out.print("Digite o primeiro número: ");		//Aqui é o "Escreva"
		Scanner scannerLeia = new Scanner(System.in);			//Aqui cria o scanner
		n1 = scannerLeia.nextInt();								//Aqui é o "leia"
		
		System.out.println("O primeiro número é: "+n1+"\n");

		System.out.println("Digite o segundo número: ");
		n2 = scannerLeia.nextInt();

		System.out.println("O segundo número é: "+n2);

		System.out.println("A Soma é: "+(n1+n2));
        
    }
}
