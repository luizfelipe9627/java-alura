package com.alura.exercicios.sexto;

//* Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

public class ContaBancaria {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private int numeroConta; // Criado um atributo do tipo int chamado numeroConta, que armazena o número da conta bancária.
  private double saldo; // Criado um atributo do tipo double chamado saldo, que armazena o saldo da conta bancária.

  // Está criando um construtor que recebe o número e o saldo da conta bancária.
  public ContaBancaria(int numeroConta, double saldo) {
    this.numeroConta = numeroConta; // Atribui o número recebido ao atributo número da classe.
    this.saldo = saldo; // Atribui o saldo recebido ao atributo saldo da classe.
  }

  // Está criando um getter chamado getNumeroConta que retorna o número da conta bancária.
  public int getNumeroConta() {
    return numeroConta; // Retorna o número da conta bancária.
  }

  // Está criando um getter chamado getSaldo que retorna o saldo da conta bancária.
  public double getSaldo() {
    return saldo; // Retorna o saldo da conta bancária.
  }
}
