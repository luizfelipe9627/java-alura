package com.alura.exercicios.segundo;

import com.google.gson.Gson; // Importado a classe Gson do pacote com.google.gson, responsável por converter objetos Java em JSON e vice-versa.

import com.alura.exercicios.segundo.models.Titulo;

//* Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

public class Main {
  public static void main(String[] args) {
    Titulo titulo = new Titulo("O Poderoso Chefão", 1972, "Drama"); // Criado um objeto do tipo Titulo que recebe o nome, ano e gênero do título como parâmetro do construtor.

    Gson gson = new Gson(); // Criado um objeto do tipo Gson, responsável por converter objetos Java em JSON e vice-versa.

    String json = gson.toJson(titulo); // Criaod uma string chamada json que recebe o JSON convertido do objeto titulo.

    System.out.println(json); // Imprimido o JSON do objeto titulo.
  }
}
