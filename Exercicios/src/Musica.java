public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avalicao;
    int numAvalicao;

    public String fichaTecnica() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", avalicao=" + avalicao +
                ", numAvalicao=" + numAvalicao +
                '}';
    }

    public double avalivarMusica(double nota){
        numAvalicao++;
        return avalicao += nota;

    }

    public void mediaMusica(){
        double media = avalicao / numAvalicao;
        System.out.println("A media é: " + media);
    }
}
