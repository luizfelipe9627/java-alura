package com.alura.exercicios.terceiro;

import java.io.IOException; // Importa a classe IOException do pacote java.io, responsável por tratar exceções de entrada e saída.
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, responsável por ler a entrada do usuário.
import java.net.http.HttpClient; // Importa a classe HttpClient do pacote java.net.http, responsável por enviar requisições e receber respostas HTTP.
import java.net.http.HttpRequest; // Importa a classe HttpRequest do pacote java.net.http, responsável por construir uma requisição HTTP.
import java.net.http.HttpResponse; // Importa a classe HttpResponse do pacote java.net.http, responsável por representar uma resposta HTTP.
import java.net.URI; // Importa a classe URI do pacote java.net, responsável por representar um identificador uniforme de recursos.

import com.alura.exercicios.terceiro.exception.ErroConsultaGitHubException;

  //* Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in); // Está sendo criado um novo objeto Scanner chamado scanner que será usado para ler a entrada do usuário.
    System.out.print("Digite o seu username do GitHub: "); // Está sendo impresso uma mensagem pedindo para o usuário digitar o seu username do GitHub.
    var username = scanner.nextLine(); // Está sendo lido a entrada do usuário e armazenado na variável username.

    String endereco = "https://api.github.com/users/" + username; // Está sendo criado uma string chamada endereco que contém o endereço da API do GitHub com o username do usuário.

    scanner.close(); // Está sendo fechado o objeto scanner.

    try {
      HttpClient client = HttpClient.newHttpClient(); // Está sendo criado um novo cliente HTTP chamado client que será usado para enviar requisições e receber respostas.

      // Está sendo criado um novo objeto HttpRequest chamado request que será usado para construir uma requisição HTTP para o endereço definido.
      HttpRequest request = HttpRequest.newBuilder()
        // O método uri() é usado para definir o endereço da requisição, o endereço é definido através de um objeto URI.
        .uri(URI.create(endereco))
        // O método build() é usado para construir a requisição, ou seja, para finalizar a construção da requisição.
        .build();

      // Está sendo criado um novo objeto HttpResponse chamado response que será usado para receber a resposta da requisição HTTP.
      HttpResponse<String> response = client
        // O método send() é usado para enviar a requisição HTTP e receber a resposta, recebe como parâmetro a requisição HTTP que será enviada e o tipo de corpo da resposta que no caso é uma string.
        .send(request, HttpResponse.BodyHandlers.ofString());

      // Se o status code da resposta for 404, então executa o if.
      if(response.statusCode() == 404) {
        throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub."); // Está sendo lançada uma exceção ErroConsultaGitHubException com a mensagem "Usuário não encontrado no GitHub.".
      }

      String json = response.body(); // Está sendo armazenado o corpo da resposta da requisição HTTP na variável json.

      System.out.println(json); // Está sendo impresso o corpo da resposta da requisição HTTP.
    } catch (ErroConsultaGitHubException e) {
      System.out.println(e.toString()); // Está sendo impresso a mensagem de erro que foi lançada pela exceção.
    }
  }
}
