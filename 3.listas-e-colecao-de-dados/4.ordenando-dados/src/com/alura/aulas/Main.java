package com.alura.aulas;

import com.alura.aulas.model.Filme;
import com.alura.aulas.model.Serie;
import com.alura.aulas.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Filme filme = new Filme("Spider Man", 2002); // Criado um objeto chamado filme da classe Filme que recebe o nome do filme e o ano de lançamento como parâmetros no construtor.
    filme.avalia(9); // Chamando o método avalia do objeto filme e passando a nota 9 como parâmetro.

    Serie serie = new Serie("The Flash", 2000); // Criado um objeto chamado serie da classe Serie que recebe o nome da série e o ano de lançamento como parâmetros no construtor.
    serie.avalia(8); // Chamando o método avalia do objeto serie e passando a nota 8 como parâmetro.

    ArrayList<Titulo> listaDeAssistidos = new ArrayList<>(); // Está criando uma lista de objetos do tipo Titulo, permitindo adicionar objetos do tipo Filme e Serie.

    listaDeAssistidos.add(serie); // Adicionando o objeto serie na lista de assistidos.
    listaDeAssistidos.add(filme); // Adicionando o objeto filme na lista de assistidos.

    //* > List
    /*
      - A interface List é uma coleção ordenada de elementos que permite elementos duplicados.
      - Ela é uma subinterface de Collection e é implementada por classes como ArrayList, LinkedList e Vector.
    */

    List<String> buscaPorArtista = new ArrayList<String>(); // Criado uma lista chamada buscaPorArtista do tipo String que armazenará nomes de artistas.

    buscaPorArtista.add("The Beatles"); // Adicionado o nome do artista The Beatles na lista buscaPorArtista.
    buscaPorArtista.add("Led Zeppelin"); // Adicionado o nome do artista Led Zeppelin na lista buscaPorArtista.
    buscaPorArtista.add("Queen"); // Adicionado o nome do artista Queen na lista buscaPorArtista.

    System.out.println(buscaPorArtista); // Exibido a lista buscaPorArtista.

    //* Collections sort
    /*
      - O método sort da classe Collections é utilizado para ordenar uma lista de objetos em ordem crescente.
    */

    Collections.sort(buscaPorArtista); // Ordenado a lista buscaPorArtista em ordem crescente.
    System.out.println("Artistas ordenados: " + buscaPorArtista); // Exibido a lista buscaPorArtista após a ordenação.

    Collections.sort(listaDeAssistidos); // Ordenado a lista listaDeAssistidos em ordem crescente.
    System.out.println("Lista de assistidos ordenada: " + listaDeAssistidos.toString()); // Exibiendo a lista listaDeAssistidos após a ordenação.

    //* Comparator
    /*
      - A interface Comparator é utilizada para definir a ordem de objetos de uma classe que não implementa a interface Comparable.
      - Ela possui um único método chamado compare que recebe dois objetos do tipo da classe e retorna um inteiro.
      - O método compare deve retornar um valor negativo se o primeiro objeto for menor que o segundo, 0 se forem iguais e um valor positivo se for maior.
    */

    listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); // Está pegando a listaDeAssistidos e atráves do método sort está ordenando a lista fazendo com que se receba um objeto do tipo Titulo chame o método getAnoDeLancamento para fazer a comparação.
    System.out.println("Lista de assistidos ordenada por ano de lançamento: " + listaDeAssistidos.toString()); // Exibindo a lista listaDeAssistidos após a ordenação por ano de lançamento.
  }
}
