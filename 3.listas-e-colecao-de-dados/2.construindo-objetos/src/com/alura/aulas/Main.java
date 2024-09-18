package com.alura.aulas;

import com.alura.aulas.models.Filme;
import com.alura.aulas.models.Serie;

public class Main {
  public static void main(String[] args) {
    System.out.println("--------------------------------------------------");

    Serie theFlash = new Serie("The Flash", 2000); // Criado um objeto chamado theFlash da classe Serie que recebe o nome da série e o ano de lançamento como parâmetros no construtor.

    theFlash.exibeFichaTecnica(); // Chama o método exibeFichaTecnica da classe theFlash.

    theFlash.setTemporadas(7); // Atribui o valor 7 ao atributo temporadas.
    theFlash.setEpisodiosPorTemporada(22); // Atribui o valor 22 ao atributo episodiosPorTemporada.
    theFlash.setMinutosPorEpisodio(45); // Atribui o valor 45 ao atributo minutosPorEpisodio.

    System.out.println("Duração total da série: " + theFlash.getDuracaoEmMinutos() + " minutos"); // Imprime a duração total da série em minutos.

    System.out.println("--------------------------------------------------");

    Filme filme = new Filme("The Shawshank Redemption", 1994); // Criado um objeto chamado filme da classe Filme que recebe o nome do filme como parâmetro no construtor.
    filme.setDiretor("Frank Darabont"); // Atribui o valor "Frank Darabont" ao atributo diretor.
    filme.avalia(8); // Chama o método avalia passando o valor 6 como parâmetro.
    filme.avalia(8); // Chama o método avalia passando o valor 8 como parâmetro.

    System.out.println("Média de avaliação: " + filme.getClassificacao()); // Imprime a média de avaliação do filme.

    filme.exibeFichaTecnica(); // Chama o método exibeFichaTecnica da classe Filme.

    filme.setDuracaoEmMinutos(142); // Atribui o valor 142 ao atributo duracaoEmMinutos.

    System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos() + " minutos"); // Imprime a duração do filme em minutos.

    System.out.println("--------------------------------------------------");
  }
}
