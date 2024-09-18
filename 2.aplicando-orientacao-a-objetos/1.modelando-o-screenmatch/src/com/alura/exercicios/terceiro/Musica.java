package com.alura.exercicios.terceiro;

//* Crie uma classe Musica com atributos titulo, artista, anoLancamento, somaAvaliacoes e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Musica {
  // Criado variáveis do tipo String, int e double para armazenar as informações da música.
  public String titulo;
  public String artista;
  public int anoLancamento;
  public double somaAvaliacoes;
  public int totalAvaliacoes;

  // Criado um método chamado fichaTecnica que não recebe nenhum parâmetro e não retorna nenhum valor.
  public void fichaTecnica() {
    // Está imprimindo os valores dos atributos passados no objeto.
    System.out.println("Título: " + titulo);
    System.out.println("Artista: " + artista);
    System.out.println("Ano de lançamento: " + anoLancamento);
  }

  // Criado um método chamado avaliarMusica que recebe um parâmetro do tipo int e não retorna nenhum valor.
  public void avaliarMusica(double nota) {
    somaAvaliacoes += nota; // Está somando a nota recebida ao valor da variável somaAvaliacoes.
    totalAvaliacoes++; // Está incrementando o valor da variável totalAvaliacoes.
  }

  // Criado um método chamado mediaDasAvaliacoes que não recebe nenhum parâmetro e retorna um valor do tipo double.
  public double mediaDasAvaliacoes() {
    return somaAvaliacoes / totalAvaliacoes; // Está retornando a média das avaliações.
  }
}
