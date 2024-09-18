package com.alura.exercicios.segundo;

// Criado uma classe chamada Titulo que implementa a interface Comparable responsável por definir a ordem natural dos objetos da classe, recebendo um parâmetro do tipo Titulo fazendo com que a classe seja comparável com ela mesma.
public class Titulo implements Comparable<Titulo> {
  //* Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private String nome; // Criado uma variável do tipo String chamada nome, que armazena o nome do título.

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  public int compareTo(Titulo outroTitulo) {
    return this.nome.compareTo(outroTitulo.nome); // Compara o nome do título atual com o nome do outro título.
  }
}
