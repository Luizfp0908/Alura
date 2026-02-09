package ScreenMatch.calculos;

import ScreenMatch.Modelos.Titulo;

public class FiltroRecomendacao {
    private String recomendacao;


    public void filtro(Classificavel c) {
        if (c.getClassificacao() >= 4) {
            System.out.println("Esta entre os preferidos do momento !!!");
        } else if (c.getClassificacao() >= 2) {
            System.out.println("Muito bem classficado !!!");

        } else {
            System.out.println("coloque na sua lista para assistir depois !!!");
        }


    }
}
