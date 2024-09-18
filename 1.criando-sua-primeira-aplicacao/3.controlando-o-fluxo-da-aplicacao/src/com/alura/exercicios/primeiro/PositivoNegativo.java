package com.alura.exercicios.primeiro;

import java.util.Scanner;

public class PositivoNegativo {
  public static void main(String[] args) {
    //* Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    System.out.println("Digite um número inteiro: "); // Exibe a mensagem no console, solicitando que o usuário digite um número inteiro.
    int numero = scanner.nextInt(); // Lê um número inteiro da entrada padrão e armazena na variável numero.

    // Se o número for maior que 0, executa o bloco de código abaixo.
    if(numero > 0) {
      System.out.println("O número " + numero + " é positivo."); // Exibe a mensagem no console, informando que o número é positivo.
    } else {
      System.out.println("O número " + numero + " é negativo."); // Exibe a mensagem no console, informando que o número é negativo.
    }

    scanner.close(); // Fecha o recurso scanner.
  }
}
