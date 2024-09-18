package com.alura.exercicios.terceiro;

import com.alura.exercicios.terceiro.models.Filme;
import com.alura.exercicios.terceiro.models.Serie;
import com.alura.exercicios.terceiro.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    //* No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

    Serie serie1 = new Serie("Breaking Bad", 2008); // Criado um objeto do tipo Serie chamado serie e passado o nome e o ano de lançamento como parâmetros.
    Serie serie2 = new Serie("Game of Thrones", 2011); // Criado um objeto do tipo Serie chamado serie e passado o nome e o ano de lançamento como parâmetros.
    Filme filme1 = new Filme("O Poderoso Chefão", 1972); // Criado um objeto do tipo Filme chamado filme e passado o nome e o ano de lançamento como parâmetros.
    Filme filme2 = new Filme("Interestelar", 2014); // Criado um objeto do tipo Filme chamado filme e passado o nome e o ano de lançamento como parâmetros.

    ArrayList<Titulo> listaDeTitulos = new ArrayList<Titulo>(); // Criado uma lista do tipo Titulo chamada listaDeTitulos.

    listaDeTitulos.add(serie1); // Adiciona a série Breaking Bad na lista de títulos.
    listaDeTitulos.add(filme1); // Adiciona o filme O Poderoso Chefão na lista de títulos.
    listaDeTitulos.add(serie2); // Adiciona a série Game of Thrones na lista de títulos.
    listaDeTitulos.add(filme2); // Adiciona o filme Interest

    Collections.sort(listaDeTitulos); // Ordena a lista de títulos.

    // Para cada título na lista de títulos.
    for (Titulo titulo : listaDeTitulos) {
      System.out.println(titulo); // Imprime o título.
    }
  }
}
