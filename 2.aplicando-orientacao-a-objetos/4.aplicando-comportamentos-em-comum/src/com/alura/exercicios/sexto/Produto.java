package com.alura.exercicios.sexto;

// A classe Produto implementa a interface Vendaval, ou seja, ela é obrigada a implementar o método calcularPrecoTotal.
public class Produto implements Vendaval {
  // O modificador private faz com que o atributo só possa ser acessado dentro da classe.
  private int quantidade; // Criado uma variável do tipo int para armazenar a quantidade de produtos.
  private double precoUnitario; // Criado uma variável do tipo double para armazenar o preço unitário do produto.
  private double desconto; // Criado uma variável do tipo double para armazenar o desconto do produto.

  // Criado um setter chamado setQuantidade que recebe um valor do tipo int e não retorna nada.
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade; // Atribui o valor passado como parâmetro para a variável quantidade.
  }

  // Criado um setter chamado setPrecoUnitario que recebe um valor do tipo double e não retorna nada.
  public void setPrecoUnitario(double precoUnitario) {
    this.precoUnitario = precoUnitario; // Atribui o valor passado como parâmetro para a variável precoUnitario.
  }

  // Criado um setter chamado setDesconto que recebe um valor do tipo double e não retorna nada.
  public void setDesconto(double desconto) {
    this.desconto = desconto / 100; // Atribui o valor passado como parâmetro para a variável desconto.
  }

  // Criado um getter chamado getDesconto que não recebe nenhum parâmetro e retorna um valor do tipo double.
  public double getDesconto() {
    return desconto * 100; // Retorna o valor do desconto em porcentagem.
  }

  @Override // O @Override é uma anotação que indica que o método abaixo é uma sobrescrita de um método da superclasse.
  // O método calcularPrecoTotal não recebe nenhum parâmetro e retorna um valor do tipo double.
  public double calcularPrecoTotal() {
    // Se a quantidade for maior que 10, então é retornado o valor da quantidade multiplicado pelo preço unitário menos a quantidade multiplicado pelo preço unitário vezes o desconto.
    if(quantidade >= 15) {
      setDesconto(10); // O desconto é de 10%.
      return (quantidade * precoUnitario) - (quantidade * precoUnitario * desconto); // Retorna o valor total com desconto.
    } else {
      setDesconto(0); // O desconto é de 0%.
      return quantidade * precoUnitario; // Retorna o valor total sem desconto.
    }
  }
}
