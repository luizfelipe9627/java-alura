package com.alura.exercicios.quinto;

public class Quadrado implements Forma {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private double lado; // Criado um atributo do tipo double chamado lado.

  // Criado um construtor que recebe o lado do quadrado como parâmetro.
  public Quadrado(double lado) {
    this.lado = lado; // Atribui o lado recebido ao atributo lado.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // Está sobrescrevendo o método calcularArea da interface Forma.
  public double calcularArea() {
    return lado * lado; // Retorna a área do quadrado.
  }
}
