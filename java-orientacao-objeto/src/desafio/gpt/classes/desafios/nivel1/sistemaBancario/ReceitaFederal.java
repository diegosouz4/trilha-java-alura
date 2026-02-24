package desafio.gpt.classes.desafios.nivel1.sistemaBancario;

import java.util.ArrayList;

public class ReceitaFederal {
    ArrayList<Tributavel> contasTributaveis = new ArrayList<Tributavel>();

    public void incluiConta(Tributavel conta) {
        contasTributaveis.add(conta);
    }

    public double getTotalImposto() {
        if (contasTributaveis.isEmpty()) return 0;
        return contasTributaveis.stream().mapToDouble(Tributavel::calcularImposto).sum();
    }
}
