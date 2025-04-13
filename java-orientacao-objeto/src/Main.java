import br.com.alura.screenmatch.modelos.Movie;
import desafio.gpt.classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Movie myMovie = new Movie();
/*
    myMovie.name = "Poderoso chefão";
    myMovie.duration = 180;
    myMovie.realeseDate = 1970;
    myMovie.isAvaliable = false;
    myMovie.updateScore(5.5);
    myMovie.updateScore(8.5);
    myMovie.updateScore(10);
    myMovie.updateScore(2.5);
    myMovie.updateScore(3);
    myMovie.showSheet();
    System.out.println(myMovie.getAverage());*/

    Funcionario anna = new Funcionario("Anna Doe", "Analista Jr.", 2500);
    anna.exibirInformacoes();
    anna.promover("Analista Pleno", 10000);
    anna.exibirInformacoes();

  }
}
