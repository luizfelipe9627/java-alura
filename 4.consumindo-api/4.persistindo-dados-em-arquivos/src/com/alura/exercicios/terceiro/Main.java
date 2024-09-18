package com.alura.exercicios.terceiro;

import com.google.gson.Gson; // Importado a classe Gson do pacote com.google.gson, responsável por converter objetos Java em JSON e vice-versa.
import com.google.gson.GsonBuilder;

import com.alura.exercicios.segundo.models.Titulo;

//* Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante. Utilize o método setPrettyPrinting para alcançar esse resultado.

public class Main {
  public static void main(String[] args) {
    Titulo titulo = new Titulo("O Poderoso Chefão", 1972, "Drama"); // Criado um objeto do tipo Titulo que recebe o nome, ano e gênero do título como parâmetro do construtor.

    // Criado um objeto do tipo Gson, responsável por converter objetos Java em JSON e vice-versa.
    Gson gson = new GsonBuilder()
    // O método setPrettyPrinting() é usado para formatar o JSON em um formato mais legível, com quebras de linha e espaços.
    .setPrettyPrinting()
    // O método create() é usado para criar a instância da classe Gson com as configurações definidas.
    .create();

    String json = gson.toJson(titulo); // Criaod uma string chamada json que recebe o JSON convertido do objeto titulo.

    System.out.println(json); // Imprimido o JSON do objeto titulo.
  }
}
