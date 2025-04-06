package components;

import interfaces.IGeradorPlanoAmortizacao;

public class GeradorPlanoAmortizacao implements IGeradorPlanoAmortizacao {
    private int periodos;

    public GeradorPlanoAmortizacao(int periodos) {
        this.periodos = periodos;
    }

    @Override
    public void update(double montante) {
        System.out.println("\n--- Plano de Pagamento ---");
        System.out.printf("Valor total: R$ %.2f%n", montante);
        System.out.printf("%d parcelas de: R$ %.2f%n", periodos, montante / periodos);
    }
}
