package com.alura.exercicios.segundo;

public class Main {
  public static void main(String[] args) {
    CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular(); // Está instanciando a classe CalculadoraSalaRetangular e atribuindo à variável calculadoraSalaRetangular.

    System.out.println("Área: " + calculadoraSalaRetangular.calcularArea(10, 5)); // Está imprimindo a área da sala retangular com altura 10 e largura 5.
    System.out.println("Perímetro: " + calculadoraSalaRetangular.calcularPerimetro(10, 5)); // Está imprimindo o perímetro da sala retangular com altura 10 e largura 5.
  }
}
