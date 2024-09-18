package com.alura.models;

public class MinhasPreferidas {
  // Está sendo criado um método chamado inclui, que recebe um parâmetro do tipo Audio chamado audio.
  public void inclui(Audio audio) {
    // Se a classificação do áudio for maior ou igual a 8.
    if(audio.getClassificacao() >= 9) {
      System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!"); // Exibe a mensagem seguida do título do áudio e "é considerado sucesso absoluto!".
    }
    // Senão.
    else {
      System.out.println(audio.getTitulo() + " é uma excelente opção!"); // Exibe a mensagem seguida do título do áudio e "é uma excelente opção!".
    }
  }
}
