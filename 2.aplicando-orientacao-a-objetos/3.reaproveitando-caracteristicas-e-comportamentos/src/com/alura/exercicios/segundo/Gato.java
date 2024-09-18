package com.alura.exercicios.segundo;

public class Gato extends Animal {
  @Override // O @Override é uma anotação que indica que o método emitirSom está sobrescrevendo um método da classe pai.
  public void emitirSom() {
    System.out.println("Miau miau miau..."); // Imprime a mensagem "Miau miau miau...".
  }

  // Criado um método que não retorna nada chamado arranharMoveis, responsável por arranhar móveis.
  public void arranharMoveis() {
    System.out.println("Arranhando móveis..."); // Imprime a mensagem "Arranhando móveis...".
  }
}
