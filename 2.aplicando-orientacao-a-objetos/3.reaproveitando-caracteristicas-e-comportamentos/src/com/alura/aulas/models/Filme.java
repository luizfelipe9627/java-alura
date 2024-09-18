package com.alura.aulas.models;

//* > Extends
/*
  O extends é uma palavra-chave que indica que uma classe herda de outra classe, ou seja, a classe que possui a palavra-chave extends herda todos os atributos e métodos da classe que está sendo extendida.
*/

// Criado uma classe chamada Filme que recebe todos os atributos e métodos da classe Titulo.
public class Filme extends Titulo {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private String diretor; // Criado um atributo do tipo String chamado diretor, que armazena o nome do diretor do filme.

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getDiretor que retorna um valor do tipo String.
  public String getDiretor() {
    return diretor; // Retorna o valor do atributo diretor.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setDiretor que recebe um parâmetro do tipo String chamado diretor.
  public void setDiretor(String diretor) {
    this.diretor = diretor; // Atribui o valor diretor ao atributo diretor.
  }
}