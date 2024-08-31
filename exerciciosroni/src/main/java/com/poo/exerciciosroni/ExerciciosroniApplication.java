package com.poo.exerciciosroni;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosroniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosroniApplication.class, args);

		// chamar/invocar a classe que eu criei

		Exercicio2.resolucao(); // é como se fosse "função resolução()" do portugol

	}
	

}
