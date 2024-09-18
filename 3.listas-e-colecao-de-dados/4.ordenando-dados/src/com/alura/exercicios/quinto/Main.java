package com.alura.exercicios.quinto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    //* Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.

    List<String> listaPolimorfica; // Criado uma lista do tipo String chamada listaPolimorfica.

    listaPolimorfica = new ArrayList<String>(); // Instancia a lista polimórfica como um ArrayList de String.

    listaPolimorfica.add("A"); // Adiciona a string "A" na lista polimórfica.
    listaPolimorfica.add("B"); // Adiciona a string "B" na lista polimórfica.
    listaPolimorfica.add("C"); // Adiciona a string "C" na lista polimórfica.

    System.out.println("ArrayList: " + listaPolimorfica); // Imprime a lista polimórfica.

    listaPolimorfica = new LinkedList<String>(); // Instancia a lista polimórfica como um LinkedList de String.

    listaPolimorfica.add("X"); // Adiciona a string "X" na lista polimórfica.
    listaPolimorfica.add("Y"); // Adiciona a string "Y" na lista polimórfica.
    listaPolimorfica.add("Z"); // Adiciona a string "Z" na lista polimórfica.

    System.out.println("LinkedList: " + listaPolimorfica); // Imprime a lista polimórfica.
  }
}
