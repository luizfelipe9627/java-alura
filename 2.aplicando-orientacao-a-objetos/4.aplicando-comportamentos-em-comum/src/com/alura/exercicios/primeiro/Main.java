package com.alura.exercicios.primeiro;

public class Main {
  public static void main(String[] args) {
    ConversorMoeda conversor = new ConversorMoeda(); // Está sendo instanciado um objeto da classe ConversorMoeda e atribuído à variável conversor.
    System.out.println("Valor em reais: " + conversor.converterParaReal(100)); // Imprime no console o valor convertido para real.
  }
}
