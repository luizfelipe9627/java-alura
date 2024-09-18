package com.alura.exercicios.quarto;

//* Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
  @Override // Está sendo sobrescrito o método celsiusParaFahrenheit da interface ConversorTemperatura.
  // O método celsiusParaFahrenheit recebe um parâmetro do tipo double, que é a temperatura em celsius, e retorna um valor do tipo double, que é a temperatura convertida de celsius para fahrenheit.
  public double celsiusParaFahrenheit(double temperatura) {
    return (temperatura * 9 / 5) + 32; // Está sendo retornado o valor da temperatura convertida de celsius para fahrenheit.
  }

  @Override // Está sendo sobrescrito o método fahrenheitParaCelsius da interface ConversorTemperatura.
  // O método fahrenheitParaCelsius recebe um parâmetro do tipo double, que é a temperatura em fahrenheit, e retorna um valor do tipo double, que é a temperatura convertida de fahrenheit para celsius.
  public double fahrenheitParaCelsius(double temperatura) {
    return (temperatura - 32) * 5 / 9; // Está sendo retornado o valor da temperatura convertida de fahrenheit para celsius.
  }
}
