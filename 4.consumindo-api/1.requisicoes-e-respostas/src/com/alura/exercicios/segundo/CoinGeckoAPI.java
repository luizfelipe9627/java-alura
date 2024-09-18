package com.alura.exercicios.segundo;

import java.io.IOException; // Importa a classe IOException do pacote java.io, responsável por tratar exceções de entrada e saída.
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, responsável por ler a entrada do usuário.
import java.net.http.HttpClient; // Importa a classe HttpClient do pacote java.net.http, responsável por enviar requisições e receber respostas HTTP.
import java.net.http.HttpRequest; // Importa a classe HttpRequest do pacote java.net.http, responsável por construir uma requisição HTTP.
import java.net.http.HttpResponse; // Importa a classe HttpResponse do pacote java.net.http, responsável por representar uma resposta HTTP.

//* Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.

public class CoinGeckoAPI {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in); // Está sendo criado um novo objeto Scanner chamado scanner que será usado para ler a entrada do usuário.
    System.out.print("Digite o nome da criptomoeda para saber a cotação: "); // Está sendo impresso uma mensagem pedindo para o usuário digitar a moeda para ser feita a busca na API.
    var moeda = scanner.nextLine(); // Está sendo lido a entrada do usuário e armazenado na variável moeda.

    String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + moeda + "&vs_currencies=usd"; // Está sendo criado uma string chamada endereco que contém o endereço da API com a moeda que o usuário digitou.

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
