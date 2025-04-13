package desafios.desafio1.modelos;

public class Musica {
  String title;
  String artist;
  int realeseDate;
  double reviews;
  int totalReviews;

  void getSheet(){
    System.out.println(String.format("""
    Título: %s;
    Artista: %s;
    Ano de lançamento: %d;
    Soma das avaliações: %.2f;
    Total de avaliações: %d;
    """, title, artist, realeseDate, reviews, totalReviews));
  }

  void addReview(double review){
    if(review >= 0){
      reviews += review;
      totalReviews++;
      System.out.println("Avaliação atualizada!");
    }
  }

  double getAverage(){
    return Math.floor(reviews / totalReviews);
  }

}
