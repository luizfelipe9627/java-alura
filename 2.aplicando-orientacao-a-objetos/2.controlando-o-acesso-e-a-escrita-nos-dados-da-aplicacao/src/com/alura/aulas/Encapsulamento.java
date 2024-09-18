package com.alura.aulas;

public class Encapsulamento {
  //* Modificadores de acesso
  /*
    Modificador de acesso é uma palavra-chave que define o nível de acesso de uma classe, método ou atributo.
    Existem quatro tipos de modificadores de acesso em Java:
    - public: acessível de qualquer lugar.
    - protected: acessível na mesma classe, pacote e subclasses.
    - default: acessível na mesma classe e pacote.
    - private: acessível apenas na mesma classe.
  */

  // Criado variáveis do tipo String e int para armazenar as informações do carro.
  private String modelo; // O modificador de acesso private não permite que o atributo seja acessado diretamente por outras classes, somente pela própria classe.
  protected int ano; // O modificador de acesso protected permite que o atributo seja acessado pela própria classe, por classes do mesmo pacote e por subclasses.
  String cor; // O modificador de acesso default(definido por padrão) permite que o atributo seja acessado pela própria classe e por classes do mesmo pacote.
  public String marca; // O modificador de acesso public permite que o atributo seja acessado de qualquer lugar.

  //* Setters
  /*
    Setters são métodos que permitem alterar o valor de um atributo de uma classe.
    Eles são usados para garantir que os atributos de uma classe mantenham um estado válido.
  */

  // Criado um método público(ou seja, acessível de qualquer lugar independente do pacote) do tipo void(sem retorno) chamado setModelo que recebe um parâmetro do tipo String chamado modelo.
  public void setModelo(String modelo) {
    this.modelo = modelo; // O this é uma referência ao modelo da classe, ou seja, está atribuindo o valor do parâmetro do método ao atributo modelo do objeto.
  }

  //* Getters
  /*
    Getters são métodos que permitem acessar o valor de um atributo de uma classe.
    Eles são usados para garantir que os atributos de uma classe sejam acessados de forma controlada.
  */

  // Criado um método público(ou seja, acessível de qualquer lugar independente do pacote) do tipo String que retorna o valor do atributo modelo.
  public String getModelo() {
    return modelo; // Está retornando o valor do atributo modelo.
  }

  // Criado um método público(ou seja, acessível de qualquer lugar independente do pacote) chamado fichaTecnica.
  public void fichaTecnica() {
    // Está imprimindo os valores dos atributos passados no objeto.
    System.out.println("Modelo: " + modelo);
    System.out.println("Marca: " + marca);
    System.out.println("Ano: " + ano);
    System.out.println("Cor: " + cor);
  }

  // Criado um método público chamado calcularIdade que recebe um parâmetro do tipo int chamado ano.
  public int calcularIdade(int ano) {
    return 2024 - ano; // Está retornando a idade do carro.
  }
}
