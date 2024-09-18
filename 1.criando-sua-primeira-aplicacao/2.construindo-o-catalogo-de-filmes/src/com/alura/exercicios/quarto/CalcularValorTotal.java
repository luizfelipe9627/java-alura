package com.alura.exercicios.quarto;

public class CalcularValorTotal {
  public static void main(String[] args) {
    //* Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

    double precoProduto = 9.99; // Criado uma variável double chamada precoProduto e atribuído o valor 9.99.
    int quantidade = 5; // Criado uma variável inteira chamada quantidade e atribuído o valor 5.
    double total = precoProduto * quantidade; // Calcula o total da compra.
    System.out.println("O total da compra é: R$" + total); // Exibe o total da compra.
  }
}
