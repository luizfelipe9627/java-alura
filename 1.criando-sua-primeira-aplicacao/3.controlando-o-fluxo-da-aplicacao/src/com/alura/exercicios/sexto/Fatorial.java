package com.alura.exercicios.sexto;

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    //* Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    System.out.println("Digite um número: "); // Exibe a mensagem no console, solicitando que o usuário digite um número inteiro.
    int numero = scanner.nextInt(); // Lê um número inteiro da entrada padrão e armazena na variável numero.

    int fatorial = 1; // Inicializa a variável fatorial com 1.

    // O for recebe a variável i igual a 1, enquanto i for menor ou igual ao número digitado pelo usuário, incrementa i em 1.
    for (int i = 1; i <= numero; i++) {
      fatorial *= i; // Calcula o fatorial do número digitado pelo usuário.
    }

    System.out.println("O fatorial de " + numero + " é: " + fatorial); // Exibe o fatorial do número digitado pelo usuário.

    scanner.close(); // Fecha o recurso scanner.
  }
}
