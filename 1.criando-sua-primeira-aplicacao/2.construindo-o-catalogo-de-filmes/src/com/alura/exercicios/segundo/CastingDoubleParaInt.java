package com.alura.exercicios.segundo;

public class CastingDoubleParaInt {
  public static void main(String[] args) {
    //* Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

    double num = 20.5; // Criado uma variável double chamada num e atribuído o valor 20.5.
    int casting = (int) num; // Convertido o valor de num para inteiro e armazenado na variável casting.
    System.out.println("O valor de num é: " + num + " e o valor de casting é: " + casting); // Exibe a mensagem no console com os valores de num e casting.
  }
}
