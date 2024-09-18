package com.alura.exercicios;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList<Produto>(); // Está criando uma lista de produtos que armazena objetos do tipo Produto e atribui a variável produtos.

    // Está criando vários objetos do tipo Produto e atribuindo a variável produto, passando os valores do produto no construtor.
    Produto produto1 = new Produto("Arroz", 10.0, 5);
    Produto produto2 = new Produto("Feijão", 8.0, 3);
    Produto produto3 = new Produto("Macarrão", 5.0, 2);

    produtos.add(produto1); // Está adicionando o objeto produto1 na lista produtos.
    produtos.add(produto2); // Está adicionando o objeto produto2 na lista produtos.
    produtos.add(produto3); // Está adicionando o objeto produto3 na lista produtos.

    System.out.println("Produtos existentes: " + produtos.size()); // Está imprimindo a quantidade de produtos cadastrados.
    System.out.println(produtos.get(1).toString()); // Está imprimindo o segundo produto cadastrado.

    // Está percorrendo a lista de produtos.
    for (Produto produto : produtos) { // Está percorrendo a lista de produtos.
      System.out.println(produto.toString()); // Está imprimindo os produtos cadastrados.
    }

    System.out.println("--------------------------------------------------");

    ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 3.0, 1, "10/10/2021"); // Está criando um objeto do tipo ProdutoPerecivel e atribuindo a variável produtoPerecivel, passando os valores do produto para o construtor do Produto e ProdutoPerecivel.

    System.out.println(produtoPerecivel); // Está imprimindo o produto perecível cadastrado.
  }
}
