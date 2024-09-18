package com.alura.aulas.model;

//* > Comparable
/*
  - A interface Comparable é utilizada para definir a ordem natural dos objetos de uma classe.
  - Ela possui um único método chamado compareTo que recebe um objeto do mesmo tipo da classe e retorna um inteiro.
  - O método compareTo deve retornar um valor negativo se o objeto atual for menor que o objeto passado como parâmetro, 0 se forem iguais e um valor positivo se for maior.
*/

// Criado uma classe chamada Titulo que implementa a interface Comparable responsável por definir a ordem natural dos objetos da classe, recebendo um parâmetro do tipo Titulo fazendo com que a classe seja comparável com ela mesma.
public class Titulo implements Comparable<Titulo> {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private String nome; // Criado um atributo do tipo String chamado nome, que armazena o nome do filme.
  private int anoDeLancamento; // Criado um atributo do tipo int chamado anoDeLancamento, que armazena o ano de lançamento do filme.
  private boolean incluidoNoPlano; // Criado um atributo do tipo boolean chamado incluidoNoPlano, que armazena se o filme está incluído no plano ou não.
  private double somaDasAvaliacoes; // Criado um atributo do tipo double chamado somaDasAvaliacoes, que armazena a soma das avaliações do filme.
  private int totalDeAvaliacoes; // Criado um atributo do tipo int chamado totalDeAvaliacoes, que armazena o total de avaliações do filme.
  private int duracaoEmMinutos; // Criado um atributo do tipo int chamado duracaoEmMinutos, que armazena a duração do filme em minutos.


  // Criado um construtor que recebe dois parâmetros, um do tipo String chamado nome e outro do tipo int chamado anoDeLancamento.
  public Titulo(String nome, int anoDeLancamento) {
    this.nome = nome; // Atribui o valor do parâmetro nome ao atributo nome.
    this.anoDeLancamento = anoDeLancamento; // Atribui o valor do parâmetro anoDeLancamento ao atributo anoDeLancamento.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getNome que retorna um valor do tipo String.
  public String getNome() {
    return nome; // Retorna o valor do atributo nome.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getAnoDeLancamento que retorna um valor do tipo int.
  public int getAnoDeLancamento() {
    return anoDeLancamento; // Retorna o valor do atributo anoDeLancamento.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado isIncluidoNoPlano que retorna um valor do tipo boolean.
  public boolean isIncluidoNoPlano() {
    return incluidoNoPlano; // Retorna o valor do atributo incluidoNoPlano.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getDuracaoEmMinutos que retorna um valor do tipo int.
  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos; // Retorna o valor do atributo duracaoEmMinutos.
  }

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getSomaDasAvaliacoes que retorna um valor do tipo double.
  public int getTotalDeAvaliacoes() {
    return totalDeAvaliacoes; // Retorna o valor do atributo totalDeAvaliacoes.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setNome que recebe um parâmetro do tipo String chamado nome.
  public void setNome(String nome) {
    this.nome = nome; // Atribui o valor nome ao atributo nome.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setAnoDeLancamento que recebe um parâmetro do tipo int chamado anoDeLancamento.
  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento; // Atribui o valor anoDeLancamento ao atributo anoDeLancamento.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setIncluidoNoPlano que recebe um parâmetro do tipo boolean chamado incluidoNoPlano.
  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano; // Atribui o valor incluidoNoPlano ao atributo incluidoNoPlano.
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

  // Criado um método chamado avalia que não retorna nada, responsável por avaliar o filme.
  public void avalia(double nota){
    somaDasAvaliacoes += nota; // Adiciona a nota à soma das avaliações.
    totalDeAvaliacoes++; // Incrementa o total de avaliações.
  }

  // Criado um método chamado pegaMedia que retorna um valor do tipo double, responsável por pegar a média das avaliações.
  public double pegaMedia(){
    return somaDasAvaliacoes / totalDeAvaliacoes;  // Retorna a média das avaliações.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // O método toString é responsável por retornar uma representação em String do objeto.
  public String toString() {
    return getNome() + " (" + getAnoDeLancamento() + ")"; // Retorna o nome e o ano de lançamento do filme.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // O método compareTo é obrigatório por causa da interface Comparable e é responsável por comparar o nome do filme atual com o nome do filme passado como parâmetro.
  public int compareTo(Titulo outroTitulo) {
    return getNome().compareTo(outroTitulo.getNome()); // Compara o nome do filme atual com o nome do filme passado como parâmetro.
  }
}
