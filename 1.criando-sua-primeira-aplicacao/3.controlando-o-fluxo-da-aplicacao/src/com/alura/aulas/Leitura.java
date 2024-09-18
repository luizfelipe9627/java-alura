package com.alura.aulas;
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de dados de entrada a partir da entrada padrão.

public class Leitura {
  public static void main(String[] args) {
    //* Scanner
    /*
      A classe Scanner é utilizada para ler dados de entrada a partir da entrada padrão (System.in). Ela permite a leitura de diferentes tipos de dados, como inteiros, decimais, strings, entre outros.
    */

    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    System.out.println("Digite o seu nome: "); // Imprime a mensagem "Digite o seu nome: ".
    String nome = scanner.nextLine(); // Cria uma variável do tipo String chamada nome que armazena o valor do tipo String digitado pelo usuário.

    System.out.println("Digite a sua idade: "); // Imprime a mensagem "Digite a sua idade: ".
    int idade = scanner.nextInt(); // Cria uma variável do tipo int chamada idade que armazena o valor do tipo int digitado pelo usuário.

    System.out.println("Digite sua peso: "); // Imprime a mensagem "Digite seu peso: ".
    double peso = scanner.nextDouble(); // Cria uma variável do tipo double chamada peso que armazena o valor do tipo double digitado pelo usuário.

    // Imprime a mensagem "Olá, " + nome + "você tem " + idade + " anos e pesa " + altura + " kg.".
    System.out.println("Olá, " + nome + " você tem " + idade + " anos e pesa " + peso + " kg.");

    scanner.close(); // Fecha o objeto scanner, fazendo com que ele pare de ler os dados de entrada.
  }
}
