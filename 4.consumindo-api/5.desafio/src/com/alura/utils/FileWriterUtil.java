package com.alura.utils;

import java.io.FileWriter;
import java.io.IOException;

//* Util
/*
    - A classe util é responsável por agrupar métodos utilitários que podem ser utilizados em diferentes partes da aplicação.
    - Por exemplo, se a aplicação precisa escrever um arquivo, então é criado um método writeFile na classe FileWriterUtil que pode ser chamado em diferentes partes da aplicação.
*/

public class FileWriterUtil {
    // Criado um método writeFile que recebe o nome do arquivo e o conteúdo que será escrito no arquivo.
    public static void writeFile(String fileName, String content) throws IOException {
        FileWriter fw = new FileWriter(fileName); // Está sendo criado um novo objeto FileWriter chamado fw que será usado para escrever no arquivo.
        fw.write(content); // Está sendo escrito o conteúdo no arquivo.
        fw.close(); // Está sendo fechado o arquivo.
    }
}
