package com.alura.exercicios.sexto;

// A classe Servico implementa a interface Vendaval, ou seja, ela é obrigada a implementar o método calcularPrecoTotal.
public class Servico implements Vendaval {
  private int precoPorHora; // Criado uma variável do tipo int chamada precoPorHora para armazenar o preço por hora do serviço.
  private int horasDeServico; // Criado uma variável do tipo int chamada horasDeServico para armazenar a quantidade de horas do serviço.

  // Criado um setter chamado setPrecoPorHora que recebe um valor do tipo int e não retorna nada.
  public void setPrecoPorHora(int preco) {
    this.precoPorHora = preco; // Atribui o valor passado como parâmetro para a variável preco.
  }

  // Criado um setter chamado setHorasDeServico que recebe um valor do tipo int e não retorna nada.
  public void setHorasDeServico(int horas) {
    this.horasDeServico = horas; // Atribui o valor passado como parâmetro para a variável horas.
  }

  @Override // O @Override é uma anotação que indica que o método abaixo é uma sobrescrita de um método da superclasse.
  // O método calcularPrecoTotal não recebe nenhum parâmetro e retorna um valor do tipo double.
  public double calcularPrecoTotal() {
    return precoPorHora * horasDeServico; // Retorna o valor total do serviço.
  }
}
