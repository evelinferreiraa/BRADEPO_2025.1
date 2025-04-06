package interfaces;

public interface ICalculadoraFolhaPagamento {
    public void connect(ICalculadoraHoras componente);
    public void calcularPagamento(String funcionario, double valorHora);
}
