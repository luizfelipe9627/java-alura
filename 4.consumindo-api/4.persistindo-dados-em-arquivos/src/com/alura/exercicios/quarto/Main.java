package com.alura.exercicios.quarto;

import com.google.gson.Gson; // Importado a classe Gson do pacote com.google.gson, responsável por converter objetos Java em JSON e vice-versa.

import com.alura.exercicios.quarto.models.Veiculo;
import com.alura.exercicios.segundo.models.Titulo;

//* Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

public class Main {
  public static void main(String[] args) {
    Veiculo carro = new Veiculo(); // Criado uma instância da classe Veiculo chamada carro.
    carro.setModelo("Fusca"); // Atribuído o valor "Fusca" ao atributo modelo do objeto carro.
    carro.setAno(1972); // Atribuído o valor 1972 ao atributo ano do objeto carro.
    carro.setMarca("Volkswagen"); // Atribuído o valor "Volkswagen" ao atributo marca do objeto carro.
    carro.setPreco(10000.0); // Atribuído o valor 10000.0 ao atributo preco do objeto carro.

    Gson gson = new Gson(); // Criado um objeto do tipo Gson, responsável por converter objetos Java em JSON e vice-versa.

    String json = gson.toJson(carro); // Criaod uma string chamada json que recebe o JSON convertido do objeto titulo.

    System.out.println(json); // Imprimido o JSON do objeto titulo.
  }
}
