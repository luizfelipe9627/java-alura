package com.alura.exercicios.quarto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    //* Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

    List<String> listaDeNomes = new ArrayList<String>(); // Criado uma lista do tipo String chamada listaDeNomes, que é um ArrayList ou seja, uma lista de arrays.
    listaDeNomes.add("João"); // Adiciona o nome João na lista de nomes.
    listaDeNomes.add("Maria"); // Adiciona o nome Maria na lista de nomes.
    listaDeNomes.add("José"); // Adiciona o nome José na lista de nomes.

    System.out.println("Lista de nomes: " + listaDeNomes.toString()); // Imprime a lista de nomes.

    List<Integer> listaDeIdades = new LinkedList<Integer>(); // Criado uma lista do tipo Integer chamada listaDeIdades, que é uma LinkedList ou seja, uma lista encadeada.
    listaDeIdades.add(22); // Adiciona a idade 20 na lista de idades.
    listaDeIdades.add(18); // Adiciona a idade 30 na lista de idades.
    listaDeIdades.add(35); // Adiciona a idade 40 na lista de idades.

    System.out.println("Lista de idades: " + listaDeIdades.toString()); // Imprime a lista de idades.
  }
}
