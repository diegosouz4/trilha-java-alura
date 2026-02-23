package br.com.alura.screenmatch.modelos.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo title) {
        System.out.println("Adicionando duracao em minutos de " + title);
        tempoTotal += title.getDuration();
    }
}
