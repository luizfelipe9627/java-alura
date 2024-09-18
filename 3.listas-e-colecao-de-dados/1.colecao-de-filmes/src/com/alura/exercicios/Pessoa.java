package com.alura.exercicios;

//* Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.

public class Pessoa {
  // Os atributos privados não podem ser acessados diretamente por outras classes, somente por getters e setters.
  private String nome; // Criado um atributo do tipo String chamado nome, que armazena o nome da pessoa.
  private int idade; // Criado um atributo do tipo inteiro chamado idade, que armazena a idade da pessoa.

  // Criado um getter chama getNome que retorna um valor do tipo String.
  public String getNome() {
    return nome; // Retorna o valor do atributo nome.
  }

  // Criado um setter chamado setNome que recebe um parâmetro do tipo String chamado nome.
  public void setNome(String nome) {
    this.nome = nome; // Atribui o valor nome ao atributo nome.
  }

  // Criado um getter chamado getIdade que retorna um valor do tipo inteiro.
  public int getIdade() {
    return idade; // Retorna o valor do atributo idade.
  }

  // Criado um setter chamado setIdade que recebe um parâmetro do tipo inteiro chamado idade.
  public void setIdade(int idade) {
    this.idade = idade; // Atribui o valor idade ao atributo idade.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // Está sobrescrevendo o método toString da superclasse Object, fazendo com que retorne uma String ao invés de um endereço de memória.
  public String toString() {
    return "Pessoa: " + getNome() + " (" + getIdade() + ")"; // Retorna o nome e a idade da pessoa.
  }
}
