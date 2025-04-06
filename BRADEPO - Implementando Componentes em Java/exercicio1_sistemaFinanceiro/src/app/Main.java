/*Exercício 1: Sistema Financeiro
Implemente um sistema onde uma função calcula juros compostos e
outra função gera um plano de amortização de empréstimo. A função
de amortização depende do cálculo de juros.
Contexto: Sistema bancário para simulação de empréstimos.*/

package app;

import java.util.Scanner;

import components.CalculadoraJuros;
import components.GeradorPlanoAmortizacao;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo (principal): ");
        double principal = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (ex: 0.02 para 2%): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite o número de meses (períodos): ");
        int periodos = sc.nextInt();

        CalculadoraJuros juros = new CalculadoraJuros(principal, taxa, periodos);
        GeradorPlanoAmortizacao plano = new GeradorPlanoAmortizacao(periodos);

        juros.connect(plano);

        sc.close();
    }
}
