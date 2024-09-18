package com.alura.exercicios.terceiro.exception;

// Criado uma classe chamada ErroConsultaGitHubException que herda de RuntimeException, responsável por lançar uma exceção personalizada caso a senha seja inválida.
public class ErroConsultaGitHubException extends RuntimeException {
  // Criado um construtor que recebe um parâmetro do tipo String chamado message.
  public ErroConsultaGitHubException(String message) {
    super(message); // O super é usado para chamar o construtor da superclasse RuntimeException passando a mensagem como parâmetro.
  }
}
