package components;

import interfaces.IValidadorEstoque;
import interfaces.IProcessadorPedido;

public class ProcessadorPedido implements IProcessadorPedido {
    private IValidadorEstoque validador;

    @Override
    public void connect(IValidadorEstoque componente) {
        this.validador = componente;
    }
    
    @Override
    public boolean processarPedido(String produto, int quantidade) {
        if (validador != null && validador.validarEstoque(produto, quantidade)) {
            System.out.println("Pedido processado com sucesso: " + quantidade + "x " + produto);
            return true;
        } else {
            System.out.println("Não foi possível processar o pedido.");
            return false;
        }
    }
    
}
