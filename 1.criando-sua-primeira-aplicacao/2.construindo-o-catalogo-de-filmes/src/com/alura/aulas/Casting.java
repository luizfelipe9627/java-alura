package com.alura.aulas;

public class Casting {
  public static void main(String[] args) {
    //* > Conversão de tipos com casting
    /*
      O casting é a conversão de um tipo de dado para outro. Em Java, existem dois tipos de casting: o casting explícito e o casting implícito.
    */

    double media = (9.5 + 8.0 + 7.5 + 10.0) / 4; // Criado uma variável do tipo double chamada media que armazena a média de quatro valores.
    System.out.println(media);

    // Casting explícito: É necessário fazer a conversão manualmente
    int mediaInteira = (int) media; // Criado uma variável cast que converte a variável media para um inteiro e armazena o resultado na variável mediaInteira.
    System.out.println(mediaInteira);

    // Casting implícito: Java faz a conversão automaticamente
    double mediaDouble = mediaInteira; // Criado uma variável mediaDouble que recebe o valor da variável mediaInteira.
    System.out.println(mediaDouble);

  }
}
