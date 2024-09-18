package com.alura.exercicios.terceiro.models;

// Criado uma classe chamada Serie que herda da classe Titulo, ou seja, a classe Serie possui todos os atributos e métodos da classe Titulo.
public class Serie extends Titulo {
  // Criado um construtor que recebe dois parâmetros, um do tipo String chamado nome e outro do tipo int chamado anoDeLancamento.
  public Serie(String nome, int anoDeLancamento) {
    super(nome, anoDeLancamento); // Chama o construtor da superclasse Titulo passando o nome e o anoDeLancamento como parâmetros
  }
}
