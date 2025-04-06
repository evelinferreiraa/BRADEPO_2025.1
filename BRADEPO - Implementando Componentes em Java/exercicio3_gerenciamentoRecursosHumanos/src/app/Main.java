/*Exercício 3: Gerenciamento de Recursos Humanos
Desenvolva um sistema onde uma função calcula horas trabalhadas e
outra calcula a folha de pagamento. A função de cálculo de pagamento
depende da contabilização das horas.
Contexto: Sistema de RH para empresas.*/

package app;

import components.CalculadoraFolhaPagamento;
import components.CalculadoraHoras;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculadoraHoras calculadoraHoras = new CalculadoraHoras();
        CalculadoraFolhaPagamento folha = new CalculadoraFolhaPagamento();

        folha.connect(calculadoraHoras);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        folha.calcularPagamento(nome, valorHora);
        sc.close();
    }
}
