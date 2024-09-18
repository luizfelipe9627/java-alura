package com.alura.exercicios.terceiro;

public class Main {
  public static void main(String[] args) {
    Cachorro cachorro = new Cachorro(); // Está criando um objeto cachorro do tipo Cachorro.
    Animal animal = (Animal) cachorro; // Está sendo feito um casting de cachorro para animal, fazendo com que animal seja um cachorro.

    //* Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.

    // O instanceof verifica se o objeto é uma instância de uma determinada classe, nesse caso, verifica se animal é uma instância de Cachorro.
    if (animal instanceof Cachorro) {
      System.out.println("O objeto é um Cachorro."); // Imprime que o objeto é um Cachorro.
    } else {
      System.out.println("O objeto não é um Cachorro."); // Imprime que o objeto não é um Cachorro.
    }
  }
}
