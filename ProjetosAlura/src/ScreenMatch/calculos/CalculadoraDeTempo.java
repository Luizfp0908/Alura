package ScreenMatch.calculos;

import ScreenMatch.Modelos.Titulo;

public class CalculadoraDeTempo {
    private int totalTempo;

    public int getTotalTempo() {
        return totalTempo;
    }

    public void incluir(Titulo t){
        totalTempo += t.getDuracaoEmMinutos();
    }
}
