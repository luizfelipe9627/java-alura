package com.alura.exercicios.segundo;

import com.google.gson.Gson; // Importa a classe Gson do pacote com.google.gson, responsável por converter objetos Java em JSON e vice-versa.
import com.google.gson.GsonBuilder; // Importa a classe GsonBuilder do pacote com.google.gson, responsável por criar uma instância da classe Gson com configurações personalizadas.

//* Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação da biblioteca Gson para flexibilizar a conversão.

public class Main {
public static void main(String[] args) {
  // Criado uma string chamada pessoaJson que contém um JSON representando uma pessoa.
  String pessoaJson = """
    {
      "nome": "João",
      "idade": 25,
      "cidade": "São Paulo",
      "estado": "SP"
    }
  """;

  // Criado uma instância da classe Gson chamada gsonBuilder, responsável por converter objetos Java em JSON e vice-versa.
  Gson gsonBuilder = new GsonBuilder()
  // O método setLenient() é usado para definir se o parser JSON deve ser tolerante a erros, então ele aceitará JSONs inválidos.
  .setLenient()
  // O método create() é usado para criar a instância da classe Gson com as configurações definidas.
  .create();

  // Criado um objeto do tipo Pessoa chamado pessoa que representa uma pessoa.
  Pessoa pessoa = gsonBuilder
  // O método fromJson() é usado para converter o JSON em um objeto Java, recebe como parâmetro o JSON e a classe que representa o objeto Java, que no caso é a classe Pessoa.
  .fromJson(pessoaJson, Pessoa.class);

  System.out.println(pessoa); // Está sendo impresso o objeto pessoa.
}
}
