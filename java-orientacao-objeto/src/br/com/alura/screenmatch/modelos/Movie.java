package br.com.alura.screenmatch.modelos;

public class Movie {
  public String name;
  public int realeseDate;
  public boolean isAvaliable;
  private double sumReviews;
  private int totalReviews;
  public int duration;

  public void showSheet(){
    System.out.println(String.format("""
    Nome do filme: %s;
     - Ano de lançamento: %d;
     - Incluso no plano: %b;
     - Duração: %d min;
     - Avaliação atual: %.1f;
     - Total de avaliações feitas: %d;
    """, name, realeseDate, isAvaliable, duration, sumReviews, totalReviews));
  }

  public void updateScore(double newScore){
    if(newScore > 0) {
      sumReviews += newScore;
      totalReviews++;
      System.out.println("Avaliação alterada!");
    }
  }

  public double getAverage(){
    return sumReviews / totalReviews;
  }

  public int getTotalReviews(){
    return totalReviews;
  }
}
