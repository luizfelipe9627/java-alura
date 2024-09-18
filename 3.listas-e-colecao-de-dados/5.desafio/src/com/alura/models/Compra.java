package com.alura.models;

// A classe Compra implementa a interface Comparable, que permite comparar objetos do tipo Compra, obrigando a implementação do método compareTo.
public class Compra implements Comparable<Compra> {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private String descricao; // Criado um atributo do tipo String chamado descricao, responsável por armazenar a descrição da compra.
  private double valor; // Criado um atributo do tipo double chamado valor, responsável por armazenar o valor da compra.

  // Criado um construtor da classe Compra que recebe dois parâmetros: um do tipo String chamado descricao e outro do tipo double chamado valor.
  public Compra(String descricao, double valor) {
    this.descricao = descricao; // Atribui o valor do parâmetro descricao ao atributo descricao.
    this.valor = valor; // Atribui o valor do parâmetro valor ao atributo valor.
  }

  // Criado um método getter chamado getDescricao que retorna um valor do tipo String.
  public String getDescricao() {
    return this.descricao; // Retorna o valor do atributo descricao.
  }

  // Criado um método getter chamado getValor que retorna um valor do tipo double.
  public double getValor() {
    return this.valor; // Retorna o valor do atributo valor.
  }

  @Override // Indica que o método toString está sobrescrevendo um método da classe Object.
  // Está sobrescrevendo o método toString da classe Object para retornar uma string contendo a descrição e o valor da compra.
  public String toString() {
    return "Descrição: " + this.descricao + " | Valor: " + this.valor; // Retorna uma string contendo a descrição e o valor da compra.
  }

  @Override // Indica que o método compareTo está sobrescrevendo um método da interface Comparable.
  // Está sobrescrevendo o método compareTo da interface Comparable para comparar objetos do tipo Compra.
  public int compareTo(Compra outraCompra) {
    return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor)); // Está comparando as compras pelo valor.
  }
}
