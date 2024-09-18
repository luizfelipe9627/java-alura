package com.alura.models;

public class Musica extends Audio {
  // O modificador private faz com que o atributo só possa ser acessado dentro da classe.
  private String artista; // Criado um atributo do tipo String chamado artista, que armazena o nome do artista da música.
  private String album; // Criado um atributo do tipo String chamado album, que armazena o nome do álbum da música.
  private String genero; // Criado um atributo do tipo String chamado genero, que armazena o gênero da música.

  // Criado um getter chamado getArtista que retorna um tipo String chamado artista.
  public String getArtista() {
    return this.artista; // Retorna o valor do atributo artista.
  }

  // Criado um setter chamado setArtista, que recebe um parâmetro do tipo String chamado artista.
  public void setArtista(String artista) {
    this.artista = artista; // Atribui o valor do parâmetro artista ao atributo artista.
  }

  // Criado um getter chamado getAlbum que retorna um tipo String chamado album.
  public String getAlbum() {
    return this.album; // Retorna o valor do atributo album.
  }

  // Criado um setter chamado setAlbum, que recebe um parâmetro do tipo String chamado album.
  public void setAlbum(String album) {
    this.album = album; // Atribui o valor do parâmetro album ao atributo album.
  }

  // Criado um getter chamado getGenero que retorna um tipo String chamado genero.
  public String getGenero() {
    return this.genero; // Retorna o valor do atributo genero.
  }

  // Criado um setter chamado setGenero, que recebe um parâmetro do tipo String chamado genero.
  public void setGenero(String genero) {
    this.genero = genero; // Atribui o valor do parâmetro genero ao atributo genero.
  }

  @Override // Sobrescreve o método getClassificacao da classe Audio.
  public int getClassificacao() {
    // Se o total de reproduções for maior que 200, a classificação é 10, senão é 6.
    if(this.getTotalReproducoes() > 2000) {
      return 10; // Retorna 10.
    } else {
      return 6; // Retorna 6.
    }
  }
}
