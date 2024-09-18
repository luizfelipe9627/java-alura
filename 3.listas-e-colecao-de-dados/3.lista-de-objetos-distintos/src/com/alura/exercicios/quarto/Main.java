package com.alura.exercicios.quarto;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Produto> listaProdutos = new ArrayList<>(); // Criado uma variável chamada listaProdutos do tipo ArrayList que armazena Produtos.

    Produto produto1 = new Produto("Notebook", 2500.0); // Criado um objeto produto1 do tipo Produto com nome "Notebook" e preço 2500.0.
    Produto produto2 = new Produto("Smartphone", 1500.0); // Criado um objeto produto2 do tipo Produto com nome "Smartphone" e preço 1500.0.

    listaProdutos.add(produto1); // Adiciona o produto1 na listaProdutos.
    listaProdutos.add(produto2); // Adiciona o produto2 na listaProdutos.

    double somaPrecos = 0; // Cria uma variável somaPrecos do tipo double que armazena a soma dos preços dos produtos, com valor inicial 0.

    // O for passa por cada item da listaProdutos.
    for(Produto produto : listaProdutos) {
      somaPrecos += produto.getPreco(); // Adiciona o preço do produto da iteração atual na variável somaPrecos.
    }

    double mediaPrecos = somaPrecos / listaProdutos.size(); // Calcula a média dos preços dos produtos, dividindo a soma dos preços pela quantidade de produtos.

    System.out.println("A média dos preços dos produtos é: " + mediaPrecos); // Imprime a média dos preços dos produtos.
  }
}
