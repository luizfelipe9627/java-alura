package com.alura.models;

public class Podcast extends Audio {
  // O modificador private faz com que o atributo só possa ser acessado dentro da classe.
  private String apresentador; // Criado um atributo do tipo String chamado apresentador, que armazena o nome do apresentador do podcast.
  private String descricao; // Criado um atributo do tipo String chamado descricao, que armazena a descrição do podcast.

  // Criado um getter chamado getApresentador, que retorna um tipo String chamado apresentador.
  public String getApresentador() {
    return this.apresentador; // Retorna o valor do atributo host.
  }

  // Criado um setter chamado setApresentador, que recebe um parâmetro do tipo String chamado host.
  public void setApresentador(String apresentador) {
    this.apresentador = apresentador; // Atribui o valor do parâmetro apresentador ao atributo apresentador.
  }

  // Criado um getter chamado getDescricao, que retorna um tipo String chamado descricao.
  public String getDescricao() {
    return this.descricao; // Retorna o valor do atributo descricao.
  }

  // Criado um setter chamado setDescricao, que recebe um parâmetro do tipo String chamado descricao.
  public void setDescricao(String descricao) {
    this.descricao = descricao; // Atribui o valor do parâmetro descricao ao atributo descricao.
  }

  @Override // Sobrescreve o método getClassificacao da classe Audio.
  public int getClassificacao() {
    // Se o total de reproduções for maior que 500, a classificação é 10, senão é 8.
    if(this.getTotalReproducoes() > 500) {
      return 10; // Retorna 10.
    } else {
      return 8; // Retorna 8.
    }
  }
}
