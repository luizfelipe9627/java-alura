package com.alura.aulas;
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de dados de entrada a partir da entrada padrão.

public class For {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    double mediaAvaliacao = 0; // Cria uma variável do tipo double chamada mediaAvaliacao e atribui o valor 0 a ela.
    double nota = 0; // Cria uma variável do tipo double chamada nota e atribui o valor 0 a ela.

    //* For
    /*
      O laço de repetição for é utilizado para repetir um bloco de código um número específico de vezes. Ele é composto por três partes: a inicialização, a condição de continuação e a atualização. A inicialização é executada uma única vez no início do laço, a condição de continuação é avaliada a cada iteração e, enquanto for verdadeira, o bloco de código é executado. A atualização é executada após cada iteração.
    */

    // O for inicializa a variável i com o valor 0. Enquanto i for menor que 3, executa o bloco de código e incrementa i em 1.
    for (int i = 0; i < 3; i++) { 
      System.out.println("Digite a sua avaliação para o filme: "); // Imprime a mensagem "Digite a sua avaliação para o filme: ".
      nota = scanner.nextDouble(); // Cria uma variável do tipo double chamada nota que armazena o valor do tipo double digitado pelo usuário.
      mediaAvaliacao += nota; // Soma o valor da variável nota à variável mediaAvaliacao.
    }

    double media = mediaAvaliacao / 3; // Cria uma variável do tipo double chamada media que armazena o valor da divisão da variável mediaAvaliacao por 3.
 
    // Imprime a mensagem "A média das avaliações é: " + a média das avaliações, formatada com duas casas decimais.
    System.out.println("A média das avaliações é: " + String.format("%.2f", media));

    scanner.close(); // Fecha o objeto scanner.
  }
}
