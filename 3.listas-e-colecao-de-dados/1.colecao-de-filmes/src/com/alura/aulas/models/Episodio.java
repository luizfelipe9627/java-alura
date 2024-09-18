package com.alura.models;

import com.alura.interfaces.Classificavel;

// Criado uma classe chamada Episodio que implementa a interface Classificavel.
public class Episodio implements Classificavel {
  // Os atributos privados não podem ser acessados diretamente por outras classes, somente por getters e setters.
  private int numero; // Criado uma variável do tipo inteiro chamada numero, que armazena o número do episódio.
  private String nome; // Criado uma variável do tipo String chamada nome, que armazena o nome do episódio.
  private Serie serie; // Criado uma variável do tipo Serie(recebe todos os atributos da classe Serie) chamada serie, que armazena a série do episódio.
  private int totalVisualizacoes; // Criado uma variável do tipo inteiro chamada totalVisualizacoes, que armazena a quantidade total de visualizações do episódio.

  // Criado um método getter do tipo inteiro chamado getNumero, responsável por retornar o valor da variável numero.
  public int getNumero() {
    return numero; // Retorna o valor da variável numero.
  }

  // Criado um método setter do tipo void chamado setNumero, responsável por atribuir um valor para a variável numero.
  public void setNumero(int numero) {
    this.numero = numero; // Atribui o valor passado como parâmetro para a variável numero.
  }

  // Criado um método getter do tipo String chamado getNome, responsável por retornar o valor da variável nome.
  public String getNome() {
    return nome; // Retorna o valor da variável nome.
  }

  // Criado um método setter do tipo void chamado setNome, responsável por atribuir um valor para a variável nome.
  public void setNome(String nome) {
    this.nome = nome; // Atribui o valor passado como parâmetro para a variável nome.
  }

  // Criado um método getter do tipo Serie chamado getSerie, responsável por retornar o valor da variável serie.
  public Serie getSerie() {
    return serie; // Retorna o valor da variável serie.
  }

  // Criado um método setter do tipo void chamado setSerie, responsável por atribuir um valor para a variável serie.
  public void setSerie(Serie serie) {
    this.serie = serie; // Atribui o valor passado como parâmetro para a variável serie.
  }

  // Criado um método getter do tipo inteiro chamado getTotalVisualizacoes, responsável por retornar o valor da variável totalVisualizacoes.
  public int getTotalVisualizacoes() {
    return totalVisualizacoes; // Retorna o valor da variável totalVisualizacoes.
  }

  // Criado um método setter do tipo void chamado setTotalVisualizacoes, responsável por atribuir um valor para a variável totalVisualizacoes.
  public void setTotalVisualizacoes(int totalVisualizacoes) {
    this.totalVisualizacoes = totalVisualizacoes; // Atribui o valor passado como parâmetro para a variável totalVisualizacoes.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // Criado um método chamado getClassificacao que retorna um valor do tipo inteiro. Esse método é obrigatório por causa da interface Classificavel.
  public int getClassificacao() {
    // Se o total de visualizações for maior que 100, executa o if.
    if(totalVisualizacoes > 100) {
      return 4; // Retorna 4 se o total de visualizações for maior que 100.
    } else {
      return 2; // Retorna 2 se o total de visualizações for menor ou igual a 100.
    }
  }
}
