package com.alura;

import java.io.IOException;

import com.alura.controllers.CepController;

public class Main {
    public static void main(String[] args) throws IOException {
        CepController searchCep = new CepController();
        searchCep.executar();
    }
}