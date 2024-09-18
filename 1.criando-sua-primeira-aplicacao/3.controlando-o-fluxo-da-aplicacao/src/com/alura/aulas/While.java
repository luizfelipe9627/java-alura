package com.alura.aulas;
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de dados de entrada a partir da entrada padrão.

public class While {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner(responsável por ler os dados de entrada) chamado scanner, que lê os dados da entrada padrão (System.in).

    double mediaAvaliacao = 0; // Cria uma variável do tipo double chamada mediaAvaliacao responsável por armazenar a média das avaliações, com valor inicial 0.
    double nota = 0; // Cria uma variável do tipo double chamada nota responsável por armazenar a nota inserida pelo usuário, com valor inicial 0.
    int qntNota = 0; // Cria uma variável do tipo int chamada qntNota responsável por armazenar a quantidade de notas inseridas pelo usuário, com valor inicial 0.

    //* While
    /*
      O laço de repetição while é utilizado para repetir um bloco de código enquanto uma condição for verdadeira. A condição é avaliada antes de cada iteração e, enquanto for verdadeira, o bloco de código é executado.
    */

    // Enquanto a variável nota for menor que 3, executa o bloco de código.
    while (nota != -1) { 
      System.out.println("Digite a sua avaliação para o filme ou -1 para sair: "); // Imprime a mensagem para o usuário digitar a avaliação do filme ou -1 para sair.
      nota = scanner.nextDouble(); // Cria uma variável do tipo double chamada nota que armazena o valor do tipo double digitado pelo usuário.

      // Se a variável nota for diferente de -1, executa o bloco de código.
      if(nota != -1) {
        mediaAvaliacao += nota; // Soma o valor da variável nota à variável mediaAvaliacao.
        qntNota++; // Incrementa a variável qntNota em 1.
      }
    }

    scanner.close(); // Fecha o objeto scanner.

    // Se a variável qntNota for igual a 0, executa o bloco de código.
    if(qntNota == 0) { 
      System.out.println("Nenhuma avaliação foi inserida."); // Imprime a mensagem "Nenhuma avaliação foi inserida.".
      
      return; // Encerra a execução do método main.
    }

    double media = mediaAvaliacao / qntNota; // Cria uma variável do tipo double chamada media que armazena o valor da divisão da variável mediaAvaliacao pela variável qntNota.
 
    // Imprime a mensagem "A média das avaliações é: " + a média das avaliações, formatada com duas casas decimais.
    System.out.println("A média das avaliações é: " + String.format("%.2f", media));

    scanner.close(); // Fecha o objeto scanner.
  }
}
