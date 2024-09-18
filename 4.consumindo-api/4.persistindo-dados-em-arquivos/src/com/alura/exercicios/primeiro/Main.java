package com.alura.exercicios.primeiro;

import java.io.FileWriter; // Importa a classe FileWriter do pacote java.io, responsável por escrever dados em um arquivo.
import java.io.IOException; // Importa a classe IOException do pacote java.io, responsável por tratar exceções de entrada e saída.

//* Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    FileWriter writer = new FileWriter("arquivo.txt"); // Está sendo criado um novo objeto FileWriter chamado writer que será usado para escrever dados em um arquivo chamado filme.json.

    writer.write("Conteúdo a ser gravado no arquivo."); // Está sendo escrito no arquivo filme.txt a lista de filmes convertida para JSON.

    writer.close(); // Está sendo fechado o objeto writer, fazendo com que os dados sejam escritos no arquivo e colocado na raiz do projeto.
  }

}
