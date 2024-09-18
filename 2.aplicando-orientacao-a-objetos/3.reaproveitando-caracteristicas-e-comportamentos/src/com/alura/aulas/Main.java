package com.alura.aulas;

import com.alura.aulas.models.CalculadoraTempo;
import com.alura.aulas.models.Filme;
import com.alura.aulas.models.Serie;

public class Main {
  public static void main(String[] args) {
    System.out.println("--------------------------------------------------");

    Serie serie = new Serie(); // Criado um objeto chamado serie da classe Serie.
    // Percebemos que a classe Serie herda da classe Titulo, então a classe Serie possui todos os atributos e métodos da classe Titulo.
    serie.setNome("Once Upon a Time"); // Atribui o valor "Once Upon a Time" ao atributo nome.
    serie.setAnoDeLancamento(2011); // Atribui o valor 2011 ao atributo anoDeLancamento.

    serie.exibeFichaTecnica(); // Chama o método exibeFichaTecnica da classe Serie.

    serie.setTemporadas(7); // Atribui o valor 7 ao atributo temporadas.
    serie.setEpisodiosPorTemporada(22); // Atribui o valor 22 ao atributo episodiosPorTemporada.
    serie.setMinutosPorEpisodio(45); // Atribui o valor 45 ao atributo minutosPorEpisodio.

    System.out.println("Duração total da série: " + serie.getDuracaoEmMinutos() + " minutos"); // Imprime a duração total da série em minutos.

    System.out.println("--------------------------------------------------");

    Filme filme = new Filme(); // Criado um objeto chamado filme da classe Filme.
    // Percebemos que a classe Filme
    filme.setNome("The Shawshank Redemption"); // Atribui o valor "The Shawshank Redemption" ao atributo nome.
    filme.setAnoDeLancamento(1994); // Atribui o valor 1994 ao atributo anoDeLancamento.
    filme.setDiretor("Frank Darabont"); // Atribui o valor "Frank Darabont" ao atributo diretor.

    filme.exibeFichaTecnica(); // Chama o método exibeFichaTecnica da classe Filme.

    filme.setDuracaoEmMinutos(142); // Atribui o valor 142 ao atributo duracaoEmMinutos.

    System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos() + " minutos"); // Imprime a duração do filme em minutos.

    System.out.println("--------------------------------------------------");

    Filme outroFilme = new Filme(); // Criado um objeto chamado outroFilme da classe Filme.
    outroFilme.setNome("The Godfather"); // Atribui o valor "The Godfather" ao atributo nome.
    outroFilme.setAnoDeLancamento(1972); // Atribui o valor 1972 ao atributo anoDeLancamento.
    outroFilme.setDuracaoEmMinutos(175); // Atribui o valor 175 ao atributo duracaoEmMinutos.

    CalculadoraTempo calculadora = new CalculadoraTempo(); // Criado um objeto chamado calculadora da classe CalculadoraTempo.

    //calculadora.incluiFilme(filme); // Chama o método incluiFilme da classe CalculadoraTempo, passando o objeto filme como parâmetro.
    //calculadora.incluiFilme(outroFilme); // Chama o método incluiFilme da classe CalculadoraTempo, passando o objeto outroFilme como parâmetro.

    calculadora.incluiTitulo(filme); // Chama o método incluiTitulo da classe CalculadoraTempo, passando o objeto filme como parâmetro.
    calculadora.incluiTitulo(outroFilme); // Chama o método incluiTitulo da classe CalculadoraTempo, passando o objeto outroFilme como parâmetro.
    calculadora.incluiTitulo(serie); // Chama o método incluiTitulo da classe CalculadoraTempo, passando o objeto serie como parâmetro.

    System.out.println("Duração total dos títulos: " + calculadora.getTempoTotal() + " minutos"); // Imprime a duração total dos títulos em minutos.
  }
}
