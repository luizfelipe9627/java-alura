package com.alura.exercicios.terceiro;

import java.io.IOException; // Importa a classe IOException do pacote java.io, responsável por tratar exceções de entrada e saída.
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, responsável por ler a entrada do usuário.
import java.net.http.HttpClient; // Importa a classe HttpClient do pacote java.net.http, responsável por enviar requisições e receber respostas HTTP.
import java.net.http.HttpRequest; // Importa a classe HttpRequest do pacote java.net.http, responsável por construir uma requisição HTTP.
import java.net.http.HttpResponse; // Importa a classe HttpResponse do pacote java.net.http, responsável por representar uma resposta HTTP.

//* Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest e HttpResponse. Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre essa receita.

public class TheMealDBAPI {
  public static void main(String[] args) throws IOException, InterruptedException  {
    Scanner scanner = new Scanner(System.in); // Está sendo criado um novo objeto Scanner chamado scanner que será usado para ler a entrada do usuário.
    System.out.print("Digite o nome de uma receita para busca: "); // Está sendo impresso uma mensagem pedindo para o usuário digitar o nome de uma receita para ser feita a busca na API.
    var receita = scanner.nextLine(); // Está sendo lido a entrada do usuário e armazenado na variável receita.

    String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita; // Está sendo criado uma string chamada endereco que contém o endereço da API com o nome da receita que o usuário digitou.

    scanner.close(); // Está sendo fechado o objeto scanner.

    HttpClient client = HttpClient.newHttpClient(); // Está sendo criado um novo cliente HTTP chamado client que será usado para enviar requisições e receber respostas.

    // Está sendo criado um novo objeto HttpRequest chamado request que será usado para construir uma requisição HTTP para o endereço definido.
    HttpRequest request = HttpRequest.newBuilder()
      .uri(java.net.URI.create(endereco)) // O método uri() é usado para definir o endereço da requisição, o endereço é definido através de um objeto URI.
      .build(); // O método build() é usado para construir a requisição, ou seja, para finalizar a construção da requisição.

      // Está sendo criado um novo objeto HttpResponse do tipo String chamado response que será usado para receber a resposta da requisição HTTP.
      HttpResponse<String> response = client
        // O método send() é usado para enviar a requisição HTTP e receber a resposta, recebe como parâmetro a requisição HTTP que será enviada e o tipo de corpo da resposta que no caso é uma string.
        .send(request, HttpResponse.BodyHandlers.ofString());

      System.out.println(response.body()); // Está sendo impresso o corpo da resposta da requisição HTTP.
  }
}
