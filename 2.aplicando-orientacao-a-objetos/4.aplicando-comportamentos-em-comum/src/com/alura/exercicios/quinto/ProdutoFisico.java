package com.alura.exercicios.quinto;

public class ProdutoFisico implements Calculavel {
  // O modificador private faz com que o atributo só possa ser acessado dentro da classe.
  private String nome; // Criado um atributo do tipo String chamado nome, que armazena o nome do produto.
  private double preco; // Criado um atributo do tipo double chamado preco, que armazena o preço do produto.
  private double desconto; // Criado um atributo do tipo double chamado desconto, que armazena o desconto do produto.

  // Criado um método getter chamado getNome, que retorna o valor do atributo nome.
  public String getNome() {
    return this.nome; // Retorna o valor do atributo nome.
  }

  public void setNome(String nome) {
    this.nome = nome; // Atribui o valor passado como argumento para o atributo nome.
  }

  // Criado um método getter chamado getPreco, que retorna o valor do atributo preco.
  public double getPreco() {
    return this.preco; // Retorna o valor do atributo preco.
  }

  // Criado um método setter chamado setPreco, que atribui um valor ao atributo preco.
  public void setPreco(double preco) {
    this.preco = preco; // Atribui o valor passado como argumento para o atributo preco.
  }

  // Criado um método getter chamado getDesconto, que retorna o valor do atributo desconto.
  public double getDesconto() {
    return this.desconto; // Retorna o valor do atributo desconto.
  }

  // Criado um método setter chamado setDesconto, que atribui um valor ao atributo desconto.
  public void setDesconto(double desconto) {
    this.desconto = desconto; // Atribui o valor passado como argumento para o atributo desconto.
  }

  // Método que calcula o preço final, retornando um valor do tipo double.
  public double calcularPrecoFinal() {
    return this.preco - (this.preco * this.desconto / 100); // Retorna o preço com o desconto aplicado.
  }
}
