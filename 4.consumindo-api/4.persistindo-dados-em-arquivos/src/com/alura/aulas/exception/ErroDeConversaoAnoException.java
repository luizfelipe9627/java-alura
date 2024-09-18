package com.alura.aulas.exception;

// Criado uma classe chamada ErroDeConversaoAnoException que herda de RuntimeException, responsável por lançar uma exceção personalizada caso ocorra um erro ao converter o ano de lançamento do filme.
public class ErroDeConversaoAnoException extends RuntimeException {
  private String mensagem; // Criado um atributo do tipo String chamado mensagem, responsável por armazenar a mensagem de erro.

  // Criado um construtor que recebe um parâmetro do tipo String chamado mensagem.
  public ErroDeConversaoAnoException(String mensagem) {
    this.mensagem = mensagem; // Atribui o valor do parâmetro mensagem ao atributo mensagem.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // Sobrescrevendo o método getMessage() da superclasse RuntimeException, responsável por retornar a mensagem de erro.
  public String getMessage() {
    return this.mensagem; // Retorna a mensagem de erro passada no construtor.
  }
}
