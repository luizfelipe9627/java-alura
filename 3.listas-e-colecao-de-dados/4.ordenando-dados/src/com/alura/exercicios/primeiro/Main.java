package com.alura.exercicios.primeiro;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    //* Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
    
    ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>(); // Criado uma lista de números inteiros chamada listaDeNumeros.

    // Adicionado números na lista.
    listaDeNumeros.add(23); // Adicionado o número 23 na lista.
    listaDeNumeros.add(97); // Adicionado o número 97 na lista.
    listaDeNumeros.add(2); // Adicionado o número 30 na lista.

    Collections.sort(listaDeNumeros); // Ordena a lista de números em ordem crescente.

    System.out.println("Lista de números ordenada: " + listaDeNumeros); // Exibe a lista de números após a ordenação.
  }
}
