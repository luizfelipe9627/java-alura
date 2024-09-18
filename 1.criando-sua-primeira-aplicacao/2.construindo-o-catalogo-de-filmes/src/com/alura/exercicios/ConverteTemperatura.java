package com.alura.exercicios;

public class ConverteTemperatura {
  public static void main(String[] args) {
    //* > Conversão de Temperatura
    /*
      Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
    */

    // Fórmula: F = C * 1.8 + 32
    double celsius = 31.5; // Criado uma variável do tipo double chamada celsius que armazena o valor 30.

    double fahrenheit = celsius * 1.8 + 32; // Criado uma variável do tipo double chamada fahrenheit que armazena o valor convertido de celsius para fahrenheit.

    int fahrenheitInteiro = (int) fahrenheit; // Criado uma variável celsiusInteiro que converte a variável celsius para um inteiro.

    System.out.println("A temperatura de " + celsius + "°C é igual a " + fahrenheitInteiro + "°F."); // Imprime o valor da variável fahrenheit no console.
  }
}
