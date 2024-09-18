package com.alura.exercicios;
import java.util.Random; // Importa a classe Random do pacote java.util, que gera números aleatórios.
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de dados de entrada a partir da entrada padrão.

public class JogoAdvinhacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    int randomNum = new Random().nextInt(10); // Gera um número aleatório entre 0 e 100 e armazena na variável randomNum.
    int chances = 5;

    // O for inicializa a variável i com o valor 1. Enquanto i for menor que chances, executa o bloco de código e incrementa i em 1.
    for(int i = 1; i < chances; i++) {
      System.out.println("Digite um número entre 0 e 10: "); // Imprime a mensagem no console.
      
      int num = scanner.nextInt(); // Cria uma variável do tipo int chamada num que armazena o valor do tipo int digitado pelo usuário.

      // Se o número digitado for igual ao número aleatório, executa o bloco de código.
      if(num == randomNum) {
        System.out.println("Parabéns, você acertou!"); // Imprime a mensagem "Parabéns, você acertou!".
        break; // Encerra o laço.
      } 
      // Se o i for igual a chances - 1, ou seja, se for a última chance, executa o bloco de código.
      else if(i == chances - 1) {
        System.out.println("Suas chances acabaram! O número era " + randomNum); // Imprime a mensagem "Suas chances acabaram! O número era " + o número aleatório.
      }
      // Se não, verifica se o número digitado é maior ou menor que o número aleatório e imprime a mensagem correspondente.
      else if(num < randomNum) {
        System.out.println("O número é maior que " + num); // Imprime a mensagem "O número é maior que " + o número digitado.
        System.out.println("Você tem " + (chances - i) + " chances."); // Imprime a mensagem "Você tem " + (chances - i) + " chances.".
      } 
      // Se não, imprime a mensagem "O número é menor que " + o número digitado.
      else {
        System.out.println("O número é menor que " + num); // Imprime a mensagem "O número é menor que " + o número digitado.
        System.out.println("Você tem " + (chances - i) + " chances."); // Imprime uma mensagem informando quantas chances restam.
      }
    }

    scanner.close(); // Fecha o objeto scanner.
  }
}
