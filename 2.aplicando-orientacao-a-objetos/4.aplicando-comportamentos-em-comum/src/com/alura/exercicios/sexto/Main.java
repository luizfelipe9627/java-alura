package com.alura.exercicios.sexto;

//* Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

public class Main {
  public static void main(String[] args) {
    System.out.println("--------------------------------------------------");

    Produto produto = new Produto(); // Está sendo instanciado um objeto da classe Produto chamado produto.
    produto.setQuantidade(15); // Está sendo chamado o método setQuantidade do objeto produto e passando o valor 15 que é a quantidade de produtos.
    produto.setPrecoUnitario(100); // Está sendo chamado o método setPrecoUnitario do objeto produto e passando o valor 100 que é o preço unitário do produto.
    System.out.println("O preço total dos produtos é: R$ " + produto.calcularPrecoTotal()); // Está imprimindo o valor total dos produtos.
    System.out.println("Pela quantidade de produtos, o desconto foi de: " + produto.getDesconto() + "%"); // Está imprimindo o desconto dos produtos.

    System.out.println("--------------------------------------------------");

    Servico servico = new Servico(); // Está sendo instanciado um objeto da classe Servico chamado servico.
    servico.setPrecoPorHora(50); // Está sendo chamado o método setPrecoPorHora do objeto servico e passando o valor 50 que é o preço do serviço.
    servico.setHorasDeServico(10); // Está sendo chamado o método setHorasDeServico do objeto servico e passando o valor 10 que é a quantidade de horas do serviço.
    System.out.println("O preço total do serviço é: R$ " + servico.calcularPrecoTotal()); // Está imprimindo o valor total do serviço.
  }
}
