package com.alura.exercicios;

import com.alura.exercicios.primeiro.Saudacao;
import com.alura.exercicios.quarto.Carro;
import com.alura.exercicios.quinto.Aluno;
import com.alura.exercicios.segundo.Calculadora;
import com.alura.exercicios.terceiro.Musica;

public class Main {
  public static void main(String[] args) {
    Saudacao saudacao = new Saudacao(); // Está criando um novo objeto do tipo Saudacao e atribuindo a variável saudacao.
    saudacao.saudacao(); // Está chamando o método saudacao do objeto saudacao.

    Calculadora calculadora = new Calculadora(); // Está criando um novo objeto do tipo Calculadora e atribuindo a variável calculadora.
    System.out.println(calculadora.dobrarNumero(5)); // Está chamando o método dobrarNumero do objeto calculadora e imprimindo o valor retornado.

    Musica musica = new Musica(); // Está criando um novo objeto do tipo Musica e atribuindo a variável musica.
    musica.titulo = "Gods - League of Legends"; // Está atribuindo um valor para o atributo titulo do objeto musica.
    musica.artista = "Soyeon"; // Está atribuindo um valor para o atributo artista do objeto musica.
    musica.anoLancamento = 2021; // Está atribuindo um valor para o atributo anoLancamento do objeto musica.

    musica.fichaTecnica(); // Está chamando o método fichaTecnica do objeto musica.
    musica.avaliarMusica(5.2); // Está chamando o método avaliarMusica do objeto musica passando a nota 5.
    musica.avaliarMusica(8.0); // Está chamando o método avaliarMusica do objeto musica passando a nota 4.
    musica.avaliarMusica(9.4); // Está chamando o método avaliarMusica do objeto musica passando a nota 3.
    System.out.println("Média das avaliações: " + musica.mediaDasAvaliacoes()); // Está imprimindo a média das avaliações do objeto musica.

    Carro carro = new Carro(); // Está criando um novo objeto do tipo Carro e atribuindo a variável carro.
    carro.modelo = "Civic"; // Está atribuindo um valor para o atributo modelo do objeto carro.
    carro.ano = 2021; // Está atribuindo um valor para o atributo ano do objeto carro.
    carro.cor = "Preto"; // Está atribuindo um valor para o atributo cor do objeto carro.

    carro.fichaTecnica(); // Está chamando o método fichaTecnica do objeto carro.
    System.out.println("Idade do carro: " + carro.calcularIdade(2021)); // Está imprimindo a idade do carro do objeto carro.

    Aluno aluno = new Aluno(); // Está criando um novo objeto do tipo Aluno e atribuindo a variável aluno.
    aluno.nome = "João Carlos"; // Está atribuindo um valor para o atributo nome do objeto aluno.
    aluno.idade = 17; // Está atribuindo um valor para o atributo idade do objeto aluno.

    aluno.exibirAluno(); // Está chamando o método exibirAluno do objeto aluno.
  }
}
