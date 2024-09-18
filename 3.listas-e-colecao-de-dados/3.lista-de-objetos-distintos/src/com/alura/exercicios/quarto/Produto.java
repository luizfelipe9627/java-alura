package com.alura.exercicios.quarto;

//* Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

public class Produto {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private String nome; // Criado um atributo do tipo String chamado nome, que armazena o nome do produto.
  private double preco; // Criado um atributo do tipo double chamado preco, que armazena o preço do produto.

  // Criado um construtor que recebe o nome e o preço do produto.
  public Produto(String nome, double preco) {
    this.nome = nome; // Atribui o nome recebido ao atributo nome.
    this.preco = preco; // Atribui o preço recebido ao atributo preco.
  }

  // Criado um método getter chamado getNome que retorna o nome do produto.
  public String getNome() {
    return nome; // Retorna o nome do produto.
  }

  // Criado um método getter chamado getPreco que retorna o preço do produto.
  public double getPreco() {
    return preco; // Retorna o preço do produto.
  }

  // Criado um método setter chamado setNome que recebe um nome e atribui ao atributo nome.
  public void setNome(String nome) {
    this.nome = nome; // Atribui o nome recebido ao atributo nome.
  }

  // Criado um método setter chamado setPreco que recebe um preço e atribui ao atributo preco.
  public void setPreco(double preco) {
    this.preco = preco; // Atribui o preço recebido ao atributo preco.
  }
}
