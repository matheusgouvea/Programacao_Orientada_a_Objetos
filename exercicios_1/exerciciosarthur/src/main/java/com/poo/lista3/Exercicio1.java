package com.poo.lista3;

import java.util.Scanner;

public class Exercicio1 {

    public static void resolucao(){

        Scanner  Scanner1 = new Scanner(System.in);

        int numero;

        System.out.print("Digite o número pra iniciar o cronômetro (entre 1 e 59): ");
        numero=  Scanner1.nextInt();

        if((numero>= 60) ||(numero <=0) ){
        System.out.print("Erro. Digite um número válido  ");
        }else{
        for (int i =numero ; i > 0 ; i--) {
        System.out.println(i);
    }
        System.out.println("Programa encerrado");
        }
        
Scanner1.close();
        }
    }