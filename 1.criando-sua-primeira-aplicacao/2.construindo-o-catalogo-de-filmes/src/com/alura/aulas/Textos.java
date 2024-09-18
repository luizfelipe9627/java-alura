package com.alura.aulas;

public class Textos {
  public static void main(String[] args) {
    //* Strings
    /*
      Em Java, uma string é um objeto que representa uma sequência de caracteres. Elas são imutáveis, o que significa que uma vez criadas, não podem ser alteradas. 
      Você pode criar strings de várias maneiras, como literais de string, objetos de string e concatenação de strings.
    */

    String nome = "João"; // Criando uma variável do tipo string chamada nome que armazena o valor "João".
    String sobrenome = new String("Silva"); // Criando uma variável do tipo string chamada sobrenome que armazena o valor "Silva".
    String nomeCompleto = nome + " " + sobrenome; // Concatenando as variáveis nome e sobrenome e armazenando o resultado na variável nomeCompleto.
    System.out.println("Nome completo: " + nomeCompleto); // Imprimindo o valor da variável nomeCompleto no console.

    //* > Text blocks
    /*
      Text blocks são uma nova feature do Java 13 que permitem criar strings multilinhas de forma mais legível.
    */

    // Criando uma variável do tipo string chamada texto que armazena um texto multilinhas.
    String texto = """
      Este é um texto
      que ocupa várias
      linhas.
    """ ;
    System.out.println(texto);

    //* Comparação com strings
    /*
      Em Java, as strings são objetos que representam uma sequência de caracteres. Elas são imutáveis, o que significa que uma vez criadas, não podem ser alteradas. 
      Para comparar strings em Java, você pode usar o método equals() ou o operador ==. O método equals() compara o conteúdo das strings, enquanto o operador == compara as referências dos objetos.
    */

    String senha = "123456"; // Criando uma variável do tipo string chamada senha que armaena o valor "123456".

    // Se a senha for igual a "123456", imprime "Senha correta", senão, imprime "Senha incorreta".
    if (senha.equals("123456")) {
      System.out.println("Senha correta");
    } else {
      System.out.println("Senha incorreta");
    }

    //* Formatação de strings
    /*
      Em Java, você pode formatar strings usando a classe String.format() ou o método System.out.printf(). 
      A classe String.format() permite criar uma string formatada com base em um formato especificado, enquanto o método System.out.printf() imprime uma string formatada no console.
    */

    String sobreNome = "Silva"; // Criando uma variável do tipo string chamada sobreNome que armazena o valor "Silva".
    int idade = 21; // Criando uma variável do tipo inteiro chamada idade que armazena o valor "21".

    // Criando uma variável do tipo string chamada mensagem que armazena uma string formatada com base nos valores das variáveis sobreNome e idade.
    String mensagem = String.format("Meu sobrenome é %s e tenho %d anos.", sobreNome, idade);

    System.out.println(mensagem); // Imprimindo o valor da variável mensagem no console.
  }
}
