package com.alura.aulas;

public class AtribuindoValores {
    // Ignora o warning de variável não utilizada
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Atalho para o println -> sout
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Atividade Paranormal");

        // Criado uma variável do tipo inteiro chamada anoDeLancamento, que armazena o valor "2022".
        int anoDeLancamento = 2022;
        // Imprime uma string concatenado com o valor da variável anoDeLancamento no console.
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        // Criado uma variável do tipo double(para números quebrados) chamado notaDoFilme, que armazena o valor "8.1"
        double notaDoFilme = 8.1;

        // Criado uma variável do tipo boolean(que só aceita true ou false) chamado incluidoNoPlano que armazena o valor "false".
        boolean incluidoNoPlano = false;
    }
}
