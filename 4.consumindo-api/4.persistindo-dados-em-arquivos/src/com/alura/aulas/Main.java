package com.alura.aulas;

import java.io.FileWriter; // Importa a classe FileWriter do pacote java.io, responsável por escrever dados em um arquivo.
import java.io.IOException; // Importa a classe IOException do pacote java.io, responsável por tratar exceções de entrada e saída.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, responsável por ler a entrada do usuário.
import java.net.http.HttpClient; // Importa a classe HttpClient do pacote java.net.http, responsável por enviar requisições e receber respostas HTTP.
import java.net.http.HttpRequest; // Importa a classe HttpRequest do pacote java.net.http, responsável por construir uma requisição HTTP.
import java.net.http.HttpResponse; // Importa a classe HttpResponse do pacote java.net.http, responsável por representar uma resposta HTTP.
import java.net.URI; // Importa a classe URI do pacote java.net, responsável por representar um identificador uniforme de recursos.

import com.google.gson.FieldNamingPolicy; // Importa a classe FieldNamingPolicy do pacote com.google.gson, responsável por definir a política de nomenclatura de campos.
import com.google.gson.Gson; // Importa a classe Gson do pacote com.google.gson, responsável por converter objetos Java em JSON e vice-versa.
import com.google.gson.GsonBuilder; // Importa a classe GsonBuilder do pacote com.google.gson, responsável por criar uma instância da classe Gson com configurações personalizadas.

import com.alura.aulas.exception.ErroDeConversaoAnoException;
import com.alura.aulas.models.Titulo;
import com.alura.aulas.models.TituloOMDB;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in); // Está sendo criado um novo objeto Scanner chamado scanner que será usado para ler a entrada do usuário.

    String filme = ""; // Está sendo criado uma variável do tipo String chamada filme e inicializada com uma string vazia.

    List<Titulo> filmes = new ArrayList<>(); // Está sendo criado uma lista de objetos do tipo Titulo chamada filmes.

    // Criado uma instância da classe Gson chamada gsonBuilder, responsável por converter objetos Java em JSON e vice-versa.
    Gson gsonBuilder = new GsonBuilder()
    // O método setFieldNamingPolicy() é usado para definir a política de nomenclatura de campos, no caso está sendo definido a política UPPER_CAMEL_CASE, fazendo com que os campos do JSON sejam convertidos para o padrão camelCase.
    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
    // O método setPrettyPrinting() é usado para formatar o JSON em um formato mais legível, com quebras de linha e espaços.
    .setPrettyPrinting()
    // O método create() é usado para criar a instância da classe Gson com as configurações definidas.
    .create();

    // Enquanto o filme for diferente de sair, o bloco de código será executado.
    while (!filme.equalsIgnoreCase("sair")) {
      System.out.print("Digite o nome de um filme para busca ou sair para encerrar: "); // Está sendo impresso a mensagem para o usuário digitar o nome de um filme ou sair para encerrar.
      filme = scanner.nextLine(); // Está sendo lido a entrada do usuário e armazenado na variável filme.

      // Se o filme for igual a sair, o bloco de código será executado.
      if(filme.equalsIgnoreCase("sair")) {
        System.out.println("Saindo..."); // Está sendo impresso a mensagem de saída.
        scanner.close(); // Está sendo fechado o objeto scanner.
        break; // O loop é interrompido.
      }

      String endereco = "http://www.omdbapi.com/?t=" + filme.replace(" ", "+") + "&apikey=e0496f36"; // Está sendo criado uma string chamada endereco que contém o endereço da API com o nome do filme que o usuário digitou e a chave da API. Substitui os espaços por +.

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

      String json = response.body(); // Está sendo armazenado o corpo da resposta da requisição HTTP em uma variável chamada json.

      System.out.println("--------------------------------------------------");

      TituloOMDB meuTituloOMDB = gsonBuilder.fromJson(json, TituloOMDB.class); // O método fromJson() é usado para converter o JSON em um objeto Java, recebe como parâmetro a resposta da requisição HTTP e a classe que representa o objeto Java, que no caso é o record TituloOMDB e está sendo armazenado em uma variável chamada meuTituloOMDB.

      // Executa o bloco de código que pode lançar uma exceção, caso ocorra uma exceção do tipo ErroDeConversaoAnoException que foi a personalizada criada, o bloco catch será executado. O finally será executado independente se ocorreu uma exceção ou não.
      try {
        Titulo meuTitulo = new Titulo(meuTituloOMDB); // Está sendo criado um novo objeto Titulo chamado meuTitulo, que recebe como parâmetro o objeto meuTituloOMDB.

        filmes.add(meuTitulo); // Está sendo adicionado o objeto meuTitulo na lista de filmes.

        System.out.println(meuTitulo); // Está sendo impresso o nome do filme, ano de lançamento e duração do filme.

        //* FileWriter
        /*
          - O FileWriter é uma classe do pacote java.io que é usada para escrever dados em um arquivo.
        */

        FileWriter writer = new FileWriter("filme.json"); // Está sendo criado um novo objeto FileWriter chamado writer que será usado para escrever dados em um arquivo chamado filme.json.

        writer.write(gsonBuilder.toJson(filmes)); // Está sendo escrito no arquivo filme.txt a lista de filmes convertida para JSON.

        writer.close(); // Está sendo fechado o objeto writer, fazendo com que os dados sejam escritos no arquivo e colocado na raiz do projeto.
      } catch (ErroDeConversaoAnoException e) {
        System.out.println(e.getMessage()); // Está sendo impresso a mensagem de erro passada no construtor da exceção.
      }
    }
  }
}
