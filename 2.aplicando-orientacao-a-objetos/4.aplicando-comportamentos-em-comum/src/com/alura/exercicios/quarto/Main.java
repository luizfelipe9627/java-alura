package com.alura.exercicios.quarto;

public class Main {
  public static void main(String[] args) {
    ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao(); // Está sendo instanciado um objeto da classe ConversorTemperaturaPadrao.
    System.out.println("Celsius para Fahrenheit: " + conversor.celsiusParaFahrenheit(32)); // Está sendo chamado o método celsiusParaFahrenheit, que imprime a temperatura 32 convertida de celsius para fahrenheit.
    System.out.println("Fahrenheit para Celsius: " + conversor.fahrenheitParaCelsius(124)); // Está sendo chamado o método fahrenheitParaCelsius, que imprime a temperatura 124 convertida de fahrenheit para celsius.
  }
}
