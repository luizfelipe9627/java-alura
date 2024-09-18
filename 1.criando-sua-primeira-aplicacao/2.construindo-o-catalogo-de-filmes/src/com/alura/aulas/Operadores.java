package com.alura.aulas;

public class Operadores {
    @SuppressWarnings("unused") 
    public static void main(String[] args) {
        //* > Operadores de atribuição
        /* 
            Os operadores de atribuição são usados para atribuir um valor a uma variável. O operador de atribuição básico é o "=" (sinal de igual). 
        */
  
        int valor =  5; // Criado uma variável do tipo inteiro chamada valor que é atribuida pelo valor 5.

        // Existem também operadores de atribuição combinados, que são uma forma abreviada de atribuição. Por exemplo, o operador "+=" adiciona um valor à variável existente. 
        valor += 5; // Está adicionando 5 ao valor da variável valor, fazendo com que o valor seja 10.

        //* > Operadores aritméticos
        /* 
            Os operadores aritméticos são usados para realizar operações matemáticas básicas. Eles são os seguintes:
            "+" (adição)
            "-" (subtração)
            "*" (multiplicação)
            "/" (divisão)
            "%" (resto da divisão)
        */

        int a = 10 + 5; // Está somando 10 com 5, resultando em 15 e atribuindo a variável a.
        int b = 10 - 5; // Está subtraindo 5 de 10, resultando em 5 e atribuindo a variável b.
        int c = 10 * 5; // Está multiplicando 10 por 5, resultando em 50 e atribuindo a variável c.
        int d = 10 / 5; // Está dividindo 10 por 5, resultando em 2 e atribuindo a variável d.
        int e = 10 % 3; // Está dividindo 10 por 3 e pegando o resto da divisão, resultando em 1 e atribuindo a variável e.

        //* > Operadores de comparação/relacionais
        /*
            Os operadores relacionais são usados para comparar valores. Eles retornam um valor booleano (verdadeiro ou falso). Trabalharemos melhor com eles quando estivermos na aula de condicionais, onde vamos modificar o fluxo da aplicação dada alguma condição. São eles:

            "==" (igual a)
            "!=" (diferente de)
            ">" (maior que)
            ">=" (maior ou igual a)
            "<" (menor que)
            "<=" (menor ou igual a)
        */

        int f = 10; // Criado uma variável do tipo inteiro chamada f que é atribuida pelo valor 10.
        int g = 5; // Criado uma variável do tipo inteiro chamada g que é atribuida pelo valor 5.
        int h = 10; // Criado uma variável do tipo inteiro chamada h que é atribuida pelo valor 10.

        boolean igual = f == g; // Está comparando se f é igual a g, resultando em false pois 10 não é igual a 5.
        boolean diferente = f != g; // Está comparando se f é diferente de g, resultando em true pois 10 é diferente de 5.
        boolean maior = f > g; // Está comparando se f é maior que g, resultando em true pois 10 é maior que 5.
        boolean maiorOuIgual = f >= h; // Está comparando se f é maior ou igual a h, resultando em true pois 10 é igual a 10.
        boolean menor = f < g; // Está comparando se f é menor que g, resultando em false pois 10 não é menor que 5.
        boolean menorOuIgual = f <= h; // Está comparando se f é menor ou igual a h, resultando em true pois 10 é igual a 10.

        //* > Operadores lógicos
        /*
            Os operadores lógicos são usados para combinar expressões condicionais. Eles retornam um valor booleano (verdadeiro ou falso). São eles:

            "&&" (E/AND lógico)
            "||" (OU/OR lógico)
            "!" (NÃO/NOT lógico)
        */

        boolean i = true; // Criado uma variável do tipo boolean chamada i que é atribuida pelo valor true.
        boolean j = false; // Criado uma variável do tipo boolean chamada j que é atribuida pelo valor false.

        // Está verificando se j é verdadeiro E i é verdadeiro, como j é falso, o resultado é falso.
        if (j && i) { 
            System.out.println("j é verdadeiro E i é verdadeiro");
        } else {
            System.out.println("j é falso OU i é falso");
        }

        // Está verificando se j é verdadeiro OU i é verdadeiro, como i é verdadeiro, o resultado é verdadeiro.
        if (j || i) {
            System.out.println("j é verdadeiro OU i é verdadeiro");
        } else {
            System.out.println("j é falso E i é falso");
        }

        // Está verificando se i é verdadeiro, como i é verdadeiro, o resultado é falso.
        if (!i) {
            System.out.println("i é verdadeiro");
        } else {
            System.out.println("i é falso");
        }

        //* > Operadores de incremento e decremento
        /*
            Os operadores de incremento e decremento são usados para aumentar ou diminuir o valor de uma variável em 1. São eles:

            "++" (incremento)
            "--" (decremento)
         */

        int k = 5; // Criado uma variável do tipo inteiro chamada k que é atribuida pelo valor 5.
        k++; // Está incrementando 1 ao valor da variável k, fazendo com que o valor seja 6.

        int l = 5; // Criado uma variável do tipo inteiro chamada l que é atribuida pelo valor 5.
        l--; // Está decrementando 1 ao valor da variável l, fazendo com que o valor seja 4.
    }
}
