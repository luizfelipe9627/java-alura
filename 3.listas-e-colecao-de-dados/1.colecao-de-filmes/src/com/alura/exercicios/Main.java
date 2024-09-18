package com.alura.exercicios;
import java.util.ArrayList;

/*
  * No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
  * Adicione pelo menos três pessoas à lista utilizando o método add.
  * Imprima o tamanho da lista utilizando o método size.
  * Imprima a primeira pessoa da lista utilizando o método get.
  * Imprima a lista completa
*/

public class Main {
  public static void main(String[] args) {
    ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>(); // Criado uma lista de array chamada listaDePessoas que armazena objetos do tipo Pessoa.

    Pessoa pessoa1 = new Pessoa(); // Criado um objeto chamado pessoa1 da classe Pessoa.
    pessoa1.setNome("João"); // Atribui o valor "João" ao atributo nome.
    pessoa1.setIdade(25); // Atribui o valor 25 ao atributo idade.

    Pessoa pessoa2 = new Pessoa(); // Criado um objeto chamado pessoa2 da classe Pessoa.
    pessoa2.setNome("Maria"); // Atribui o valor "Maria" ao atributo nome.
    pessoa2.setIdade(30); // Atribui o valor 30 ao atributo idade.

    Pessoa pessoa3 = new Pessoa(); // Criado um objeto chamado pessoa3 da classe Pessoa.
    pessoa3.setNome("José"); // Atribui o valor "José" ao atributo nome.
    pessoa3.setIdade(20); // Atribui o valor 20 ao atributo idade.

    listaDePessoas.add(pessoa1); // Adiciona o objeto pessoa1 na lista de pessoas.
    listaDePessoas.add(pessoa2); // Adiciona o objeto pessoa2 na lista de pessoas.
    listaDePessoas.add(pessoa3); // Adiciona o objeto pessoa3 na lista de pessoas.

    System.out.println("Tamanho da lista: " + listaDePessoas.size()); // Imprime o tamanho da lista de pessoas.

    System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome()); // Imprime o nome da primeira pessoa da lista.

    System.out.println("Lista de Pessoas:");
    // No for está percorrendo a lista de pessoas e imprimindo o nome e a idade de cada pessoa.
    for (Pessoa pessoa : listaDePessoas) {
      System.out.println(pessoa); // Imprime o nome e a idade da pessoa.
    }
  }
}
