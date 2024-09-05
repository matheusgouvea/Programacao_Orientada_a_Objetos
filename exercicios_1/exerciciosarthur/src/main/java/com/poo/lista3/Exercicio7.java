package com.poo.lista3;

/*7) Aproveitando o exercício anterior, escreva um programa que consiga
construir um retângulo. O usuário deve informar a largura e a altura em
asteriscos */

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){
        
        Scanner Scanner = new Scanner(System.in);

        int largura;
        int altura;
            
        System.out.print("Altura: ");
        altura = Scanner.nextInt();
    
        System.out.print("Largura: ");
        largura = Scanner.nextInt();
        
        System.out.println();
            
        for (int j = 0; j < altura; j++) {
            for (int i = 0; i < largura; i++) {
                System.out.print("*  ");
            }  
        System.out.println();
        }
    }
}