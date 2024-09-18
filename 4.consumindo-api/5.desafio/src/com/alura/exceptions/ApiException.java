package com.alura.exceptions;

// Criado uma classe pública chamada ApiException que estende a classe RuntimeException, responsável por lançar exceções personalizadas.
public class ApiException extends RuntimeException {
    // Criado um construtor público que recebe uma mensagem como parâmetro e chama o construtor da superclasse passando a mensagem recebida.
    public ApiException(String message) {
        super(message); // Chama o construtor da superclasse passando a mensagem recebida como parâmetro.
    }
}
