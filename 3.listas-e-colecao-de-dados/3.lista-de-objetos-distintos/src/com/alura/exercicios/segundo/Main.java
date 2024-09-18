package com.alura.exercicios.segundo;

public class Main {
  public static void main(String[] args) {
    Cachorro cachorro = new Cachorro(); // Está criando um objeto cachorro do tipo Cachorro.
    Animal animal = (Animal) cachorro; // Está sendo feito um casting de cachorro para animal, fazendo com que animal seja um cachorro.
  }
}
