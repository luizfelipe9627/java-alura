package com.alura;

import com.alura.models.CartaoDeCredito;
import com.alura.models.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in); // Cria um objeto do tipo Scanner para realizar a leitura de dados do usuário.

    System.out.println("Digite o limite do cartão: "); // Exibe a mensagem "Digite o limite do cartão: ".
    double limite = leitura.nextDouble(); // Lê um valor do tipo double digitado pelo usuário e atribui à variável limite.

    CartaoDeCredito cartao = new CartaoDeCredito(limite); // Cria um objeto do tipo CartaoDeCredito e passa o valor de limite digitado pelo usuário como parâmetro.

    int sair = 1; // Cria uma variável do tipo int chamada sair e atribui o valor 1.

    leitura.nextLine(); // Limpa o buffer do Scanner, fazendo com que a próxima leitura seja feita corretamente.

    // Enquanto a variável sair for diferente de 0, executa o bloco de código abaixo.
    while(sair != 0) {
      System.out.println("Digite a descrição da compra:"); // Exibe a mensagem "Digite a descrição da compra:".
      String descricao = leitura.nextLine(); // Lê uma string digitada pelo usuário e atribui à variável descricao.
      System.out.println("Digite o valor da compra:"); // Exibe a mensagem "Digite o valor da compra:".
      double valor = leitura.nextDouble(); // Lê um valor do tipo double digitado pelo usuário e atribui à variável valor.

      Compra compra = new Compra(descricao, valor); // Cria um objeto do tipo Compra e passa os valores de descricao e valor digitados pelo usuário como parâmetros.
      boolean compraRealizada = cartao.lancaCompra(compra); // Cria uma variável do tipo boolean chamada compraRealizada e atribui o valor retornado pelo método lancaCompra do objeto cartao, passando o objeto compra como parâmetro.

      // Se a compra for realizada, executa o if. Caso contrário, executa o else.
      if (compraRealizada) {
        System.out.println("Compra realizada!"); // Exibe a mensagem "Compra realizada!".
        System.out.println("Digite 0 para sair ou 1 para continuar"); // Exibe a mensagem "Digite 0 para sair ou 1 para continuar".
        sair = leitura.nextInt(); // Lê um valor do tipo int digitado pelo usuário e atribui à variável sair.

        leitura.nextLine(); // Limpa o buffer do Scanner, fazendo com que a próxima leitura seja feita corretamente.
      } else {
        System.out.println("Saldo insuficiente!"); // Exibe a mensagem "Saldo insuficiente!".
        sair = 0; // Atribui o valor 0 à variável sair.
      }
    }

    System.out.println("***********************");
    System.out.println("COMPRAS REALIZADAS:\n");

    Collections.sort(cartao.getCompras()); // Está ordenando as compras realizadas pelo cartão de crédito atráves do nome da compra.

    // O for passa por cada objeto do array de compras do cartão e exibe a descrição e o valor da compra.
    for (Compra c : cartao.getCompras()) {
      System.out.println(c.getDescricao() + " - " +c.getValor()); // Exibe a descrição e o valor da compra.
    }
    System.out.println("\n***********************");

    System.out.println("\nSaldo do cartão: " +cartao.getSaldo()); // Exibe o saldo do cartão de crédito.

    leitura.close(); // Fecha o objeto leitura.
  }
}
