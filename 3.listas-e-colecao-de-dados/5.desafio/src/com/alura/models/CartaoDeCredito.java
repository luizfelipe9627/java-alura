package com.alura.models;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private double limite; // Criado um atributo do tipo double chamado limite, responsável por armazenar o limite do cartão de crédito.
  private double saldo; // Criado um atributo do tipo double chamado saldo, responsável por armazenar o saldo do cartão de crédito.
  private List<Compra> compras; // Criado um atributo do tipo array de Compra chamado compras, responsável por armazenar as compras realizadas com o cartão de crédito.

  // Criado um construtor da classe CartaoDeCredito que recebe um parâmetro do tipo double chamado limite.
  public CartaoDeCredito(double limite) {
    this.limite = limite; // Atribui o valor do parâmetro limite ao atributo limite.
    this.saldo = limite; // Atribui o valor do parâmetro limite ao atributo saldo.
    this.compras = new ArrayList<Compra>(); // Atribui uma nova instância(ou seja, um novo objeto) de ArrayList ao atributo compras.
  }

  // Criado um método setter chamado getLimite que recebe um parâmetro do tipo double chamado limite.
  public double getLimite() {
    return this.limite; // Retorna o valor do atributo limite.
  }

  // Criado um método setter chamado getSaldo que recebe um parâmetro do tipo double chamado saldo.
  public double getSaldo() {
    return this.saldo; // Retorna o valor do atributo saldo.
  }

  // Criado um método getter chamado getCompras que retorna um array de Compra.
  public List<Compra> getCompras() {
    return this.compras; // Retorna o valor do atributo compras.
  }

  // Criado um método chamado lancaCompra que recebe um parâmetro do tipo Compra chamado compra.
  public boolean lancaCompra(Compra compra) {
    // Se o saldo do cartão de crédito for maior ou igual ao valor da compra, então executa o if.
    if(this.saldo > compra.getValor()) {
      this.saldo -= compra.getValor(); // Subtrai o valor da compra do saldo do cartão de crédito.

      this.compras.add(compra); // Adiciona a compra ao array de compras.

      return true; // Retorna true.
    }

    return false; // Retorna false, caso o saldo do cartão de crédito seja menor que o valor da compra.
  }
}
