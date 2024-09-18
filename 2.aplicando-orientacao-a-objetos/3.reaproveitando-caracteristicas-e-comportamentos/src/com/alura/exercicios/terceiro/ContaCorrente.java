package com.alura.exercicios.terceiro;

//* Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
public class ContaCorrente extends ContaBancaria {
  private double tarifaMensal; // Criado uma variável do tipo double chamada tarifaMensal.

  // Criado um método que não retorna nada chamado tarifaMensal, responsável por cobrar uma tarifa mensal de 20 reais.
  public void tarifaMensal() {
    saldo -= tarifaMensal; // Subtrai a tarifa mensal do saldo da conta corrente.
    System.out.println("Cobrada tarifa mensal de R$20,00."); // Exibe a mensagem "Cobrada tarifa mensal de R$20,00.".
  }
}
