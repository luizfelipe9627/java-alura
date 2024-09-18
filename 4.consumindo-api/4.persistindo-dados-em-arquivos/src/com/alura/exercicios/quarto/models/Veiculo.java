package com.alura.exercicios.quarto.models;

public class Veiculo {
  private String modelo; // Está sendo criado um atributo do tipo String chamado modelo, responsável por armazenar o modelo do veículo.
  private int ano; // Está sendo criado um atributo do tipo int chamado ano, responsável por armazenar o ano de fabricação do veículo.
  private String marca; // Está sendo criado um atributo do tipo String chamado marca, responsável por armazenar a marca do veículo.
  private double preco; // Está sendo criado um atributo do tipo double chamado preco, responsável por armazenar o preço do veículo.

  // Criado um método setter chamado setPreco que recebe como parâmetro o preço do veículo.
  public void setPreco(double preco) {
    this.preco = preco; // Atribui o valor do parâmetro preco ao atributo preco.
  }

  // Criado um método setter chamado setModelo que recebe como parâmetro o modelo do veículo.
  public void setModelo(String modelo) {
    this.modelo = modelo; // Atribui o valor do parâmetro modelo ao atributo modelo.
  }

  // Criado um método setter chamado setAno que recebe como parâmetro o ano de fabricação do veículo.
  public void setAno(int ano) {
    this.ano = ano; // Atribui o valor do parâmetro ano ao atributo ano.
  }

  // Criado um método setter chamado setMarca que recebe como parâmetro a marca do veículo.
  public void setMarca(String marca) {
    this.marca = marca; // Atribui o valor do parâmetro marca ao atributo marca.
  }
}
