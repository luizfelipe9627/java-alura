package com.alura.exercicios.terceiro;

//* Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

public class TabuadaMultiplicacao implements Tabuada {
  @Override // Está sobrescrevendo o método mostrarTabuada da interface Tabuada, responsável por mostrar a tabuada.
  // O método mostrarTabuada recebe um parâmetro do tipo int, que é o número da tabuada, e não retorna nenhum valor.
  public void mostrarTabuada(int numero) {
    // O for está recebendo o valor 1 e enquanto o valor for menor ou igual a 10, ele irá incrementar o valor de i.
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i)); // Está sendo impresso o número da tabuada.
    }
  }
}
