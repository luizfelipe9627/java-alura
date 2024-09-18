package com.alura.exercicios.quinto;
import java.util.ArrayList;

//* Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.

public class Main {
  public static void main(String[] args) {
    Circulo circulo = new Circulo(2); // Criado um objeto circulo do tipo Circulo com raio 5.0.
    Quadrado quadrado = new Quadrado(8); // Criado um objeto quadrado do tipo Quadrado com lado 10.0.

    ArrayList<Forma> listaFormas = new ArrayList<>(); // Criado uma variável chamada listaFormas do tipo ArrayList que armazena Formas.
    listaFormas.add(circulo); // Adiciona o circulo na listaFormas.
    listaFormas.add(quadrado); // Adiciona o quadrado na listaFormas.

    // O for passa por cada item da listaFormas.
    for(Forma forma : listaFormas) {
      System.out.println("A área da forma é " + forma.calcularArea()); // Imprime a área da forma chamando o método calcularArea que foi sobrescrito nas classes Circulo e Quadrado.
    }
  }
}
