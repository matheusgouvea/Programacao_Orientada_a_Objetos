package com.poo.exerciciosroni;

import java.util.Scanner;

/*9) Fazer um algoritmo para ler a distância percorrida em km e o total
gasto de combustível, no final deverá ser exibido o consumo médio do carro.
 */

public class Exercicio9 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        float Dist_percorrida, Total_gasto, consumo_medio;

        System.out.println("Digite a distancia percorrida (Km): ");
        Dist_percorrida = leia.nextFloat();

        System.out.println("Digite o total gasto de combustível (L): ");
        Total_gasto = leia.nextFloat();

        consumo_medio = Dist_percorrida / Total_gasto;

        System.out.println("O consumo médio em (Km/l) foi: "+ consumo_medio);

    }
}
