package components;

import interfaces.IValidadorEstoque;
import java.util.HashMap;
import java.util.Map;

public class ValidadorEstoque implements IValidadorEstoque {
    private Map<String, Integer> estoque;

    public ValidadorEstoque() {
        estoque = new HashMap<>();
        estoque.put("mouse", 10);
        estoque.put("teclado", 5);
        estoque.put("monitor", 8);
        estoque.put("headset", 20);
        estoque.put("gabinete", 35);
    }

    public void exibirCatalogo() {
        System.out.println("=== Catálogo de Produtos Disponíveis ===");
        for (String produto : estoque.keySet()) {
            System.out.println("- " + produto);
        }
    }

    public void atualizarEstoque() {
        System.out.println("\n=== Estoque Atualizado ===");
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }

    @Override
    public boolean validarEstoque(String produto, int quantidade) {
        if (!estoque.containsKey(produto)) {
            System.out.println("Produto não disponível no estoque.");
            return false;
        }

        int qtdDisponivel = estoque.get(produto);
        if (quantidade <= qtdDisponivel) {
            estoque.put(produto, qtdDisponivel - quantidade);
            return true;
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
            return false;
        }
    }
}
