package com.alura.exercicios.primeiro;

// A classe ModeloCarro extende a classe Carro, herdando todos os métodos e atributos da classe Carro.
public class ModeloCarro extends Carro {
  // Criado um método que não retorna nada chamado fichaTecnica, responsável por imprimir informações carro.
  public void fichaTecnica() {
    System.out.println("Modelo: " + getModelo()); // Imprime o valor do atributo modelo, que é um atributo da classe Carro.
    System.out.println("Preço no primeiro ano: R$ " + getPrecoAno1()); // Imprime o valor do atributo precoAno1, que é um atributo da classe Carro.
    System.out.println("Preço no segundo ano: R$ " + getPrecoAno2()); // Imprime o valor do atributo precoAno2, que é um atributo da classe Carro.
    System.out.println("Preço no terceiro ano: R$ " + getPrecoAno3()); // Imprime o valor do atributo precoAno3, que é um atributo da classe Carro.
    System.out.println("Maior preço: R$ " + maiorPreco()); // Imprime o valor do atributo precoAno1, que é um atributo da classe Carro.
    System.out.println("Menor preço: R$ " + menorPreco()); // Imprime o valor do atributo precoAno3, que é um atributo da classe Carro.
  }
}
