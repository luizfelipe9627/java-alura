package com.alura.aulas.models;

import com.alura.aulas.interfaces.Classificavel;

public class Recomendacao {
  // Criado um método que não retorna nada chamado filtra que recebe como parâmetro a interface Classificavel, que é uma interface que contém o método getClassificacao.
  public void filtra(Classificavel classificavel) {
    // Se a classificação for maior ou igual a 4, executa o if.
    if (classificavel.getClassificacao() >= 4) {
      System.out.println("Está entre os preferidos do momento!"); // Imprime na tela a mensagem "Está entre os preferidos do momento!".
    }
    // Se a classificação for maior ou igual a 2, executa o else if.
    else if (classificavel.getClassificacao() >= 2) {
      System.out.println("Muito bem avaliado no momento!"); // Imprime na tela a mensagem "Muito bem avaliado no momento!".
    }
    // Se nenhuma das condições acima for atendida, executa o else.
    else {
      System.out.println("Coloque na lista para assistir depois!"); // Imprime na tela a mensagem "Coloque na lista para assistir depois!".
    }
  }
}
