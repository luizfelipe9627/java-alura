package com.alura.exercicios.primeiro;

import java.util.Scanner;

  //* Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo. Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Está sendo criado um novo objeto Scanner chamado scanner que será usado para ler a entrada do usuário.

    System.out.print("Digite o número que deseja dividir: "); // Está sendo impresso uma mensagem pedindo para o usuário digitar o número que deseja dividir.
    var num1 = scanner.nextInt(); // Está sendo lido a entrada do usuário e armazenado na variável num1.

    System.out.print("Digite o número pelo qual deseja dividir: "); // Está sendo impresso uma mensagem pedindo para o usuário digitar o número pelo qual deseja dividir.
    var num2 = scanner.nextInt(); // Está sendo lido a entrada do usuário e armazenado na variável num2.

    // O try é um bloco que contém código que pode lançar uma exceção, e o catch é um bloco que captura a exceção lançada no bloco try e trata o erro, já o finally é um bloco que é executado sempre, independente se ocorreu uma exceção ou não.
    try {
      System.out.println("Resultado da divisão: " + num1 / num2); // Está sendo impresso o resultado da divisão dos números.
    } catch (ArithmeticException e) {
      System.out.println("Error: Não é possível dividir por zero."); // Está sendo impresso uma mensagem informando que não é possível dividir por zero.
    } finally {
      scanner.close(); // Está sendo fechado o objeto scanner.
    }
  }
}
