package com.alura.exercicios;

import com.alura.exercicios.primeiro.ModeloCarro;
import com.alura.exercicios.quarto.GeradorPrimo;
import com.alura.exercicios.quarto.VerificadorPrimo;
import com.alura.exercicios.segundo.Cachorro;
import com.alura.exercicios.segundo.Gato;
import com.alura.exercicios.terceiro.ContaCorrente;

public class Main {
  public static void main(String[] args) {
    ModeloCarro carro = new ModeloCarro(); // Criado um objeto da classe ModeloCarro, chamado carro que recebe todos os métodos e atributos da classe ModeloCarro e da classe extendida Carro.

    carro.setModelo("Fusca"); // Atribui o valor "Fusca" ao atributo modelo do objeto carro.
    carro.definirPrecos(10000, 8000, 6000); // Atribui os valores 10000, 8000 e 6000 aos atributos precoAno1, precoAno2 e precoAno3 do objeto carro.
    carro.fichaTecnica(); // Chama o método fichaTecnica do objeto carro.

    System.out.println("--------------------------------------------------");

    Gato gato = new Gato(); // Criado um objeto da classe Gato, chamado gato que recebe todos os métodos e atributos da classe Gato e da classe extendida Animal.
    gato.emitirSom(); // Chama o método emitirSom do objeto gato.
    gato.arranharMoveis(); // Chama o método arranharMoveis do objeto gato.

    Cachorro cachorro = new Cachorro(); // Criado um objeto da classe Cachorro, chamado cachorro que recebe todos os métodos e atributos da classe Cachorro e da classe extendida Animal.
    cachorro.emitirSom(); // Chama o método emitirSom do objeto cachorro.
    cachorro.abanarRabo(); // Chama o método abanarRabo do objeto cachorro;

    System.out.println("--------------------------------------------------");

    ContaCorrente conta = new ContaCorrente(); // Criado um objeto da classe ContaCorrente, chamado conta que recebe todos os métodos e atributos da classe ContaCorrente e da classe extendida ContaBancaria.

    conta.depositar(100); // Chama o método depositar do objeto conta passando o valor 100 como argumento para depositar na conta bancária.
    conta.sacar(10); // Chama o método sacar do objeto conta passando o valor 10 como argumento para sacar da conta bancária.
    conta.tarifaMensal(); // Chama o método tarifaMensal do objeto conta que cobra uma tarifa mensal de 20 reais.
    conta.consultarSaldo(); // Chama o método consultarSaldo do objeto conta que exibe o saldo da conta bancária.

    System.out.println("--------------------------------------------------");

    VerificadorPrimo verificador = new VerificadorPrimo(); // Criado um objeto da classe VerificadorPrimo, chamado verificador que recebe todos os métodos e atributos da classe VerificadorPrimo e da classe extendida NumerosPrimos.

    verificador.verificarSeEhPrimo(7); // Chama o método verificarSeEhPrimo do objeto verificador passando o número 7 como argumento.

    GeradorPrimo gerador = new GeradorPrimo(); // Criado um objeto da classe GeradorPrime, chamado gerador que recebe todos os métodos e atributos da classe GeradorPrime e da classe extendida NumerosPrimos.

    gerador.gerarPrimos(10); // Chama o método gerarPrimos do objeto gerador passando o número 10 como argumento.
  }
}
