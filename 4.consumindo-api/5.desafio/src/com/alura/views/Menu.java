package com.alura.views;

import java.util.Scanner;

import com.alura.models.Cep;

//* View
/*
    - A View é responsável por exibir a interface gráfica da aplicação e interagir com o usuário.
    - Por exemplo, se a aplicação precisa exibir um menu para o usuário, então a View é responsável por exibir esse menu e obter a opção escolhida pelo usuário.
*/

public class Menu {
    // Criado um método público que retorna uma String, responsável por obter o CEP digitado pelo usuário.
    public String obterCep() {
        Scanner sc = new Scanner(System.in); // Instancia um novo objeto da classe Scanner para ler a entrada do usuário.
        System.out.print("Digite o CEP que deseja buscar: "); // Exibe uma mensagem solicitando ao usuário que digite o CEP.
        Cep cep = new Cep(sc.nextLine()); // Instancia um novo objeto da classe Cep, passando o valor digitado pelo usuário como parâmetro, e atribui à variável cep.
        sc.close(); // Fecha o objeto da classe Scanner.
        return cep.cep(); // Retorna o valor do CEP digitado pelo usuário armazenado no objeto cep.
    }
}
