package com.alura.exercicios.quinto;

//* Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
public class Livro {
  private String titulo; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo String chamado titulo, que armazena o título do livro.
  private String autor; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo String chamado autor, que armazena o autor do livro.

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getTitulo que retorna um valor do tipo String.
  public String getTitulo() {
    return titulo; // Retorna o valor do atributo titulo.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setTitulo que recebe um parâmetro do tipo String chamado titulo.
  public void setTitulo(String titulo) {
    this.titulo = titulo; // Retorna o valor do atributo titulo.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getAutor que retorna um valor do tipo String.
  public String getAutor() {
    return autor; // Retorna o valor do atributo autor.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setAutor que recebe um parâmetro do tipo String chamado autor.
  public void setAutor(String autor) {
    this.autor = autor;
  }

  // Criado um método chamado exibirDetalhes que não retorna nada, responsável por exibir os detalhes do livro.
  public void exibirDetalhes() {
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
  }
}
