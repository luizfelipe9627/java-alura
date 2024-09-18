package com.alura.models;

//* Model
/*
  - O modelo é responsável por representar a estrutura de dados da aplicação.
  - Por exemplo, se a aplicação precisa representar um CEP, então é criada uma classe Cep que contém os atributos e métodos necessários para representar um CEP.
*/

// Criado uma classe record chamada Cep, responsável por representar um CEP. Uma classe record é uma classe imutável(ou seja, seus atributos não podem ser modificados após a criação do objeto) que já define os métodos setters, getters, equals, hashCode e toString automaticamente.
public record Cep(String cep) {}
