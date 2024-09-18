package com.alura.aulas;

public class Condicional {
  public static void main(String[] args) {
    //* If e Else
    /*
      A estrutura condicional if-else é utilizada para tomar decisões em um programa. O bloco de código dentro do if é executado se a condição for verdadeira. Caso contrário, o bloco de código dentro do else é executado.
    */

    int idade = 17; // Criado uma variável do tipo int chamada idade que armazena o valor 17.
    boolean incluidoNoPlano = false; // Criado uma variável do tipo boolean chamada incluidoNoPlano que armazena o valor false.
    String tipoPlano = "plus"; // Criado uma variável do tipo String chamada tipoPlano que armazena o valor "plus".

    // O if verifica se a idade é maior ou igual a 18, se for verdadeiro imprime a mensagem "Você é maior de idade.".
    if (idade >= 18) {
      System.out.println("Você é maior de idade.");
    } 
    // Caso contrário, imprime a mensagem "Você é menor de idade.".
    else {
      
      System.out.println("Você é menor de idade.");
    }

    // O if verifica se a variável incluidoNoPlano é verdadeira ou se a variável tipoPlano é igual a "plus", se for verdadeiro imprime a mensagem "Você está incluído no plano.".
    if (incluidoNoPlano || tipoPlano.equals("plus")) {
      System.out.println("O serviço está disponível para você.");
    }
    // Caso contrário, imprime a mensagem "Você não está incluído no plano.".
    else {
      System.out.println("Esse serviço é exclusivo para clientes Plus.");
    }

    //* Switch case
    /*
      A estrutura condicional switch-case é utilizada para tomar decisões em um programa. O switch é utilizado para selecionar um bloco de código a ser executado com base no valor de uma variável. O case é utilizado para comparar o valor da variável com um valor específico. Se o valor da variável for igual ao valor do case, o bloco de código correspondente é executado.
    */

    int diaDaSemana = 3; // Criado uma variável do tipo int chamada diaDaSemana que armazena o valor 3.

    // O switch verifica o valor da variável diaDaSemana e executa o bloco de código correspondente ao valor.
    switch (diaDaSemana) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda-feira");
        break;
      case 3:
        System.out.println("Terça-feira");
        break;
      case 4:
        System.out.println("Quarta-feira");
        break;
      case 5:
        System.out.println("Quinta-feira");
        break;
      case 6:
        System.out.println("Sexta-feira");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Dia inválido");
        break;
    }
  }
}
