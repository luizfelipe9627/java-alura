package com.alura.aulas.model;

//* Record
/*
  - A palavra-chave record é usada para criar uma classe de dados imutável, ou seja, uma classe que não pode ser alterada após a sua criação.
*/

// Criado um registro chamado TituloOmdb que armazena o título, o ano e a duração do filme que será retornado pela API do OMDB.
public record TituloOMDB(String title, String year, String runtime) {
}
