package com.alura.exercicios.quinto;

//* Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

public class Main {
  public static void main(String[] args) {
    System.out.println("--------------------------------------------------");

    ProdutoFisico produtoFisico = new ProdutoFisico(); // Está sendo instanciado um objeto da classe ProdutoFisico chamado produtoFisico.
    produtoFisico.setNome("Notebook"); // Está sendo chamado o método setNome do objeto produtoFisico e passando o valor "Notebook".
    produtoFisico.setPreco(2000); // Está sendo chamado o método setPreco do objeto produtoFisico e passando o valor 2000 que é o preço do produto.
    produtoFisico.setDesconto(10); // Está sendo chamado o método setDesconto do objeto produtoFisico e passando o valor 10 que é 10% de desconto.
    System.out.println("O preço final do produto físico é: R$ " + produtoFisico.calcularPrecoFinal());

    System.out.println("--------------------------------------------------");

    Livro livro = new Livro(); // Está sendo instanciado um objeto da classe Livro chamado livro.
    livro.setNome("Java: Como Programar"); // Está sendo chamado o método setNome do objeto livro e passando o valor "Java: Como Programar".
    livro.setPreco(100); // Está sendo chamado o método setPreco do objeto livro e passando o valor 100 que é o preço do livro.
    livro.setDesconto(20); // Está sendo chamado o método setDesconto do objeto livro e passando o valor 20 que é 20% de desconto.
    System.out.println("O preço final do livro é: R$ " + livro.calcularPrecoFinal());
  }
}
