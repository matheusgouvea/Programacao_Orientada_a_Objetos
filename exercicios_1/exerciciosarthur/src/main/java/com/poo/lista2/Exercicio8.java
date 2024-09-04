package com.poo.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao(){

        /*8) Crie um joguinho de perguntas e respostas de múltipla escolha. O programa
         * deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo.
         * Se o usuário chegar até o final o programa deve exibir o número de acertos.
         */

         Scanner leia = new Scanner(System.in);
          int chances = 3;
          int pontuacao = 0;

          System.out.println("Qual é o nome do famoso personagem pequeno que é elfo doméstico em Harry Potter?" +
          "\n"+
          "a) Yoda"+
          "\nb) Mago"+
          "\nc) Elfo"+
          "\nd) Dobby");
          char resposta1 = leia.next().toLowerCase().charAt(0);
          if(resposta1 == 'd'){
            pontuacao ++;
          }else{
            chances--;
            System.out.println("Resposta errada, você tem "+chances+" chances restantes.");  
          }
          if(chances > 0){
            System.out.println("Qual é o nome do herói que usa um escudo redondo nos filmes da Marvel?"+
            "\n"+
            "a) Homem de ferro"+
            "\nb) Hulk"+
            "\nc) Mario"+
            "\nd) Capitão América");
            char resposta2 = leia.next().toLowerCase().charAt(0);
            if(resposta2 == 'd'){
                pontuacao++;
            }else{
                chances--;
                System.out.println("Resposta errada, você tem "+chances+" chances restantes.");
            }
            if(chances > 0){
                System.out.println("Qual é o nome do universo de super-heróis criado por Stan Lee e Jack Kirby que inclui personagens como Spider-Man e Iron Man?"+
                "\n"+
                "a) DC"+
                "\nb) Harry Potter"+
                "\nc) Marvel"+
                "\nd) Senhor dos Anéis");
                char resposta3 = leia.next().toLowerCase().charAt(0);
                if(resposta3 == 'c'){
                    pontuacao++;
                }else{
                    chances--;
                    System.out.println("Resposta errada, você tem "+chances+" chances restantes.");
                }
          }
          if(chances > 0){
            System.out.println("Qual é o nome do famoso game de simulação de vida desenvolvido pela Maxis?"+
            "\n"+
            "a) Call of Duty"+
            "\nb) The Sims"+
            "\nc) inZoi"+
            "\nd) Roblox");
            char resposta4 = leia.next().toLowerCase().charAt(0);
            if(resposta4 == 'b'){
                pontuacao++;
            }else{
                chances--;
                System.out.println("Resposta errada, você tem "+chances+" chances restantes.");
            }
    }
    if(chances > 0){
        System.out.println("Qual é o nome do famoso jogo de aventura e exploração onde o personagem principal é um encanador que deve salvar a Princesa dos vilões?"+
        "\n"+
        "a) Super Mario Bros"+
        "\nb) Fortnite"+
        "\nc) Five Nights at Freddys"+
        "\nd) Amnesia");
        char resposta5 = leia.next().toLowerCase().charAt(0);
        if(resposta5 == 'a'){
            pontuacao++;
        }else{
            chances--;
            System.out.println("Resposta errada, você tem "+chances+" chances restantes.");
        }

        }
        if(chances ==0){
        System.out.println("Você esgotou suas chances! Fim de jogo.");
        }else{
        System.out.println("Sua pontuação final: "+pontuacao+" de 5.");
    }leia.close();}
     }  
}