package com.alura.exercicios.quarto;

// A classe GeradorPrime é uma subclasse da classe NumerosPrimos, pois está sendo extendida pela classe NumerosPrimos, recebendo todos os métodos e atributos da classe NumerosPrimos.
public class GeradorPrimo extends NumerosPrimos {
  // O método gerarPrimos não retorna nenhum valor, apenas chama o método listarPrimos passando o limite como argumento.
  public void gerarPrimos(int limite) {
    listarPrimos(limite); // Chama o método listarPrimos passando o limite como argumento.
  }
}
