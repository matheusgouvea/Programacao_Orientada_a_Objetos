package com.poo.exerciciosroni;

import java.util.Scanner;

/*5) Uma empresa paga R$10.00 por hora normal trabalhada e R$ 15.00 por hora extra.
Escreva um algoritmo que leia o total de horas normais trabalhadas e o total de horas
extras trabalhadas por um empregado em um ano e calcule o salário anual deste trabalhador. 
Exemplo :       Entrada :  Digite o número de horas trabalhadas no ano : 1760 
	            Digite o número de horas extras trabalhadas no ano : 400 
                Saída :    Seu salário anual é de : R$ 23600 
 */

public class Exercicio5 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        int hora, hora_extra;
        double salario_h = 10.00, salario_h_extra = 15.00;
     
        System.out.println("Digite o número de horas trabalhadas no ano: ");
        hora = leia.nextInt();

        System.out.println("Digite o número de horas extras no ano: ");
        hora_extra = leia.nextInt();

        System.out.println("Seu salário anual é de: R$" + (hora * salario_h + hora_extra * salario_h_extra));

    }
}
