package interfaces;

public interface IProcessadorPedido {
    public void connect(IValidadorEstoque componente);
    public boolean processarPedido(String produto, int quantidade); 
}
