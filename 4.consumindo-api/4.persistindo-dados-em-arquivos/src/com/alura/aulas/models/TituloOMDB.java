package com.alura.aulas.models;

// Criado um registro chamado TituloOmdb que armazena o título, o ano e a duração do filme que será retornado pela API do OMDB.
public record TituloOMDB(String title, String year, String runtime) {
}
