package com.alura.exercicios.segundo;

//* Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
public class IdadePessoa {
  private String nome; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo String chamado nome, que armazena o nome da pessoa.
  private int idade; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo int chamado idade, que armazena a idade da pessoa.

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNome que retorna um valor do tipo String.
  public String getNome() {
    return nome; // Retorna o valor do atributo nome.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setNome que recebe um parâmetro do tipo String chamado nome.
  public void setNome(String nome) {
    this.nome = nome; // Retorna o valor do atributo nome.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getIdade que retorna um valor do tipo int.
  public int getIdade() {
    return idade; // Retorna o valor do atributo idade.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setIdade que recebe um parâmetro do tipo int chamado idade.
  public void setIdade(int idade) {
    this.idade = idade; // Retorna o valor do atributo idade.
  }

  // Criado um método chamado verificarIdade que não retorna nada, responsável por verificar se a pessoa é maior ou menor de idade.
  public void verificarIdade() {
    // Verifica se a idade da pessoa é maior ou igual a 18.
    if (this.idade >= 18) {
      System.out.println("A pessoa é maior de idade."); // Se a condição for verdadeira, exibe a mensagem "A pessoa é maior de idade.".
    } else {
      System.out.println("A pessoa é menor de idade."); // Se a condição for falsa, exibe a mensagem "A pessoa é menor de idade.".
    }
  }
}
