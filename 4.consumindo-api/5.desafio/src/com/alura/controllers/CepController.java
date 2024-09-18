package com.alura.controllers;

import com.alura.services.CepService;
import com.alura.utils.FileWriterUtil;
import com.alura.views.Menu;

import java.io.IOException;

//* Controller
/*
    - O Controller é responsável por controlar a execução da aplicação, chamando os services e views necessários para realizar as operações.
    - Por exemplo, se a aplicação precisa buscar um CEP, então o Controller chama o Service responsável por buscar o CEP e a View responsável por exibir o resultado da busca.
*/

// Criado uma classe pública chamada CepController, responsável por controlar a execução da busca do CEP.
public class CepController {
    private Menu menu; // Criado um atributo privado do tipo Menu chamado menu, responsável por exibir o menu de opções para o usuário.
    private CepService cepService; // Criado um atributo privado do tipo CepService chamado cepService, responsável por realizar a busca do CEP através da API.

    // Criado um construtor padrão para a classe CepController, responsável por inicializar os atributos menu e cepService.
    public CepController() {
        this.menu = new Menu(); // Instancia um novo objeto da classe Menu e atribui ao atributo menu.
        this.cepService = new CepService(); // Instancia um novo objeto da classe CepService e atribui ao atributo cepService.
    }

    // Criado um método que não retorna nada e lança exceções do tipo IOException e InterruptedException, responsável por executar a lógica de busca do CEP.
    public void executar() throws IOException {
        String cep = menu.obterCep(); // Chama o método obterCep() da classe Menu e atribui o valor retornado à variável cep.
        String result = cepService.buscarCep(cep); // Chama o método buscarCep() da classe CepService, passando o CEP como parâmetro, e atribui o valor retornado à variável result.

        // Se o valor da variável result for diferente de null, executa o if.
        if (result != null) {
            System.out.println(result); // Exibe o resultado da busca do CEP no console.
            FileWriterUtil.writeFile("dados.json", result); // Chama o método writeFile() da classe FileWriterUtil, passando o nome do arquivo e o conteúdo a ser escrito como parâmetros.
        }
    }
}
