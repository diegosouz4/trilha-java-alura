package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String name;
    private int realeseDate;
    private boolean isAvaliable;
    private double sumReviews;
    private int totalReviews;
    private int duration;

    public void showSheet() {
        System.out.println(String.format("""
                Nome do filme: %s;
                 - Ano de lançamento: %d;
                 - Incluso no plano: %b;
                 - Duração: %d min;
                 - Avaliação atual: %.1f;
                 - Total de avaliações feitas: %d;
                """, name, realeseDate, isAvaliable, duration, sumReviews, totalReviews));
    }

    public void updateScore(double newScore) {
        if (newScore > 0) {
            sumReviews += newScore;
            totalReviews++;
            System.out.println("Avaliação alterada!");
        }
    }

    public double getAverage() {
        return sumReviews / totalReviews;
    }

    public int getTotalReviews() {
        return totalReviews;

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setRealeseDate(int realeseDate){
        this.realeseDate = realeseDate;
    }

    public void setAvaliable(boolean avaliable){
        this.isAvaliable = avaliable;
    }

    public int getDuration() {
        return this.duration;
    }
}
