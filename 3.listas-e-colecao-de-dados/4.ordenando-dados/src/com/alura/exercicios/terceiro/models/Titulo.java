package com.alura.exercicios.terceiro.models;

// Criado uma classe chamada Titulo que implementa a interface Comparable responsável por definir a ordem natural dos objetos da classe, recebendo um parâmetro do tipo Titulo fazendo com que a classe seja comparável com ela mesma.
public class Titulo implements Comparable<Titulo> {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private String nome; // Criado uma variável do tipo String chamada nome, que armazena o nome do título.
  private int anoDeLancamento; // Criado uma variável do tipo int chamada anoDeLancamento, que armazena o ano de lançamento do título.

  // Criado um getter chamado getNome que retorna o valor do atributo nome.
  public String getNome() {
    return nome; // Retorna o valor do atributo nome.
  }

  // Criado um getter chamado getAnoDeLancamento que retorna o ano de lançamento do título.
  public int getAnoDeLancamento() {
    return anoDeLancamento; // Retorna o valor do atributo anoDeLancamento.
  }

  // Criado um construtor que recebe dois parâmetros, um do tipo String chamado nome e outro do tipo int chamado anoDeLancamento.
  public Titulo(String nome, int anoDeLancamento) {
    this.nome = nome; // Atribui o valor do parâmetro nome ao atributo nome.
    this.anoDeLancamento = anoDeLancamento; // Atribui o valor do parâmetro anoDeLancamento ao atributo anoDeLancamento.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // O método toString é responsável por retornar uma representação em String do objeto.
  public String toString() {
    return getNome() + " (" + getAnoDeLancamento() + ")"; // Retorna o nome e o ano de lançamento do filme.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  public int compareTo(Titulo outroTitulo) {
    return getNome().compareTo(outroTitulo.getNome()); // Compara o nome do título atual com o nome do outro título.
  }
}
