package components;

import interfaces.ICalculadoraJuros;
import interfaces.IGeradorPlanoAmortizacao;

public class CalculadoraJuros implements ICalculadoraJuros {
    private double principal;
    private double taxa;
    private int periodos;

    public CalculadoraJuros(double principal, double taxa, int periodos) {
        this.principal = principal;
        this.taxa = taxa;
        this.periodos = periodos;
    }

    public double calcularMontante() {
        double fator = 1.0;
        for (int i = 0; i < periodos; i++) {
            fator *= (1 + taxa);
        }
        return principal * fator;
    }

    @Override
    public void connect(IGeradorPlanoAmortizacao componente) {
        componente.update(calcularMontante());
    }
}
