package ScreenMatch.Modelos;

import ScreenMatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private int nome;
    private Serie serie;
    private int totalVisualizacao;

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    @java.lang.Override
    public int getClassificacao() {
        if (totalVisualizacao > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
