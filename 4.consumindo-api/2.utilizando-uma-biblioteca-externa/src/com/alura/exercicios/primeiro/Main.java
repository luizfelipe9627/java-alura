package com.alura.exercicios.primeiro;

import com.google.gson.Gson; // Importa a classe Gson do pacote com.google.gson, responsável por converter objetos Java em JSON e vice-versa.

//* Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.

public class Main {
  public static void main(String[] args) {
    // Criado uma string chamada pessoaJson que contém um JSON representando uma pessoa.
    String pessoaJson = """
      {
        "nome": "João",
        "idade": 25,
        "cidade": "São Paulo"
      }
    """;

    Gson gson = new Gson(); // Criado uma instância da classe Gson chamada gson, responsável por converter objetos Java em JSON e vice-versa.

    // Criado um objeto do tipo Pessoa chamado pessoa que representa uma pessoa.
    Pessoa pessoa = gson
    // O método fromJson() é usado para converter o JSON em um objeto Java, recebe como parâmetro o JSON e a classe que representa o objeto Java, que no caso é a classe Pessoa e está sendo armazenado em uma variável chamada pessoa.
    .fromJson(pessoaJson, Pessoa.class);

    System.out.println(pessoa); // Está sendo impresso o objeto pessoa.
  }
}
