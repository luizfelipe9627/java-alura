package com.alura.exercicios.quarto;

//* Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
public class Carro {
  // Criado variáveis do tipo String e int para armazenar as informações do carro.
  public String modelo;
  public int ano;
  public String cor;

  // Criado um método chamado fichaTecnica que não recebe nenhum parâmetro e não retorna nenhum valor.
  public void fichaTecnica() {
    // Está imprimindo os valores dos atributos passados no objeto.
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
    System.out.println("Cor: " + cor);
  }

  // Criado um método chamado calcularIdade que recebe um parâmetro do tipo int e retorna um valor do tipo int.
  public int calcularIdade(int ano) {
    return 2024 - ano; // Está retornando a idade do carro.
  }
}
