package com.alura.aulas;

public class TiposPrimitivos {
  public static void main(String[] args) {
    //* Tipos Primitivos
    /*
      Java é uma linguagem fortemente tipada, o que significa que todas as variáveis devem ser declaradas com um tipo específico. Existem oito tipos primitivos em Java, que são divididos em quatro categorias: inteiros, números de ponto flutuante, caracteres e booleanos.
    */

    // string: armazena texto.
    String nome = "João"; // Nome é uma variável do tipo string que armazena o valor "João".
    System.out.println("Nome: " + nome); // Imprime uma string concatenado com o valor da variável nome no console.

    // int: armazena números inteiros.
    int idade = 30; // Idade é uma variável do tipo inteiro que armazena o valor 30.
    System.out.println("Idade: " + idade); // Imprime uma string concatenado com o valor da variável idade no console.

    // double: armazena números decimais.
    double preco = 12.45; // Preço é uma variável do tipo double que armazena o valor 12.45.
    System.out.println("Preço: " + preco); // Imprime uma string concatenado com o valor da variável preco no console.

    // char: armazena um caractere.
    char letra = 'A'; // Letra é uma variável do tipo char que armazena o valor 'A'.
    System.out.println("Letra: " + letra); // Imprime uma string concatenado com o valor da variável letra no console.

    // boolean: armazena verdadeiro ou falso.
    boolean maiorDeIdade = true; // Maior de idade é uma variável do tipo boolean que armazena o valor true.
    System.out.println("Maior de idade: " + maiorDeIdade); // Imprime uma string concatenado com o valor da variável maiorDeIdade no console.

    // byte: armazena números inteiros de 8 bits.
    byte b = 100; // B é uma variável do tipo byte que armazena o valor 100.
    System.out.println("Byte: " + b); // Imprime uma string concatenado com o valor da variável b no console.

    // short: armazena números inteiros de 16 bits.
    short s = 1000; // S é uma variável do tipo short que armazena o valor 1000.
    System.out.println("Short: " + s); // Imprime uma string concatenado com o valor da variável s no console.

    // long: armazena números inteiros de 64 bits.
    long l = 1000000; // L é uma variável do tipo long que armazena o valor 1000000.
    System.out.println("Long: " + l); // Imprime uma string concatenado com o valor da variável l no console.

    // float: armazena números de ponto flutuante de 32 bits.
    float f = 12.45f; // F é uma variável do tipo float que armazena o valor 12.45.
    System.out.println("Float: " + f); // Imprime uma string concatenado com o valor da variável f no console.
  }
}
