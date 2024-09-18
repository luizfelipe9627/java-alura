package com.alura.models;

public class Audio {
  // O modificador private faz com que o atributo só possa ser acessado dentro da classe.
  private String titulo; // Criado um atributo do tipo String chamado titulo, que armazena o título do áudio.
  private int totalReproducoes; // Criado um atributo do tipo int chamado totalReproducoes, que armazena o total de reproduções do áudio.
  private int totalCurtidas; // Criado um atributo do tipo int chamado totalCurtidas, que armazena o total de curtidas do áudio.
  private int classificacao; // Criado um atributo do tipo int chamado classificacao, que armazena a classificação do áudio.

  // Criado um getter chamado getTitulo, que retorna um tipo String chamado titulo.
  public String getTitulo() {
    return this.titulo; // Retorna o valor do atributo titulo.
  }

  // Criado um setter chamado setTitulo, que recebe um parâmetro do tipo String chamado titulo.
  public void setTitulo(String titulo) {
    this.titulo = titulo; // Atribui o valor do parâmetro titulo ao atributo titulo.
  }

  // Criado um getter chamado getTotalReproducoes, que retorna um tipo int chamado totalReproducoes.
  public int getTotalReproducoes() {
    return this.totalReproducoes; // Retorna o valor do atributo totalReproducoes.
  }

  // Criado um getter chamado getTotalCurtidas, que retorna um tipo int chamado totalCurtidas.
  public int getTotalCurtidas() {
    return this.totalCurtidas; // Retorna o valor do atributo totalCurtidas.
  }

  // Criado um getter chamado getClassificacao, que retorna um tipo int chamado classificacao.
  public int getClassificacao() {
    return this.classificacao; // Retorna o valor do atributo classificacao.
  }

  // Criado um método chamado curte, que incrementa o total de curtidas do áudio.
  public void curte() {
    this.totalCurtidas++; // Incrementa o total de curtidas do áudio.
  }

  // Criado um método chamado reproduz, que incrementa o total de reproduções do áudio.
  public void reproduz() {
    this.totalReproducoes++; // Incrementa o total de reproduções do áudio.
  }
}
