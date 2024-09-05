package com.poo.lista3;

/*6) Escreva um programa que seja capaz de desenhar uma pirâmide de asteriscos.
o usuário deverá informar quantos andares ele deseja que a pirâmide tenha. */

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){

        System.out.print("Digite a altura da pirâmide: ");
        Scanner Scanner = new Scanner(System.in);
       
        int altura = Scanner.nextInt();
       
        System.out.print("\n");
        
        for (int i = 0; i < altura; i++) {
            for (int j = altura - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("-");
            }
            System.out.println();
        }  
    }
}