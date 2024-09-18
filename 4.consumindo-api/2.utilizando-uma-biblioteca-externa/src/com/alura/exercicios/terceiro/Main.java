package com.alura.exercicios.terceiro;

import com.google.gson.Gson; // Importa a classe Gson do pacote com.google.gson, responsável por converter objetos Java em JSON e vice-versa.

//* Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um objeto do tipo Livro.

public class Main {
  public static void main(String[] args) {
    Gson gson = new Gson(); // Criado uma instância da classe Gson chamada gson, responsável por converter objetos Java em JSON e vice-versa.

    String livroJson = """
      {
        "titulo": "O Senhor dos Anéis",
        "autor": "J.R.R. Tolkien",
        "editora": {
          "nome": "Martins Fontes",
          "cidade": "São Paulo"
        }
      }
    """;

    // Criado um objeto do tipo Livro chamado livro que representa um livro.
    Livro livro = gson
    // O método fromJson() é usado para converter o JSON em um objeto Java, recebe como parâmetro o JSON e a classe que representa o objeto Java, que no caso é a classe Livro.
    .fromJson(livroJson, Livro.class);

    System.out.println(livro); // Está sendo impresso o objeto livro.
  }
}
