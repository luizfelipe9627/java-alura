package com.alura.exercicios;

import com.alura.exercicios.primeiro.ContaBancaria;
import com.alura.exercicios.quarto.Aluno;
import com.alura.exercicios.quinto.Livro;
import com.alura.exercicios.segundo.IdadePessoa;
import com.alura.exercicios.terceiro.Produto;

public class Main {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria(); // Criado um objeto chamado conta do tipo ContaBancaria.
    conta.setNumeroConta(1419230); // Atribui o valor 1419230 ao atributo numeroConta.
    conta.setSaldo(1500); // Atribui o valor 1419230 ao atributo saldo.
    conta.setTitular("Luiz Felipe"); // Atribui o valor "Luiz Felipe" ao atributo titular.

    System.out.println("Número da conta: " + conta.getNumeroConta()); // Imprime o valor do atributo numeroConta.
    System.out.println("Saldo: R$ " + conta.getSaldo()); // Imprime o valor do atributo saldo.
    System.out.println("Titular: " + conta.getTitular()); // Imprime o valor do atributo titular.

    IdadePessoa pessoa = new IdadePessoa(); // Criado um objeto chamado pessoa do tipo IdadePessoa.
    pessoa.setNome("Luiz Felipe"); // Atribui o valor "Luiz Felipe" ao atributo nome.
    pessoa.setIdade(20); // Atribui o valor 20 ao atributo idade.

    pessoa.verificarIdade(); // Verifica se a pessoa é maior ou menor de idade.

    System.out.println("Nome: " + pessoa.getNome()); // Imprime o valor do atributo nome.
    System.out.println("Idade: " + pessoa.getIdade()); // Imprime o valor do atributo idade.

    Produto produto = new Produto(); // Criado um objeto chamado produto do tipo Produto.
    produto.setNome("Notebook"); // Atribui o valor "Notebook" ao atributo nome.
    produto.setPreco(2500); // Atribui o valor 2500 ao atributo preco.
    produto.aplicarDesconto(10); // Aplica um desconto de 10% ao produto.

    System.out.println("Nome do produto: " + produto.getNome()); // Imprime o valor do atributo nome.
    System.out.println("Preço do produto: R$ " + produto.getPreco()); // Imprime o valor do atributo preco.

    Aluno aluno = new Aluno(); // Criado um objeto chamado aluno do tipo Aluno.
    aluno.setNome("Luiz Felipe"); // Atribui o valor "Luiz Felipe" ao atributo nome.
    aluno.setNota1(8); // Atribui o valor 10 ao atributo nota1.
    aluno.setNota2(6); // Atribui o valor 9 ao atributo nota2.
    aluno.setNota3(7); // Atribui o valor 8 ao atributo nota3.

    System.out.println("Nome do aluno: " + aluno.getNome()); // Imprime o valor do atributo nome.
    System.out.println("Média do aluno: " + aluno.calcularMedia()); // Imprime o valor da média do aluno.

    Livro livro = new Livro(); // Criado um objeto chamado livro do tipo Livro.
    livro.setTitulo("Java para iniciantes"); // Atribui o valor "Java para iniciantes" ao atributo titulo.
    livro.setAutor("Luiz Felipe"); // Atribui o valor "Luiz Felipe" ao atributo autor.
    livro.exibirDetalhes(); // Exibe os detalhes do livro.
  }
}
