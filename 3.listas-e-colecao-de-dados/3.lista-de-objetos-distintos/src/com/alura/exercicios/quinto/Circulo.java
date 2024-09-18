package com.alura.exercicios.quinto;

public class Circulo implements Forma {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private double raio; // Criado um atributo do tipo double chamado raio.

  // Criado um construtor que recebe o raio do círculo como parâmetro.
  public Circulo(double raio) {
    this.raio = raio; // Atribui o raio recebido ao atributo raio.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // Está sobrescrevendo o método calcularArea da interface Forma.
  public double calcularArea() {
    return Math.PI * raio * raio; // Retorna a área do círculo.

  }
}
