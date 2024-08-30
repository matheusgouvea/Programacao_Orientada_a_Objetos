package com.poo.exerciciosroni;

import java.util.Scanner;

/*4) Faça um programa com duas variáveis ano_nascimento que receberá o ano que 
você nasceu e outra variável com o nome ano_futuro que deverá ser atribuído o
valor 2035.  Criar uma variável com o nome resultado para calcular a diferença.
No final escreva na tela qual será a sua idade em 2035*/

public class Exercicio4 {
    public static void resolucao() {
    Scanner leia = new Scanner(System.in);

    int ano_nascimento, ano_futuro = 2035, resultado;

        System.out.println("Digite o ano do seu nascimento: ");
        ano_nascimento = leia.nextInt();

        resultado = (ano_futuro - ano_nascimento); //Defini o calculo para resultado
        
        System.out.println("Sua idade será: " + (resultado) + " anos.");
        

    }
}
