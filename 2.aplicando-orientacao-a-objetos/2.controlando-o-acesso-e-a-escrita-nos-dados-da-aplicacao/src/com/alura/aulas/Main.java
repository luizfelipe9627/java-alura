package com.alura.aulas;

public class Main {
  public static void main(String[] args) {
    Encapsulamento carro = new Encapsulamento(); // Está criando um objeto do tipo Encapsulamento chamado carro.

    // Quando o atributo é private, não é possível acessá-lo diretamente, então é necessário utilizar os métodos getters e setters.
    carro.setModelo("Civic"); // Está chamando o método setModelo, que atribui o valor passado como parâmetro ao atributo modelo do objeto carro.
    carro.getModelo(); // Está chamando o método getModelo, que retorna o valor do atributo modelo do objeto carro.

    //carro.modelo = "Civic"; // Já que o atributo modelo é private, não é possível acessá-lo diretamente.

    carro.ano = 2021; // O atributo ano é protected, então é possível acessá-lo, pois a classe Main está no mesmo pacote que a classe Carro.
    carro.cor = "Preto"; // O atributo cor é default, então é possível acessá-lo, pois a classe Main está no mesmo pacote que a classe Carro.
    carro.marca = "Honda"; // Como o atributo marca é public, é possível acessá-lo de qualquer lugar.

    carro.fichaTecnica(); // Está chamando o método fichaTecnica do objeto carro.
  }
}
