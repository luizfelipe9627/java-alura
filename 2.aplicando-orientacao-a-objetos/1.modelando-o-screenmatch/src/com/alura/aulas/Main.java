package com.alura.aulas;

public class Main {
  public static void main(String[] args) {
    //* > Instanciando um objeto a partir de uma classe
    /*
      Instanciar um objeto é criar um objeto de uma classe, fazendo com que o objeto tenha todas as características(atributos, métodos, etc) da classe.
    */

    Metodos meuFilme = new Metodos(); // Está criando um objeto do tipo Metodos chamado meuFilme.

    meuFilme.nome = "O Poderoso Chefão"; // Está atribuindo o valor "O Poderoso Chefão" a variável nome do objeto meuFilme.
    meuFilme.anoDeLancamento = 1972; // Está atribuindo o valor 1972 a variável anoDeLancamento do objeto meuFilme.
    meuFilme.incluidoNoPlano = true; // Está atribuindo o valor true a variável incluidoNoPlano do objeto meuFilme.
    meuFilme.somaDasAvaliacoes = 4.5; // Está atribuindo o valor 4.5 a variável avaliacao do objeto meuFilme.
    meuFilme.totalDeAvaliacoes = 3; // Está atribuindo o valor 230 a variável totalDeAvaliacoes do objeto meuFilme.
    meuFilme.duracaoEmMinutos = 175; // Está atribuindo o valor 175 a variável duracaoEmFilme do objeto meuFilme.

    //* Acessando os atributos de um objeto
    /*
      Para acessar os atributos de um objeto, basta chamar o objeto, seguido de um ponto(.) e o nome do atributo.
    */
    //System.out.println("Nome: " + meuFilme.nome); // Está imprimindo o valor do atributo/variável nome do objeto meuFilme.
    //System.out.println("Ano de lançamento: " + meuFilme.anoDeLancamento); // Está imprimindo o valor do atributo/variável anoDeLancamento do objeto meuFilme.

    //* Alterando os atributos de um objeto
    /*
      Para alterar os atributos de um objeto, basta chamar o objeto, seguido de um ponto(.) e o nome do atributo, e atribuir um novo valor.
    */
    //meuFilme.nome = "O Poderoso Chefão 2"; // Está alterando o valor do atributo/variável nome do objeto meuFilme para "O Poderoso Chefão 2".

    //* Chamando um método de um objeto
    /*
      Para chamar um método de um objeto, basta chamar o objeto, seguido de um ponto(.) e o nome do método.
    */
    meuFilme.exibeFichaTecnica(); // Está chamando o método exibeFichaTecnica do objeto meuFilme.

    meuFilme.avalia(5); // Está chamando o método avalia do objeto meuFilme e passando o valor 5 como parâmetro.
    meuFilme.avalia(8); // Está chamando o método avalia do objeto meuFilme e passando o valor 8 como parâmetro.
    meuFilme.avalia(10); // Está chamando o método avalia do objeto meuFilme e passando o valor 10 como parâmetro.
    System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes); // Está imprimindo o valor da variável somaDasAvaliacoes do objeto meuFilme.
    System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes); // Está imprimindo o valor da variável totalDeAvaliacoes do objeto meuFilme.

    System.out.println("Média das avaliações: " + meuFilme.mediaDasAvaliacoes()); // Está chamando o método mediaDasAvaliacoes do objeto meuFilme e imprimindo o valor retornado.
  }
}
