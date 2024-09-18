package com.alura.exercicios.segundo.models;

public class Titulo {
  private String nome; // Está sendo criado um atributo do tipo String chamado nome, responsável por armazenar o nome do título.
  private int ano; // Está sendo criado um atributo do tipo int chamado ano, responsável por armazenar o ano de lançamento do título.
  private String genero; // Está sendo criado um atributo do tipo String chamado genero, responsável por armazenar o gênero do título.

  // Criado um construtor da classe Titulo que recebe como parâmetro o nome, ano e gênero do título.
  public Titulo(String nome, int ano, String genero) {
    this.nome = nome; // Atribui o valor do parâmetro nome ao atributo nome.
    this.ano = ano; // Atribui o valor do parâmetro ano ao atributo ano.
    this.genero = genero; // Atribui o valor do parâmetro genero ao atributo genero.
  }
}
