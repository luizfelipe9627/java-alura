package com.alura;
import com.alura.models.Episodio;
import com.alura.models.Filme;
import com.alura.models.Recomendacao;
import com.alura.models.Serie;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("--------------------------------------------------");

    Serie theFlash = new Serie(); // Criado um objeto chamado theFlash da classe Serie.
    // Percebemos que a classe Serie herda da classe Titulo, então a classe Serie possui todos os atributos e métodos da classe Titulo.
    theFlash.setNome("The Flash"); // Atribui o valor "The Flash" ao atributo nome.
    theFlash.setAnoDeLancamento(2014); // Atribui o valor 2014 ao atributo anoDeLancamento.

    theFlash.exibeFichaTecnica(); // Chama o método exibeFichaTecnica da classe theFlash.

    theFlash.setTemporadas(7); // Atribui o valor 7 ao atributo temporadas.
    theFlash.setEpisodiosPorTemporada(22); // Atribui o valor 22 ao atributo episodiosPorTemporada.
    theFlash.setMinutosPorEpisodio(45); // Atribui o valor 45 ao atributo minutosPorEpisodio.

    System.out.println("Duração total da série: " + theFlash.getDuracaoEmMinutos() + " minutos"); // Imprime a duração total da série em minutos.

    System.out.println("--------------------------------------------------");

    Filme filme = new Filme(); // Criado um objeto chamado filme da classe Filme.
    // Percebemos que a classe Filme
    filme.setNome("The Shawshank Redemption"); // Atribui o valor "The Shawshank Redemption" ao atributo nome.
    filme.setAnoDeLancamento(1994); // Atribui o valor 1994 ao atributo anoDeLancamento.
    filme.setDiretor("Frank Darabont"); // Atribui o valor "Frank Darabont" ao atributo diretor.
    filme.avalia(8); // Chama o método avalia passando o valor 6 como parâmetro.
    filme.avalia(8); // Chama o método avalia passando o valor 8 como parâmetro.

    System.out.println("Média de avaliação: " + filme.getClassificacao()); // Imprime a média de avaliação do filme.

    filme.exibeFichaTecnica(); // Chama o método exibeFichaTecnica da classe Filme.

    filme.setDuracaoEmMinutos(142); // Atribui o valor 142 ao atributo duracaoEmMinutos.

    System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos() + " minutos"); // Imprime a duração do filme em minutos.

    System.out.println("--------------------------------------------------");

    Filme outroFilme = new Filme(); // Criado um objeto chamado outroFilme da classe Filme.
    outroFilme.setNome("The Godfather"); // Atribui o valor "The Godfather" ao atributo nome.
    outroFilme.setAnoDeLancamento(1972); // Atribui o valor 1972 ao atributo anoDeLancamento.
    outroFilme.setDuracaoEmMinutos(175); // Atribui o valor 175 ao atributo duracaoEmMinutos.

    outroFilme.exibeFichaTecnica(); // Chama o método exibeFichaTecnica da classe Filme, fazendo com que exiba a ficha técnica do filme.

    System.out.println("--------------------------------------------------");

    Recomendacao recomendacao = new Recomendacao(); // Criado um objeto chamado recomendacao da classe Recomendacao.
    recomendacao.filtra(filme); // Chama o método filtra passando o objeto filme como parâmetro.

    System.out.println("--------------------------------------------------");

    Episodio episodio = new Episodio(); // Criado um objeto chamado episodio da classe Episodio.
    episodio.setNumero(1); // Atribui o valor 1 ao atributo numero do episódio.
    episodio.setSerie(theFlash); // Está atribuindo o objeto theFlash ao atributo serie.
    episodio.setTotalVisualizacoes(100); // Atribui o valor 100 ao atributo totalVisualizacoes.

    recomendacao.filtra(episodio); // Chama o método filtra passando o objeto episodio como parâmetro, fazendo com que exiba a recomendação do episódio.

    System.out.println("--------------------------------------------------");

    var meuFilme = new Filme(); // Criado uma variável chamada meuFilme que armazena um objeto da classe Filme.
    meuFilme.setNome("The Dark Knight"); // Atribui o valor "The Dark Knight" ao atributo nome.
    meuFilme.setAnoDeLancamento(2008); // Atribui o valor 2008 ao atributo anoDeLancamento.
    meuFilme.setDuracaoEmMinutos(152); // Atribui o valor 152 ao atributo duracaoEmMinutos.
    meuFilme.avalia(10); // Chama o método avalia passando o valor 10 como parâmetro.

    //* > ArrayList
    /*
      - ArrayList é uma coleção de dados que permite armazenar e manipular um conjunto de elementos.
    */

    ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>(); // Criado um ArrayList chamado listaDeFilmes que armazena objetos da classe Filme.

    listaDeFilmes.add(filme); // Adiciona o objeto filme à listaDeFilmes.
    listaDeFilmes.add(outroFilme); // Adiciona o objeto outroFilme à listaDeFilmes.
    listaDeFilmes.add(meuFilme); // Adiciona o objeto meuFilme à listaDeFilmes.

    System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size()); // Imprime o tamanho da lista de filmes, o size() retorna o tamanho da lista.
    System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome()); // Imprime o nome do primeiro filme da lista, o get(0) retorna o primeiro elemento da lista e o getNome() retorna o nome do filme.

    System.out.println("toString do filme: " + listaDeFilmes.get(0).toString()); // Imprime o toString do primeiro filme da lista, o get(0) retorna o primeiro elemento da lista e o toString() retorna uma representação em String do objeto.

    System.out.println(listaDeFilmes); // Imprime a lista de filmes diretamente, o ArrayList já possui um método toString que retorna uma representação em String da lista.
  }
}
