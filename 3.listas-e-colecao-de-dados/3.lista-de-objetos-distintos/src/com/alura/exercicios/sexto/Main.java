package com.alura.exercicios.sexto;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria(102342, 1700); // Criado um objeto do tipo ContaBancaria com número 1 e saldo 1000.
    ContaBancaria conta2 = new ContaBancaria(212581, 2200); // Criado um objeto do tipo ContaBancaria com número 2 e saldo 2000.
    ContaBancaria conta3 = new ContaBancaria(323421, 3560); // Criado um objeto do tipo ContaBancaria com número 3 e saldo 3000.

    ArrayList<ContaBancaria> listaContas = new ArrayList<>(); // Criado uma variável chamada listaContas que armazena uma lista de objetos do tipo ContaBancaria.
    // Adiciona as contas na lista de contas.
    listaContas.add(conta1);
    listaContas.add(conta2);
    listaContas.add(conta3);

    ContaBancaria contaMaiorSaldo = listaContas.get(0); // Cria uma variável chamada contaMaiorSaldo que armazena a primeira conta da lista de contas.

    // O for está passando por cada conta na lista de contas e armazenando na variável conta.
    for (ContaBancaria conta : listaContas) {
      // Se o saldo da conta for maior que o saldo da contaMaiorSaldo, a contaMaiorSaldo recebe a conta da iteração atual.
      if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
        contaMaiorSaldo = conta; // A conta com maior saldo recebe a conta da iteração atual.
      }
    }

    System.out.println("A conta com maior saldo é a conta de número " + contaMaiorSaldo.getNumeroConta() + " com saldo de R$" + contaMaiorSaldo.getSaldo()); // Imprime a conta com maior saldo.
  }
}
