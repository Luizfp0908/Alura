package ScreenMatch.Excecao;

public class ErroDeConversaoDeAnoExpection extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoExpection(String mensagem) {
        this.mensagem = mensagem;

    }

    public String getMensagem() {
        return this.mensagem;
    }
}
