package com.alura.exercicios.sexto;

public class CalcularPrecoComDesconto {
  public static void main(String[] args) {
    //* Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

    double precoOriginal = 150; // Criado uma variável double chamada precoOriginal e atribuído o valor 150.
    double percentualDesconto = 10; // Criado uma variável double chamada percentualDesconto e atribuído o valor 10.
    double desconto = precoOriginal * percentualDesconto / 100; // Criado uma variável double chamada desconto e atribuído o valor do desconto.
    double precoComDesconto = precoOriginal - desconto; // Criado uma variável double chamada precoComDesconto e atribuído o valor do preço com desconto.
    System.out.printf("O preço original é: R$%.2f, o desconto é: R$%.2f e o preço com desconto é: R$%.2f", precoOriginal, desconto, precoComDesconto); // Exibe o preço com desconto
  }
}
