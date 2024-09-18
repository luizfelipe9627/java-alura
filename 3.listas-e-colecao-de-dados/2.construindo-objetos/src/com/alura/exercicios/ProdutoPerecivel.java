package com.alura.exercicios;

//* Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.

public class ProdutoPerecivel extends Produto {
  // Os atributos privados não podem ser acessados diretamente por outras classes, somente por getters e setters.
  private String dataValidade; // Criado um atributo do tipo String chamado dataValidade, que armazena a data de validade do produto perecível.

  // Método construtor que recebe o nome, preço, quantidade e data de validade do produto perecível.
  public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
    super(nome, preco, quantidade); // Chama o construtor da superclasse Produto e passa os valores dos parâmetros nome, preco e quantidade.
    this.dataValidade = dataValidade; // Atribui o valor do parâmetro dataValidade ao atributo dataValidade.
  }
}
