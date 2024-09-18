package com.alura.aulas;

import com.alura.aulas.models.Filme;
import com.alura.aulas.models.Serie;
import com.alura.aulas.models.Titulo;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Filme filme = new Filme("The Shawshank Redemption", 1994); // Criado um objeto chamado filme da classe Filme que recebe o nome do filme como parâmetro no construtor.
    filme.avalia(9); // Chamando o método avalia do objeto filme e passando a nota 9 como parâmetro.

    Serie serie = new Serie("The Flash", 2000); // Criado um objeto chamado serie da classe Serie que recebe o nome da série e o ano de lançamento como parâmetros no construtor.
    serie.avalia(8); // Chamando o método avalia do objeto serie e passando a nota 8 como parâmetro.

    ArrayList<Titulo> listaDeAssistidos = new ArrayList<>(); // Está criando uma lista de objetos do tipo Titulo, permitindo adicionar objetos do tipo Filme e Serie.

    listaDeAssistidos.add(filme); // Adicionando o objeto filme na lista de assistidos.
    listaDeAssistidos.add(serie); // Adicionando o objeto serie na lista de assistidos.

    // Para cada item da lista de assistidos ele vai executar o for.
    for (Titulo item : listaDeAssistidos) {
      System.out.println("Nome: " + item.getNome()); // Imprime o item da lista.

      //* > InstaceOf
      /*
       O operador instanceof é usado para testar se o objeto é uma instância de uma classe, subclasse ou interface.
      */

      // Se o item da lista for do tipo Filme e o item for do tipo Filme, ele vai executar o bloco de código.
      if(item instanceof Filme filmeItem) {
        System.out.println("Classificação: " + filmeItem.getClassificacao()); // Imprime a classificação do filme.
      }
    }
  }
}
