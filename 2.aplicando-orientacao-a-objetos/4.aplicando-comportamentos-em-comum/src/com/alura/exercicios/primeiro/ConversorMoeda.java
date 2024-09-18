package com.alura.exercicios.primeiro;

//* Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

// A classe ConversorMoeda implementa a interface ConversaoFinanceira, ou seja, ela é obrigada a implementar o método converterParaReal.
public class ConversorMoeda implements ConversaoFinanceira {
  // O modificador private faz com que o atributo só possa ser acessado dentro da classe.
  private double cotacaoDolar = 5.60; // Criado uma variável do tipo double para armazenar a cotação do dólar.

  @Override // O @Override é uma anotação que indica que o método abaixo é uma sobrescrita de um método da superclasse.
  // O método converterParaReal recebe um valor do tipo double e retorna um valor do tipo double.
  public double converterParaReal(double valor) {
    return valor * cotacaoDolar; // Retorna o valor convertido para real.
  }
}
