package com.alura.aulas;

public class Metodos {
  String nome; // Criado uma variável do tipo String chamada nome.
  int anoDeLancamento; // Criado uma variável do tipo int chamada anoDeLancamento.
  boolean incluidoNoPlano; // Criado uma variável do tipo boolean chamada incluidoNoPlano.
  double somaDasAvaliacoes; // Criado uma variável do tipo double chamada somaDasAvaliacoes.
  int totalDeAvaliacoes; // Criado uma variável do tipo int chamada totalAvaliacoes.
  int duracaoEmMinutos; // Criado uma variável do tipo int chamada duracaoEmMinutos.

  //* Métodos
  /*
    Métodos são ações que um objeto pode realizar. Eles são responsáveis por manipular os atributos de um objeto.

    Sintaxe:
    <modificador de acesso> <tipo de retorno> <nome do método>(<parâmetros>) {
      Corpo do método
    }

    Modificador de acesso -> É responsável por dizer quem pode acessar o método. Ex: public, private, protected.
    Tipo de retorno -> É responsável por dizer qual o tipo de dado que o método irá retornar. Ex: int, double, String, void.
    Nome do método -> É o nome do método.
    Parâmetros -> São os valores que o método irá receber para realizar a ação.
    Corpo do método -> É o bloco de código que será executado quando o método for chamado.
  */

  // Criado um método chamado exibeFichaTecnica que não recebe nenhum parâmetro e não retorna nenhum valor.
  void exibeFichaTecnica() {
    // Está imprimindo os valores dos atributos do objeto.
    System.out.println("Nome: " + nome);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    System.out.println("Incluído no plano: " + incluidoNoPlano);
    System.out.println("Avaliação: " + somaDasAvaliacoes);
    System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    System.out.println("Duração em minutos: " + duracaoEmMinutos);
  }

  // Criado um método chamado avalia que recebe um parâmetro do tipo double e não retorna nenhum valor.
  void avalia(double nota) {
    somaDasAvaliacoes += nota; // Está somando a nota recebida ao valor da variável avaliacao.
    totalDeAvaliacoes++; // Está incrementando o valor da variável totalDeAvaliacoes.
  }

  // Criado um método chamado mediaDasAvaliacoes que não recebe nenhum parâmetro e retorna um valor do tipo double.
  double mediaDasAvaliacoes() {
    return somaDasAvaliacoes / totalDeAvaliacoes; // Está retornando a média das avaliações.
  }
}
