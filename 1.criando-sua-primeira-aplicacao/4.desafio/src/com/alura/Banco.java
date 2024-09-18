package com.alura;
import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que permite a leitura de dados de entrada a partir da entrada padrão.
import java.text.NumberFormat; // Importa a classe NumberFormat do pacote java.text, que formata números de acordo com a localização.
import java.util.Locale; // Importa a classe Locale do pacote java.util, que representa uma localização geográfica.

public class Banco {
  public static void main(String[] args) {
    initDataClient(); // Inicializa os dados do cliente e exibe o menu de opções.
  }

  private static final Locale locale = Locale.forLanguageTag("pt-BR"); // Criado uma classe pública(ou seja, acessível de qualquer lugar) e estática(não é necessário instanciar a classe para acessá-la) e final(não pode ser alterada) chamada locale do tipo Locale, que armazena a localização do Brasil.
  private static final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale); // Criado uma classe pública(ou seja, acessível de qualquer lugar) e estática(não é necessário instanciar a classe para acessá-la) e final(não pode ser alterada) chamada currencyFormat do tipo NumberFormat, que formata valores monetários de acordo com a localização do Brasil.
  private static double saldo = 1000.00; // Criado uma classe pública(ou seja, acessível de qualquer lugar) e estática(não é necessário instanciar a classe para acessá-la) e final(não pode ser alterada) chamada saldo do tipo double, que armazena o saldo inicial do cliente.

  // Criado um método público(ou seja, acessível de qualquer lugar) e estático(não é necessário instanciar a classe para acessá-lo) chamado initDataClient que não retorna nada(void).
  public static void initDataClient() {
    // Cria uma mensagem formatada com os dados iniciais do cliente.
    String.format("""
      **************************************
      Dados iniciais do cliente:

      Nome: João da Silva
      Tipo de conta: Conta Corrente
      Saldo: R$ %s
      **************************************
    """, currencyFormat.format(saldo));

    Menu(); // Chama o método Menu, que exibe o menu de opções para o cliente.
  }

  // Criado um método público(ou seja, acessível de qualquer lugar) e estático(não é necessário instanciar a classe para acessá-lo) chamado Menu que não retorna nada(void).
  public static void Menu() {
    Scanner scanner = new Scanner(System.in); // Cria um objeto da classe Scanner para ler os dados de entrada, chamado scanner, que lê os dados da entrada padrão (System.in).

    boolean exit = false; // Criado uma variável booleana chamada exit e inicializada com o valor false.

    // Enquanto exit for false, ou seja, enquanto o usuário não escolher a opção de sair, executa o bloco de código abaixo.
    while (!exit) {
        // Exibe o menu de opções para o cliente.
        System.out.println("""
          ========== Menu de Opções ==========
          Escolha uma das opções abaixo:

          1. Consultar saldos
          2. Receber valor
          3. Transferir valor
          4. Sair
          ====================================
        """);

        int option = scanner.nextInt(); // Lê a opção escolhida pelo cliente e armazena na variável option.

        // Verifica a opção escolhida pelo cliente e executa o bloco de código correspondente.
        switch (option) {
          // Se a opção escolhida for 1, executa o bloco de código abaixo.
          case 1:
            ConsultarSaldos(); // Chama o método ConsultarSaldos, que exibe o saldo atual do cliente.
            break; // Encerra o case.
          // Se a opção escolhida for 2, executa o bloco de código abaixo.
          case 2:
            ReceberValor(scanner); // Chama o método ReceberValor, que recebe um valor do cliente e atualiza o saldo.
            break; // Encerra o case.
          // Se a opção escolhida for 3, executa o bloco de código abaixo.
          case 3:
            TransferirValor(scanner); // Chama o método TransferirValor, que transfere um valor para outra conta e atualiza o saldo.
            break; // Encerra o case.
          case 4:
            exit = true; // Define exit como true para sair do loop.
            break; // Encerra o case.
          // Se a opção escolhida for diferente de 1, 2, 3 ou 4, executa o bloco de código abaixo.
          default:
            System.out.println("Opção inválida. Tente novamente."); // Exibe uma mensagem de erro caso a opção escolhida seja inválida.
            break; // Encerra o case.
        }
    }

    scanner.close(); // Fecha o scanner quando não for mais necessário.
  }

  // Criado um método público(ou seja, acessível de qualquer lugar) e estático(não é necessário instanciar a classe para acessá-lo) chamado ConsultarSaldos que não retorna nada(void).
  public static void ConsultarSaldos() {
    System.out.println("O saldo atual é " + currencyFormat.format(saldo)); // Exibe o saldo atual do cliente formatado de acordo com a localização do Brasil.
  }

  // Criado um método público(ou seja, acessível de qualquer lugar) e estático(não é necessário instanciar a classe para acessá-lo) chamado ReceberValor que não retorna nada(void). Tem como parâmetro um objeto da classe Scanner chamado scanner.
  public static void ReceberValor(Scanner scanner) {
    System.out.println("Informe o valor a ser recebido: "); // Exibe a mensagem no console, solicitando que o usuário informe o valor a ser recebido.
    double valor = scanner.nextDouble(); // Lê um número real da entrada padrão e armazena na variável valor.
    saldo += valor; // Está somando o saldo com o valor recebido.
    System.out.println("Saldo atualizado: " + currencyFormat.format(saldo)); // Exibe o saldo atualizado do cliente formatado de acordo com a localização do Brasil.
  }

  // Criado um método público(ou seja, acessível de qualquer lugar) e estático(não é necessário instanciar a classe para acessá-lo) chamado TransferirValor que não retorna nada(void). Tem como parâmetro um objeto da classe Scanner chamado scanner.
  public static void TransferirValor(Scanner scanner) {
    System.out.println("Informe o valor a ser transferido: "); // Exibe a mensagem no console, solicitando que o usuário informe o valor a ser transferido.
    double valor = scanner.nextDouble(); // Lê um número real da entrada padrão e armazena na variável valor.

    // Verifica se o valor a ser transferido é maior que o saldo disponível.
    if (valor > saldo) {
      System.out.println("Não há saldo suficiente para realizar a transferência."); // Exibe uma mensagem de erro caso o saldo seja insuficiente.
      return; // Encerra o método.
    }

    saldo -= valor; // Está subtraindo o saldo com o valor transferido.
    System.out.println("Saldo atualizado: " + currencyFormat.format(saldo)); // Exibe o saldo atualizado do cliente formatado de acordo com a localização do Brasil.
  }
}

