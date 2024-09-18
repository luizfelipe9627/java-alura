package com.alura.aulas.model;

import com.google.gson.annotations.SerializedName; // Importa a classe SerializedName do pacote com.google.gson.annotations, responsável por mapear o nome do atributo no JSON para o nome do atributo na classe.

public class Titulo {
  //* SerializedName
  /*
    - A anotação @SerializedName é usada para mapear o nome do atributo no JSON para o nome do atributo na classe.
    - Na API do OMDB, o nome do atributo que representa o nome do filme é Title e o nome do atributo que representa o ano de lançamento é Year.
  */

  @SerializedName("Title") // Está sendo definido o nome do atributo no JSON, para que seja possível mapear o atributo nome para o atributo Title no JSON.
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private String nome; // Criado um atributo do tipo String chamado nome, que armazena o nome do filme.

  @SerializedName("Year") // Está sendo definido o nome do atributo no JSON, para que seja possível mapear o atributo anoDeLancamento para o atributo Year no JSON.
  private int anoDeLancamento; // Criado um atributo do tipo int chamado anoDeLancamento, que armazena o ano de lançamento do filme.

  private int duracaoEmMinutos; // Criado um atributo do tipo int chamado duracaoEmMinutos, que armazena a duração do filme em minutos.

  // Criado um construtor que recebe um parâmetro do tipo TituloOMDB chamado meuTituloOMDB.
  public Titulo(TituloOMDB meuTituloOMDB) {
    this.nome = meuTituloOMDB.title(); // Atribui o valor do título retornado pela API ao atributo nome.
    this.anoDeLancamento = Integer.valueOf(meuTituloOMDB.year()); // Atribui o valor do ano de lançamento convertido para inteiro da API e atribui ao anoDeLancamento.
    this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0,2)); // Atribui o valor da duração do filme removendo os minutos na API e atribui ao atributo duracaoEmMinutos.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNome que retorna um valor do tipo String.
  public String getNome() {
    return nome; // Retorna o valor do atributo nome.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getAnoDeLancamento que retorna um valor do tipo int.
  public int getAnoDeLancamento() {
    return anoDeLancamento; // Retorna o valor do atributo anoDeLancamento.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getDuracaoEmMinutos que retorna um valor do tipo int.
  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos; // Retorna o valor do atributo duracaoEmMinutos.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setNome que recebe um parâmetro do tipo String chamado nome.
  public void setNome(String nome) {
    this.nome = nome; // Atribui o valor nome ao atributo nome.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setAnoDeLancamento que recebe um parâmetro do tipo int chamado anoDeLancamento.
  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento; // Atribui o valor anoDeLancamento ao atributo anoDeLancamento.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setDuracaoEmMinutos que recebe um parâmetro do tipo int chamado duracaoEmMinutos.
  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos; // Atribui o valor duracaoEmMinutos ao atributo duracaoEmMinutos.
  }

  // Criado um método chamado exibeFichaTecnica que não retorna nada, responsável por exibir a ficha técnica do filme.
  public void exibeFichaTecnica(){
    System.out.println("Nome: " + nome); // Imprime o valor do atributo nome.
    System.out.println("Ano de lançamento: " + anoDeLancamento); // Imprime o valor do atributo anoDeLancamento.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // Está sobrescrevendo o método toString da superclasse Object,  fazendo com que retorne uma String ao invés de um endereço de memória.
  public String toString() {
    return "Nome: " + nome + " (" + anoDeLancamento + ")" + " - Duração: " + duracaoEmMinutos + " minutos"; // Retorna o nome do filme, o ano de lançamento e a duracaoEmMinutos.
  }
}
