package com.alura.exercicios.terceiro;

//* Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
public class Produto {
  private String nome; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo String chamado nome, que armazena o nome do produto.
  private double preco; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo double chamado preco, que armazena o preço do produto.

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNome que retorna um valor do tipo String.
  public String getNome() {
    return nome; // Retorna o valor do atributo nome.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setNome que recebe um parâmetro do tipo String chamado nome.
  public void setNome(String nome) {
    this.nome = nome; // Atribui o valor do parâmetro nome ao atributo nome.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getPreco que retorna um valor do tipo double.
  public double getPreco() {
    return preco; // Retorna o valor do atributo preco.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setPreco que recebe um parâmetro do tipo double chamado preco.
  public void setPreco(double preco) {
    this.preco = preco; // Atribui o valor do parâmetro preco ao atributo preco.
  }

  public void aplicarDesconto(int desconto) {
    this.preco -= this.preco * (desconto / 100.0); // Calcula o desconto e atribui o valor ao atributo preco.
  }
}
