package com.alura.exercicios.terceiro;

public class ContaBancaria {
  // O modificador protected permite que as classes que herdam da classe ContaBancaria acessem o atributo saldo.
  protected double saldo; // Criado um atributo do tipo double chamado saldo, responsável por armazenar o saldo da conta bancária.

  // Criado um método que não retorna nada chamado setSaldo, responsável por atribuir um valor ao saldo da conta bancária.
  public void consultarSaldo() {
    System.out.println("Saldo: R$" + this.saldo); // Exibe o saldo da conta bancária.
  }

  // Criado um método que não retorna nada chamado depositar, responsável por depositar um valor na conta bancária.
  public void depositar(double valor) {
    // Se o valor for menor ou igual a 0, executa o bloco de código abaixo.
    if(valor <= 0) {
      System.out.println("Valor inválido."); // Exibe a mensagem "Valor inválido.".
      return; // Encerra a execução do método.
    }
    this.saldo += valor; // Soma o valor ao saldo da conta bancária.
    System.out.println("Depósito de R$" + valor + " realizado com sucesso."); // Exibe a mensagem "Depósito de R$[valor] realizado com sucesso.".
  }

  // Criado um método que não retorna nada chamado sacar, responsável por sacar um valor da conta bancária.
  public void sacar(double valor) {
    // Se o valor for maior que o saldo da conta bancária, executa o bloco de código abaixo.
    if(valor > this.saldo) {
      System.out.println("Saldo insuficiente."); // Exibe a mensagem "Saldo insuficiente.".
      return; // Encerra a execução do método.
    }
    this.saldo -= valor; // Subtrai o valor do saldo da conta bancária.
    System.out.println("Saque de R$" + valor + " realizado com sucesso."); // Exibe a mensagem "Saque de R$[valor] realizado com sucesso.".
  }
}
