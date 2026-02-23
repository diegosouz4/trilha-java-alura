package br.com.alura.minhasMusicas;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " e considerado sucesso absoluto" + " e prefirido por todos!");
        }else {
            System.out.println(audio.getTitulo() + " tambem e um dos que todo mundo esta curtindo");
        }
    }
}
