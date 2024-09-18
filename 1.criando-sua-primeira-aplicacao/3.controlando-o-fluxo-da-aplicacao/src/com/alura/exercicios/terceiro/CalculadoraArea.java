package com.alura.exercicios.terceiro;

import java.util.Scanner;

public class CalculadoraArea {
  public static void main(String[] args) {
    //* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    // Exibe a mensagem no console, solicitando que o usuário escolha uma das opções.
    System.out.println("""
      ===== Calculadora de Área =====
      Escolha uma das opções abaixo:

      1. Calcular a área do quadrado
      2. Calcular a área do circulo
      3. Sair
      ===============================
    """);

    int opcao = scanner.nextInt(); // Lê um número inteiro da entrada padrão e armazena na variável opcao.

    // Se a opção for igual a 1, executa o bloco de código abaixo.
    if(opcao == 1) {
      System.out.println("Digite o lado do quadrado: "); // Exibe a mensagem no console, solicitando que o usuário digite o lado do quadrado.
      double lado = scanner.nextDouble(); // Lê um número real da entrada padrão e armazena na variável lado.

      double area = lado * lado; // Calcula a área do quadrado.
      System.out.println("A área do quadrado é: " + String.format("%.2f", area)); // Exibe a mensagem no console, informando a área do quadrado com duas casas decimais.
    }
    // Se a opção for igual a 2, executa o bloco de código abaixo.
    else if(opcao == 2) {
      System.out.println("Digite o raio do círculo: "); // Exibe a mensagem no console, solicitando que o usuário digite o raio do círculo.
      double raio = scanner.nextDouble(); // Lê um número real da entrada padrão e armazena na variável raio.

      double area = Math.PI * Math.pow(raio, 2); // Calcula a área do círculo.
      System.out.println("A área do círculo é: " + String.format("%.2f", area)); // Exibe a mensagem no console, informando a área do círculo com duas casas decimais.
    }
    // Se a opção for igual a 3, executa o bloco de código abaixo.
    else if(opcao == 3) {
      System.out.println("Saindo..."); // Exibe a mensagem no console, informando que o programa está saindo.
    }
    // Se a opção for diferente de 1, 2 ou 3, executa o bloco de código abaixo.
    else {
      System.out.println("Opção inválida."); // Exibe a mensagem no console, informando que a opção é inválida.
    }
  }
}
