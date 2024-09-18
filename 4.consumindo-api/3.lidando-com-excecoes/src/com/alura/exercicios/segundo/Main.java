package com.alura.exercicios.segundo;

import com.alura.exercicios.segundo.exception.SenhaInvalidaException;

import java.util.Scanner; // Importa a classe Scanner do pacote java.util, responsável por ler a entrada do usuário.

  //* Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Está sendo criado um novo objeto Scanner chamado scanner que será usado para ler a entrada do usuário.
    System.out.print("Digite a sua senha: "); // Está sendo impresso uma mensagem pedindo para o usuário digitar a sua senha.
    var senha = scanner.nextLine(); // Está sendo lido a entrada do usuário e armazenado na variável senha.

    // O try é um bloco que contém código que pode lançar uma exceção, e o catch é um bloco que captura a exceção lançada no bloco try e trata o erro, já o finally é um bloco que é executado sempre, independente se ocorreu uma exceção ou não.
    try {
      validarSenha(senha); // Está sendo chamado o método validarSenha passando a senha como parâmetro.

      System.out.println("A senha foi cadastrada com sucesso!"); // Está sendo impresso uma mensagem informando que a senha foi cadastrada com sucesso.
    } catch (SenhaInvalidaException e) {
      System.out.println(e.toString()); // Está sendo impresso a mensagem de erro.
    } finally {
      scanner.close(); // Está sendo fechado o objeto scanner.
    }
  }

  // Criado um método estático chamado validarSenha que recebe uma string chamada senha como parâmetro.
  private static void validarSenha(String senha) {
    if (senha.length() < 8) {
      throw new SenhaInvalidaException("A senha deve conter no mínimo 8 caracteres."); // Está sendo lançada uma exceção SenhaInvalidaException com a mensagem "A senha deve conter no mínimo 8 caracteres.".
    }
}
}
