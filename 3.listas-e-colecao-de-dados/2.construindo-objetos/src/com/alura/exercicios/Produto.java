package com.alura.exercicios;

//* Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

public class Produto {
  // Os atributos privados não podem ser acessados diretamente por outras classes, somente por getters e setters.
  private String nome; // Criado um atributo do tipo String chamado nome, que armazena o nome do produto.
  private double preco; // Criado um atributo do tipo double chamado preco, que armazena o preço do produto.
  private int quantidade; // Criado um atributo do tipo int chamado quantidade, que armazena a quantidade do produto.

  //* Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.

  // Método construtor que recebe o nome, preço e quantidade do produto.
  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome; // Atribui o valor do parâmetro nome ao atributo nome.
    this.preco = preco; // Atribui o valor do parâmetro preco ao atributo preco.
    this.quantidade = quantidade; // Atribui o valor do parâmetro quantidade ao atributo quantidade.
  }

  //* Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().

  @Override // Indica que o método está sobrescrevendo um método da superclasse.
  // Método que retorna uma String com os valores dos atributos.
  public String toString() {
    return "Nome: " + this.nome + ", Preço: " + this.preco + ", Quantidade: " + this.quantidade; // Retorna uma String com os valores dos atributos.
  }
}
