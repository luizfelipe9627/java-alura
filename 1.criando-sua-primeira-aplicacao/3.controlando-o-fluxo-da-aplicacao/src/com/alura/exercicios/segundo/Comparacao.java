package com.alura.exercicios.segundo;

import java.util.Scanner;

public class Comparacao {
  public static void main(String[] args) {
    //* Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    System.out.println("Digite o 1º número inteiro: "); // Exibe a mensagem no console, solicitando que o usuário digite um número inteiro.
    int num1 = scanner.nextInt(); // Lê um número inteiro da entrada padrão e armazena na variável num1.

    System.out.println("Digite o 2º número inteiro: "); // Exibe a mensagem no console, solicitando que o usuário digite um número inteiro.
    int num2 = scanner.nextInt(); // Lê um número inteiro da entrada padrão e armazena na variável num2.

    // Se num1 for maior que num2, executa o bloco de código abaixo.
    if(num1 > num2) {
      System.out.println("O número " + num1 + " é maior que o número " + num2 + "."); // Exibe a mensagem no console, informando que num1 é maior que num2.
    }
    // Se num2 for maior que num1, executa o bloco de código abaixo.
    else if(num2 > num1) {
      System.out.println("O número " + num2 + " é maior que o número " + num1 + "."); // Exibe a mensagem no console, informando que num2 é maior que num1.
    }
    // Se num1 e num2 forem iguais, executa o bloco de código abaixo.
    else {
      System.out.println("Os números " + num1 + " e " + num2 + " são iguais."); // Exibe a mensagem no console, informando que num1 e num2 são iguais.
    }

    scanner.close(); // Fecha o recurso scanner.
  }
}