package com.alura.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.alura.exceptions.ApiException;

//* > Service
/*
    - O Service é responsável por conter a lógica de negócio da aplicação.
    - Por exemplo, se a aplicação precisa buscar um CEP, então a lógica de busca do CEP é implementada no Service.
*/

public class CepService {
    // Criado um método público que retorna uma String e lança exceções do tipo IOException e InterruptedException, responsável por buscar o CEP através da API.
    public String buscarCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/"; // Define a URL da API do ViaCEP com o CEP digitado pelo usuário e armaena na variável url.

        // O bloco try-catch é utilizado para tratar possíveis exceções que podem ocorrer durante a execução do código, caso ocorra uma exceção, a mensagem de erro é exibida no console e o método retorna null.
        try {
            HttpClient client = HttpClient.newHttpClient(); // Está sendo criado um novo cliente HTTP chamado client que será usado para enviar requisições e receber respostas.

            // Está sendo criado um novo objeto HttpRequest chamado request que será usado para construir uma requisição HTTP para o endereço definido.
            HttpRequest request = HttpRequest.newBuilder()
                    // O método uri() é usado para definir o endereço da requisição, o endereço é definido através de um objeto URI.
                    .uri(URI.create(url))
                    // O método build() é usado para construir a requisição, ou seja, para finalizar a construção da requisição.
                    .build();

            // Está sendo criado um novo objeto HttpResponse chamado response que será usado para receber a resposta da requisição HTTP.
            HttpResponse<String> response = client
                    // O método send() é usado para enviar a requisição HTTP e receber a resposta, recebe como parâmetro a requisição HTTP que será enviada e o tipo de corpo da resposta que no caso é uma string.
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // SE o código de status da resposta for igual a 400, então executa o if.
            if (response.statusCode() == 400) {
                throw new ApiException("O CEP digitado está incorreto ou não existe."); // Lança uma exceção do tipo ApiException com a mensagem de erro.
            }

            return response.body(); // Retorna o corpo da resposta da requisição HTTP caso não ocorra nenhuma exceção.
        } catch (ApiException e) {
            System.out.println(e.getMessage()); // Está sendo impresso a mensagem de erro passada no construtor da exceção personalizada.
            return null; // Retorna null caso ocorra uma exceção.
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage()); // Está sendo impresso a mensagem de erro caso ocorra uma exceção.
            return null; // Retorna null caso ocorra uma exceção.
        }
    }
}
