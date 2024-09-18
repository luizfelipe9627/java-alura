package com.alura.exercicios.segundo;

// A classe Cachorro extende a classe Animal, herdando todos os métodos e atributos da classe Animal.
public class Cachorro extends Animal {
  @Override // O @Override é uma anotação que indica que o método emitirSom está sobrescrevendo um método da classe pai.
  // O método emitirSom é sobrescrito, ou seja, a implementação do método emitirSom da classe Animal é substituída pela implementação do método emitirSom da classe Cachorro.
  public void emitirSom() {
    System.out.println("Au au au..."); // Imprime a mensagem "Au au au...".
  }

  // Criado um método que não retorna nada chamado abanarRabo, responsável por abanar o rabo.
  public void abanarRabo() {
    System.out.println("Abanando o rabo..."); // Imprime a mensagem "Abanando o rabo...".
  }
}
