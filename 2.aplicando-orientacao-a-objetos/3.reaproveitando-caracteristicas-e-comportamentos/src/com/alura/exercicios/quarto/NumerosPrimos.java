package com.alura.exercicios.quarto;

//* rie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
public class NumerosPrimos {
  // O método verificaPrimalidade não retorna nenhum valor, apenas verifica se o número é primo ou não.
  public void verificarPrimalidade(int numero) {
    // Se a divisão do número por 2 for igual a 0, o número não é primo então executa o if.
    if (numero % 2 == 0) {
      System.out.println("O número " + numero + " não é primo."); // Exibe a mensagem "O número não é primo.".
    } else {
      System.out.println("O número " + numero + " é primo."); // Exibe a mensagem "O número é primo.".
    }
  }

  // O método listarPrimos não retorna nenhum valor, esse método é responsável por listar os números primos até o limite informado.
  public void listarPrimos(int limite) {
    // O laço for é utilizado para percorrer os números de 1 até o limite informado.
    for (int i = 1; i <= limite; i++) {
      // Se o número for primo, executa o if.
      if (i % 2 != 0) {
        System.out.println("O número " + i + " é primo."); // Exibe o número i e a mensagem
      }
    }
  }
}
