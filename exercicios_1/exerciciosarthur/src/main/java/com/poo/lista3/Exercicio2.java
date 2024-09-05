package com.poo.lista3;
import java.util.Scanner;

/*2) Desenvolva um programa que receba um número do usuário e escreva a
tabuada dele.*/

public class Exercicio2 {

public static void resolucao(){
    Scanner scanner1 = new Scanner(System.in);

    int numero;

    System.out.print("Digite um número (entre 1 e 9) para fazermos a tabuada: ");
    numero= scanner1.nextInt();

    if((numero>= 10) ||(numero <=0) ){
    System.out.print("Erro. Digite um número válido para realizarmos a tabuada ");
    }else{
    for (int i = 1 ; i <=10 ; i++) {
        int resultado;
        resultado = numero * i ;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
    System.out.println("Programa encerrado");
    }
    
    scanner1.close();
}
}