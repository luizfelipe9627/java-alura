package com.alura.aulas;

import java.io.IOException; // Importa a classe IOException do pacote java.io, responsável por tratar exceções de entrada e saída.
import java.net.URI; // Importa a classe URI do pacote java.net, responsável por representar um identificador uniforme de recursos.
import java.net.http.HttpClient; // Importa a classe HttpClient do pacote java.net.http, responsável por enviar requisições e receber respostas HTTP.
import java.net.http.HttpRequest; // Importa a classe HttpRequest do pacote java.net.http, responsável por construir uma requisição HTTP.
import java.net.http.HttpResponse; // Importa a classe HttpResponse do pacote java.net.http, responsável por representar uma resposta HTTP.
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, responsável por ler a entrada do usuário.

public class Main {
  //* Throws
  /*
    - O throws é uma palavra-chave usada para declarar que um método pode lançar uma exceção, ou seja, que um método pode gerar um erro.
  */
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in); // Está sendo criado um novo objeto Scanner chamado scanner que será usado para ler a entrada do usuário.
    System.out.print("Digite o nome de um filme para busca: "); // Está sendo impresso uma mensagem pedindo para o usuário digitar o nome de um filme para ser feita a busca na API.
    var filme = scanner.nextLine(); // Está sendo lido a entrada do usuário e armazenado na variável filme.

    String endereco = "http://www.omdbapi.com/?t=" + filme + "&apikey=e0496f36"; // Está sendo criado uma string chamada endereco que contém o endereço da API com o nome do filme que o usuário digitou e a chave da API.

    scanner.close(); // Está sendo fechado o objeto scanner.

    //* Request HTTP com Java
    /*
      - Para fazer uma requisição HTTP com Java 11, é necessário usar a classe HttpClient e a classe HttpRequest.
      - A classe HttpClient é usada para enviar requisições e receber respostas.
      - A classe HttpRequest é usada para construir uma requisição HTTP.
    */

    HttpClient client = HttpClient.newHttpClient(); // Está sendo criado um novo cliente HTTP chamado client que será usado para enviar requisições e receber respostas.

    // Está sendo criado um novo objeto HttpRequest chamado request que será usado para construir uma requisição HTTP para o endereço definido.
    HttpRequest request = HttpRequest.newBuilder()
      // O método uri() é usado para definir o endereço da requisição, o endereço é definido através de um objeto URI.
      .uri(URI.create(endereco))
      // O método build() é usado para construir a requisição, ou seja, para finalizar a construção da requisição.
      .build();

    //* Response HTTP com Java
    /*
      - Para receber a resposta de uma requisição HTTP com Java 11, é necessário usar a classe HttpResponse.
    */

    // Está sendo criado um novo objeto HttpResponse chamado response que será usado para receber a resposta da requisição HTTP.
    HttpResponse<String> response = client
      // O método send() é usado para enviar a requisição HTTP e receber a resposta, recebe como parâmetro a requisição HTTP que será enviada e o tipo de corpo da resposta que no caso é uma string.
      .send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println(response.body()); // Está sendo impresso o corpo da resposta da requisição HTTP.
  }
}
