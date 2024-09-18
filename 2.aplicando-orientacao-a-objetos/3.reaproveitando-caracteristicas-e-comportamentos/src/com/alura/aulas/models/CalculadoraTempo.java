package com.alura.aulas.models;

public class CalculadoraTempo {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private int tempoTotal = 0; // Criado um atributo privado do tipo int chamado tempoTotal que armazena o tempo total de um ou mais filmes, inicializado com o valor 0.

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getTempoTotal que retorna um valor do tipo int.
  public int getTempoTotal() {
    return tempoTotal; // Retorna o valor do atributo tempoTotal.
  }

  /*
  // Criado um método chamado incluiFilme que não retorna nada, responsável por calcular o tempo total de um ou mais filmes.
    public void incluiFilme(Filme filme) {
      tempoTotal += filme.getDuracaoEmMinutos(); // Está modificando o valor do atributo tempoTotal, somando o valor do atributo duracaoEmMinutos do objeto filme.
    }

    // Criado um método chamado incluiSerie que não retorna nada, responsável por calcular o tempo total de uma ou mais séries.
    public void incluiSerie(Serie serie) {
      tempoTotal += serie.getDuracaoEmMinutos(); // Está modificando o valor do atributo tempoTotal, somando o valor do atributo duracaoEmMinutos do objeto serie.
    }
  */

  //* > Polimorfismo
  /*
    O polimorfismo é um conceito da orientação a objetos que permite que um objeto de uma classe filha seja tratado como um objeto da classe pai.
    Por exemplo, se temos uma classe chamada CalculadoraTempo que possui um método chamado incluiTitulo que recebe um objeto da classe Titulo como parâmetro, podemos passar um objeto da classe Filme ou Serie para esse método, pois Filme e Serie herdam de Titulo.
  */

  // Criado um método chamado incluiTitulo que não retorna nada, responsável por calcular o tempo total de um ou mais títulos.
  public void incluiTitulo(Titulo titulo) {
    System.out.println("Incluindo título: " + titulo.getNome()); // Imprime a mensagem "Incluindo título: " seguido do nome do título.
    tempoTotal += titulo.getDuracaoEmMinutos(); // Está modificando o valor do atributo tempoTotal, somando o valor do atributo duracaoEmMinutos do objeto titulo.
  }
}
