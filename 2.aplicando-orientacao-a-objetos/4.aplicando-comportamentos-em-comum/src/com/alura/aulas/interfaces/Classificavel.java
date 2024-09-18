package com.alura.aulas.interfaces;

//* > Interface
/*
  - Interface é um recurso que permite a definição de métodos que devem ser implementados por classes que a utilizam.
  - Por exemplo, se temos uma interface chamada Classificavel, podemos definir que todas as classes que a utilizam devem implementar um método chamado getClassificacao, obrigatoriamente.
*/

// Criado uma interface chamada Classificavel.
public interface Classificavel {
  int getClassificacao(); // Está definindo um método chamado getClassificacao que retorna um inteiro.
}
