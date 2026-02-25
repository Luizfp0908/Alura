package ScreenMatch.Main;

import ScreenMatch.Modelos.Filme;
import ScreenMatch.Modelos.Serie;
import ScreenMatch.Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainLIstas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(4);
        Filme filmeLuiz = new Filme("Homen de ferro", 2013);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeLuiz);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo t : lista) {
            System.out.println(t);
            if (t instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificao" + filme.getClassificacao());
            }
        }

        Collections.sort(lista);
        System.out.println("Ordenado pelo Nome.");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenado pelo anoDeLancamento.");
        System.out.println(lista);

    }
}
