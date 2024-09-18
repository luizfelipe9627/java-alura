package com.alura.exercicios.quarto;

// A classe VerificadorPrimo é uma subclasse da classe NumerosPrimos, pois está sendo extendida pela classe NumerosPrimos, recebendo todos os métodos e atributos da classe NumerosPrimos.
public class VerificadorPrimo extends NumerosPrimos {
  // O método verificarSeEhPrimo não retorna nenhum valor, apenas chama o método verificarPrimalidade passando o número como argumento.
  public void verificarSeEhPrimo(int numero) {
    verificarPrimalidade(numero);
  }
}
