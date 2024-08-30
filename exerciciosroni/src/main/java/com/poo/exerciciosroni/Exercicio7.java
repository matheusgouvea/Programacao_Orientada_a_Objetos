package com.poo.exerciciosroni;

import java.util.Scanner;

/*7) Criar um algoritmo que leia dois números inteiros e imprima a seguinte saída: 
    Dividendo, Divisor, Quociente e Resto*/

public class Exercicio7 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        int Dividendo, Divisor, Quociente, Resto;

        System.out.println("Digite um dividendo: ");
        Dividendo = leia.nextInt();

        System.out.println("Digite um divisor: ");
        Divisor = leia.nextInt();

        Quociente = Dividendo/Divisor;
        Resto = Dividendo % Divisor;

        System.out.println("Dividendo: " + Dividendo + ", divisor: " + Divisor + ", Quociente: " + Quociente +", Resto: " + Resto);
     
    }
}
