package com.alura.exercicios.primeiro;

//* Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
public class ContaBancaria {
  private int numeroConta; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo int chamado numeroConta, que armazena o número da conta.
  private int saldo; // Criado um atributo privado(quem pode acessar apenas a própria classe) do tipo int chamado saldo, que armazena o saldo da conta.
  public String titular; // Criado um atributo públic(quem pode acessar de qualquer lugar) do tipo String chamado titular, que armazena o nome do titular da conta.

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNumeroConta que retorna um valor do tipo int.
  public int getNumeroConta() {
    return numeroConta; // Retorna o valor do atributo numeroConta.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setNumeroConta que recebe um parâmetro do tipo int chamado numeroConta.
  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getSaldo que retorna um valor do tipo int.
  public int getSaldo() {
    return saldo; // Retorna o valor do atributo saldo.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setSaldo que recebe um parâmetro do tipo int chamado saldo.
  public void setSaldo(int saldo) {
    this.saldo = saldo; // Retorna o valor do atributo saldo.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getTitular que retorna um valor do tipo String.
  public String getTitular() {
    return titular; // Retorna o valor do atributo titular.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setTitular que recebe um parâmetro do tipo String chamado titular.
  public void setTitular(String titular) {
    this.titular = titular; // Retorna o valor do atributo titular.
  }
}
