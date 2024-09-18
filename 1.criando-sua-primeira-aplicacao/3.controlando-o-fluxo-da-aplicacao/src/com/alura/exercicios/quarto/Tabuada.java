package com.alura.exercicios.quarto;

import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    //* Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    System.out.println("Digite o número da tabuada: "); // Exibe a mensagem no console, solicitando que o usuário digite o número da tabuada.
    int tabuada = scanner.nextInt(); // Lê um número inteiro da entrada padrão e armazena na variável tabuada.
    int i = 1;

    // Enquanto i for menor que 11, executa o bloco de código abaixo.
    while(i < 11) {
      System.out.println(tabuada + " x " + i + " = " + (tabuada * i)); // Exibe a tabuada do número digitado pelo usuário.
      i++; // Incrementa a variável i em 1.
    }

    scanner.close(); // Fecha o recurso scanner.
  }
}
