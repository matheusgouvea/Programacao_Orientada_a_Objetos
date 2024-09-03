package com.poo.lista2;

import java.util.Scanner;
import java.io.Console; //adicionado para inserir console.

/*5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
algum deles estiver errado o programa deve retornar ao usuário quais das opções
está errada, se é o login ou a senha. */

public class Exercicio5 {
    public static void resolucao() {
        
        Scanner leia = new Scanner(System.in);
        Console console = System.console(); //item para ler sem exibir os caracteres.
        String cad_login, cad_senha;

        System.out.println("Para realizar um cadastro preencha os campos a seguir.");
        System.out.print("Digite um usuário: ");
        cad_login = leia.nextLine();
        System.out.print("Digite uma senha: ");
        cad_senha = leia.nextLine();
        
        System.out.println("-------------------------------");
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("-------------------------------");
        boolean loginCorreto = false;

        System.out.println("\nInsira seus dados para realizar o login. ");

        while (!loginCorreto) {
        
        String login, senha;

        System.out.print("\nDigite o seu usuário: ");
        login = leia.nextLine();
        System.out.print("Digite sua senha: ");
        senha = leia.nextLine();
        
        if (cad_login.equals(login) && cad_senha.equals(senha)) {
            System.out.println("\n----------------------------");
            System.out.println("Login realizado com sucesso.");
            System.out.println("----------------------------");
            loginCorreto = true;
        } else {
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Os dados informados não estão corretos, tente novamente.");
            System.out.println("--------------------------------------------------------");
        }
    }

    }
}
