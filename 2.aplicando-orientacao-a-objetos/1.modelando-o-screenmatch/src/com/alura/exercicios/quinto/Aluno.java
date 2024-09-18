package com.alura.exercicios.quinto;

//* Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
public class Aluno {
  // Criado variáveis do tipo String e int para armazenar as informações do aluno.
  public String nome;
  public int idade;

  // Criado um método chamado exibirAluno que não recebe nenhum parâmetro e não retorna nenhum valor.
  public void exibirAluno() {
    System.out.println("Nome: " + nome); // Está imprimindo o valor do atributo nome.
    System.out.println("Idade: " + idade); // Está imprimindo o valor do atributo idade.
  }
}
