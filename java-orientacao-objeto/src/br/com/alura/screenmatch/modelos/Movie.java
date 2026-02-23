package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String director;

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        if (!director.isBlank()) {
            this.director = director;
        }
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
