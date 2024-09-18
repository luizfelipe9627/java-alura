package com.alura.exercicios.primeiro;

//* Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
public class Carro {
  // Os atributos privados só podem ser acessados dentro da própria classe, a não ser que seja criado um método getter.
  private String modelo; // Criado um atributo do tipo string chamado modelo, que armazena o modelo do carro.
  private int precoAno1; // Criado um atributo do tipo inteiro chamado precoAno1, que armazena o preço do carro no primeiro ano.
  private int precoAno2; // Criado um atributo do tipo inteiro chamado precoAno2, que armazena o preço do carro no segundo ano.
  private int precoAno3; // Criado um atributo do tipo inteiro chamado precoAno3, que armazena o preço do carro no terceiro ano.

  // Criado um método setter que não retorna nada chamado setModelo, responsável por atribuir um valor ao atributo modelo.
  public void setModelo(String modelo) {
    this.modelo = modelo; // Atribui o valor do parâmetro modelo ao atributo modelo.
  }

  // Criado um método getter que retorna uma string chamado getModelo, responsável por retornar o valor do atributo modelo.
  public String getModelo() {
    return this.modelo; // Retorna o valor do atributo modelo.
  }

  // Criado um método getter que retorna um inteiro chamado getPrecoAno1, responsável por retornar o valor do atributo precoAno1.
  public int getPrecoAno1() {
    return this.precoAno1; // Retorna o valor do atributo precoAno1.
  }

  // Criado um método getter que retorna um inteiro chamado getPrecoAno2, responsável por retornar o valor do atributo precoAno2.
  public int getPrecoAno2() {
    return this.precoAno2; // Retorna o valor do atributo precoAno2.
  }

  // Criado um método getter que retorna um inteiro chamado getPrecoAno3, responsável por retornar o valor do atributo precoAno3.
  public int getPrecoAno3() {
    return this.precoAno3; // Retorna o valor do atributo precoAno3.
  }

  // Criado um método setter que não retorna nada chamado definirPrecos, responsável por atribuir valores aos atributos precoAno1, precoAno2 e precoAno3.
  public void definirPrecos(int precoAno1, int precoAno2, int precoAno3) {
    this.precoAno1 = precoAno1; // Atribui o valor do parâmetro precoAno1 ao atributo precoAno1.
    this.precoAno2 = precoAno2; // Atribui o valor do parâmetro precoAno2 ao atributo precoAno2.
    this.precoAno3 = precoAno3; // Atribui o valor do parâmetro precoAno3 ao atributo precoAno3.
  }

  // Criado um método chamado maiorPreco que retorna um double, responsável por retornar o maior preço entre os preços dos anos.
  public double maiorPreco() {
    int maiorPreco = Math.max(this.precoAno1, Math.max(this.precoAno2, this.precoAno3)); // Atribui o maior valor entre precoAno1, precoAno2 e precoAno3 à variável maiorPreco.
    return maiorPreco; // Retorna o valor da variável maiorPreco.
  }

  // Criado um método chamado menorPreco que retorna um double, responsável por retornar o menor preço entre os preços dos anos.
  public double menorPreco() {
    int menorPreco = Math.min(this.precoAno1, Math.min(this.precoAno2, this.precoAno3)); // Atribui o menor valor entre precoAno1, precoAno2 e precoAno3 à variável menorPreco.
    return menorPreco; // Retorna o valor da variável menorPreco.
  }
}
