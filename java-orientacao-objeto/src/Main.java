import br.com.alura.minhasMusicas.MinhasPreferidas;
import br.com.alura.minhasMusicas.Musica;
import br.com.alura.minhasMusicas.Podcast;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.calculos.FiltroRecomendacao;
import desafio.gpt.classes.*;
import desafios.desafio2.modelos.ModeloCarro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Movie myMovie = new Movie();
        myMovie.setName("Poderoso chefão");
        myMovie.setDuration(180);
        myMovie.setRealeseDate(1970);
        myMovie.setAvaliable(false);
        myMovie.updateScore(5.5);
        myMovie.updateScore(8.5);
        myMovie.updateScore(10);
        myMovie.updateScore(2.5);
        myMovie.updateScore(3);
        myMovie.showSheet();
        System.out.println(myMovie.getAverage());

        Serie mySerie = new Serie();

        mySerie.setName("A lenda de aang");
        mySerie.setRealeseDate(2002);
        mySerie.setAvaliable(true);
        mySerie.setEpBySession(22);
        mySerie.setSessions(3);
        mySerie.setMinutesByEp(10);

        System.out.println("Duracao da serie em minutos: " + mySerie.getDuration());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(mySerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(myMovie);

        Episodio episodio = new Episodio();

        episodio.setNumber(1);
        episodio.setSerie(mySerie);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);*/

        Musica musica = new Musica();
        musica.setTitulo("Forever");
        musica.setArtista("Queen");
        musica.setGenero("rock");

        for(int i = 0; i < 1000; i++){
            musica.reproduz();
        }

        for(int i = 0; i < 50; i++){
            musica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("ola mundo");
        meuPodcast.setHost("Anna Doe");

        for(int i = 0; i < 5000; i++){
            meuPodcast.reproduz();
        }

        for(int i = 0; i < 1050; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(musica);
        preferidas.inclui(meuPodcast);
    }
}
