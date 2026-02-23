package br.com.alura.screenmatch.modelos.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        int stars = classificavel.getClassificacao();

        if (stars >= 4) {
            System.out.println("Esta entre os preferidos do momento");
        } else if (stars >= 2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
