package com.poo.exerciciosroni;

import java.util.Scanner;

/*10) Criar um algoritmo para ler um tempo em segundos e fazer a impressão
 no console no seguinte formato: hora:minuto:segundos */

public class Exercicio10 {
    public static void resolucao() {
        
        int segundos, h, m, s, resto;

        System.out.print("Digite o tempo em segundos: ");
        Scanner leia = new Scanner(System.in);
        segundos = leia.nextInt();

        h = (segundos / 3600);
        resto = (segundos % 3600);
        m = (resto / 60);
        s = (resto % 60);

        System.out.println(h + "h:" + m + "m:" + s + "s");

    }
}
