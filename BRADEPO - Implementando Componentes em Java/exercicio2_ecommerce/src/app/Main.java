/*Exercício 2: E-commerce
Crie um sistema onde uma função valida o estoque disponível e outra
processa um pedido. A função de processamento depende da
validação do estoque.
Contexto: Plataforma de comércio eletrônico.*/

package app;

import components.ProcessadorPedido;
import components.ValidadorEstoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidadorEstoque validador = new ValidadorEstoque();
        ProcessadorPedido processador = new ProcessadorPedido();

        processador.connect(validador);

        Scanner sc = new Scanner(System.in);
        validador.exibirCatalogo();

        System.out.print("\nDigite o nome do produto: ");
        String produto = sc.nextLine().toLowerCase();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();

        boolean sucesso = processador.processarPedido(produto, quantidade);

        if (sucesso) {
            validador.atualizarEstoque();
        }

        sc.close();
    }
}
