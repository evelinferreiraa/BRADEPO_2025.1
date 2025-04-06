package components;

import interfaces.ICalculadoraFolhaPagamento;
import interfaces.ICalculadoraHoras;

public class CalculadoraFolhaPagamento implements ICalculadoraFolhaPagamento {
    private ICalculadoraHoras calculadoraHoras;

    @Override
    public void connect(ICalculadoraHoras componente) {
        this.calculadoraHoras = componente;
    }

    @Override
    public void calcularPagamento(String funcionario, double valorHora) {
        int horas = calculadoraHoras.calcularHorasTrabalhadas(funcionario);
        if (horas > 0) {
            double pagamento = horas * valorHora;
            System.out.println("Pagamento de " + funcionario + ": R$ " + pagamento);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
