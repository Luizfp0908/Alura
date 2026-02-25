package ScreenMatch.Main;

import ScreenMatch.Modelos.Episodio;
import ScreenMatch.Modelos.Filme;
import ScreenMatch.Modelos.Serie;
import ScreenMatch.calculos.CalculadoraDeTempo;
import ScreenMatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);

        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie("Lost",2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsPorTemporada(10);
        lost.setMinutosPorTemporada(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(meuFilme);
        calculadora.incluir(outroFilme);
        calculadora.incluir(lost);
        System.out.println(calculadora.getTotalTempo());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtro(episodio);

        Filme filmeLuiz = new Filme("Homen de ferro",2013); 
        filmeLuiz.setDuracaoEmMinutos(150);
        filmeLuiz.avalia(10);

        ArrayList <Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeLuiz);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).toString());

    }
}