package com.poo.lista3;

/* */

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){

        int numero;
        int numeroPalpite;

        Scanner Scanner = new Scanner(System.in);
       
        System.out.print("\nDigite um número para ser adivinhado entre 0 a 50: ");
        numero = Scanner.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        
        do{
            System.out.print("Tente adivinhar o número digitado: ");
            numeroPalpite = Scanner.nextInt();

            if (numeroPalpite == numero){
                System.out.print("Parabéns! Você acertou.");

            }else if (numeroPalpite == (numero - 1) || numeroPalpite == (numero + 1)){
                System.out.print("Está muito quente! ");

            }else if (numeroPalpite == (numero - 2) || numeroPalpite == (numero + 2)){
                System.out.print("Está quente! ");
            
            }else if (numeroPalpite == (numero - 3) || numeroPalpite == (numero + 3)){
            System.out.print("Está morno! ");

            }else if (numeroPalpite == (numero - 4) || numeroPalpite == (numero + 4)){
            System.out.print("Está frio! ");
        
            }else{
                System.out.print("Tá muito frio! ");
            }
        
        }while(numeroPalpite != numero);
    }
}