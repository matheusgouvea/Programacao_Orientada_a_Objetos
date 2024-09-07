package com.poo.lista4;

/*4) Escreva um código que irá percorrer uma lista de números inteiros
        lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 } e irá contar a quantidade de
        números pares presente nela. */

import java.util.Scanner;

public class Exercicio4 {

        public static void resolucao(){
            Scanner leia = new Scanner(System.in);

            int lista[] = {3,5,6,7,8,10,22,55,110};
            int contPar = 0;

            for (int nPar : lista) {
                if (nPar % 2 == 0 ){
                contPar++;
                }
            }
            System.out.println("\n\n\n");
            System.out.println("Quantos números pares contém na lista {3,5,6,7,8,10,22,55,110}?");
            System.out.println("A lista possui "+contPar+" números pares.");
            System.out.println("\n\n\n");
        }
}