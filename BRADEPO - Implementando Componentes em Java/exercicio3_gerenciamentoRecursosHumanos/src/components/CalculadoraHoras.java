package components;

import interfaces.ICalculadoraHoras;
import java.util.HashMap;
import java.util.Map;

public class CalculadoraHoras implements ICalculadoraHoras {
    private Map<String, Integer> bancoHoras;

    public CalculadoraHoras() {
        bancoHoras = new HashMap<>();
        bancoHoras.put("evelin", 160);
        bancoHoras.put("ana", 140);
        bancoHoras.put("soraya", 175);
        bancoHoras.put("giovanna", 130);
    }

    @Override
    public int calcularHorasTrabalhadas(String funcionario) {
        return bancoHoras.getOrDefault(funcionario.toLowerCase(), 0);
    }
}
