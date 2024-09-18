package com.alura.aulas;

public class Concatenacao {
  public static void main(String[] args) {
    //* > Concatenação de Strings
    /*
      A concatenação de strings é a operação de juntar duas ou mais strings em uma única string.
    */

    String nome = "João"; // Criado uma variável do tipo String chamada nome que armazena o valor "João".
    String sobrenome = "Silva"; // Criado uma variável do tipo String chamada sobrenome que armazena o valor "Silva".

    String nomeCompleto = nome + " " + sobrenome; // Criado uma variável nomeCompleto que armazena a concatenação das variáveis nome e sobrenome.
    System.out.println(nomeCompleto); // Imprime o valor da variável nomeCompleto.

    //* > Concatenação com números
    /*
      Em Java, você pode concatenar strings com números. Quando você concatena uma string com um número, o número é convertido em uma string antes de ser concatenado.
    */
    
    int idade = 30; // Criado uma variável do tipo inteiro chamada idade que armazena o valor 30.
    String mensagem = "A idade de " + nome + " é " + idade + " anos."; // Criado uma variável mensagem que armazena a concatenação de strings e números.
    System.out.println(mensagem); // Imprime o valor da variável mensagem.
  }
}
