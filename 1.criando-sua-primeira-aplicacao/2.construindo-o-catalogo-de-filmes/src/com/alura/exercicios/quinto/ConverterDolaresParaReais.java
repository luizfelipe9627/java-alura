package com.alura.exercicios.quinto;

public class ConverterDolaresParaReais {
  public static void main(String[] args) {
    //* Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

    double valorEmDolares = 2; // Criado uma variável double chamada valorEmDolares e atribuído o valor 2.
    double taxaConversao = 4.94; // Criado uma variável double chamada taxaConversao e atribuído o valor 4.94.
    double valorEmReais = valorEmDolares * taxaConversao; // Criado uma variável double chamada valorEmReais e atribuído o valor convertido.
    System.out.printf("O valor de R$%.2f em dólares é: US$%.2f \n", valorEmReais, valorEmDolares); // Exibe uma mensagem formatada com o valor convertido.
  }
}
