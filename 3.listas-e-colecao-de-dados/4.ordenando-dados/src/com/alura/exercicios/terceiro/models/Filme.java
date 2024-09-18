package com.alura.exercicios.terceiro.models;

// Criado uma classe chamada Filme que atráves do extends recebe todos os atributos e métodos da classe Titulo e implementa a interface Classificavel.
public class Filme extends Titulo {
  // Criado um construtor que recebe dois parâmetros, um do tipo String chamado nome e outro do tipo int chamado anoDeLancamento.
  public Filme(String nome, int anoDeLancamento) {
    super(nome, anoDeLancamento); // Chama o construtor da superclasse Titulo passando o nome e o anoDeLancamento como parâmetros.
  }
}