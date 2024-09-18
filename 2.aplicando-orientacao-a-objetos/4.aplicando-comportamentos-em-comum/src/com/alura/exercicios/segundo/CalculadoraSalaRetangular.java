package com.alura.exercicios.segundo;

//* Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

// A classe CalculadoraSalaRetangular implementa a interface CalculoGeometrico, ou seja, ela é obrigada a implementar o método calcularArea e calcularPerimetro.
public class CalculadoraSalaRetangular implements CalculoGeometrico {
  @Override // Está sobrescrevendo o método calcularArea da interface CalculoGeometrico, responsável por calcular a área.
  // O método calcularArea recebe dois parâmetros do tipo double, que são a altura e a largura, e retorna um valor do tipo double, que é a área da sala retangular.
  public double calcularArea(double altura, double largura) {
    return altura * largura; // Está retornando o resultado da multiplicação da altura pela largura.
  }

  @Override // Está sobrescrevendo o método calcularPerimetro da interface CalculoGeometrico, responsável por calcular o perímetro.
  // O método calcularPerimetro recebe dois parâmetros do tipo double, que são a altura e a largura, e retorna um valor do tipo double, que é o perímetro da sala retangular.
  public double calcularPerimetro(double altura, double largura) {
    return 2 * (altura + largura); // Está retornando o resultado da multiplicação de 2 pela soma da altura com a largura.
  }
}
