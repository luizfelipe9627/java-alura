package com.alura.exercicios.segundo.exception;

// Criado uma classe chamada SenhaInvalidaException que herda de RuntimeException, responsável por lançar uma exceção personalizada caso a senha seja inválida.
public class SenhaInvalidaException extends RuntimeException {
  // Criado um construtor que recebe um parâmetro do tipo String chamado message.
  public SenhaInvalidaException(String message) {
    super(message); // O super é usado para chamar o construtor da superclasse RuntimeException passando a mensagem como parâmetro.
  }
}
