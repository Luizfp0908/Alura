package ScreenMatch.Modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica() {

        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        System.out.println("Duração em minutos:" + duracaoEmMinutos);
        System.out.printf("Avaliação: ", pegaMedia());
        if(incluidoNoPlano){
            System.out.println("Incluído no plano.");
        } else {
            System.out.println("Não incluído no plano.");
        }

    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
