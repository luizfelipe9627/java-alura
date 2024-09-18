package com.alura.exercicios.quinto;

import java.util.Scanner;

public class ParOuImpar {
  public static void main(String[] args) {
    //* Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    System.out.println("Digite um número inteiro: "); // Exibe a mensagem no console, solicitando que o usuário digite um número inteiro.
    int numero = scanner.nextInt(); // Lê um número inteiro da entrada padrão e armazena na variável numero.

    if(numero % 2 == 0) {
      System.out.println("O número " + numero + " é par."); // Exibe a mensagem no console, informando que o número é par.
    } else {
      System.out.println("O número " + numero + " é ímpar."); // Exibe a mensagem no console, informando que o número é ímpar.
    }

    scanner.close(); // Fecha o recurso scanner.
  }
}
