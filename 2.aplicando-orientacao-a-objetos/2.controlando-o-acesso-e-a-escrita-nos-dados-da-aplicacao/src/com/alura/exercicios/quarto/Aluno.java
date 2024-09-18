package com.alura.exercicios.quarto;

//* Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
public class Aluno {
  private String nome; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo String chamado nome, que armazena o nome do aluno.
  private double nota1; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo double chamado nota1, que armazena a primeira nota do aluno.
  private double nota2; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo double chamado nota2, que armazena a segunda nota do aluno.
  private double nota3; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo double chamado nota3, que armazena a terceira nota do aluno.

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNome que retorna um valor do tipo String.
  public String getNome() {
    return nome; // Retorna o valor do atributo nome.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setNome que recebe um parâmetro do tipo String chamado nome.
  public void setNome(String nome) {
    this.nome = nome; // Retorna o valor do atributo nome.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNota1 que retorna um valor do tipo double.
  public void setNota1(double nota1) {
    this.nota1 = nota1; // Retorna o valor do atributo nota1.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNota2 que retorna um valor do tipo double.
  public void setNota2(double nota2) {
    this.nota2 = nota2; // Retorna o valor do atributo nota2.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNota3 que retorna um valor do tipo double.
  public void setNota3(double nota3) {
    this.nota3 = nota3; // Retorna o valor do atributo nota3.
  }

  // Criado um método chamado calcularMedia, que calcula a média das notas do aluno e retorna um valor do tipo double.
  public double calcularMedia() {
    double media = (this.nota1 + this.nota2 + this.nota3) / 3;
    return media;
  }

}
