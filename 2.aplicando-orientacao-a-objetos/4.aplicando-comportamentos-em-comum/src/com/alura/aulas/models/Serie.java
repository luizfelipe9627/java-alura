package com.alura.aulas.models;


// Criado uma classe chamada Serie que herda da classe Titulo, ou seja, a classe Serie possui todos os atributos e métodos da classe Titulo.
public class Serie extends Titulo {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private int temporadas; // Criado uma variável do tipo int chamada temporadas, que armazena a quantidade de temporadas da série.
  private int episodiosPorTemporada; // Criado uma variável do tipo int chamada episodiosPorTemporada, que armazena a quantidade de episódios da série.
  private boolean ativa; // Criado uma variável do tipo boolean chamada ativa, que armazena se a série está ativa ou não.
  private int minutosPorEpisodio; // Criado uma variável do tipo int chamada minutosPorEpisodio, que armazena a duração de cada episódio da série em minutos.

  // Os métodos getters são responsáveis por retornar o valor do atributo, já que ele é privado e não pode ser acessado diretamente.

  public int getTemporadas() {
    return temporadas; // Retorna o valor do atributo temporadas.
  }

  public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada; // Retorna o valor do atributo episodiosPorTemporada.
  }

  public boolean isAtiva() {
    return ativa; // Retorna o valor do atributo ativa.
  }

  public int getMinutosPorEpisodio() {
    return minutosPorEpisodio; // Retorna o valor do atributo minutosPorEpisodio.
  }

  // Os métodos setters são responsáveis por alterar o valor do atributo, já que ele é privado e não pode ser acessado diretamente.

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas; // Atribui o valor temporadas ao atributo temporadas.
  }

  public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada; // Atribui o valor episodiosPorTemporada ao atributo episodiosPorTemporada.
  }

  public void setAtiva(boolean ativa) {
    this.ativa = ativa; // Atribui o valor ativa ao atributo ativa.
  }

  public void setMinutosPorEpisodio(int minutosPorEpisodio) {
    this.minutosPorEpisodio = minutosPorEpisodio; // Atribui o valor minutosPorEpisodio ao atributo minutosPorEpisodio.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  public int getDuracaoEmMinutos() {
    return temporadas * episodiosPorTemporada * minutosPorEpisodio; // Retorna a duração total da série em minutos.
  }
}
