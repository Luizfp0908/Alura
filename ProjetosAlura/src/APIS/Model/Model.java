package Apis.Model;

public class Model {
    public void exibirMenu(){
        System.out.println("""
                    ---------------------------
                    | Escolha qual API usar:  |
                    | 1-GoogleBooks           |
                    | 2-CoinGecko             |
                    | 3-TheMealDB             |
                    | 4-Github                |
                    | 5-ViaCep                |
                    | 6-sair                  |
                    ---------------------------
                    """);
        System.out.printf("Qual a sua escolha(Em numeros inteiros): ");
    }

    public void sairMenu(){
        System.out.println("""
                --------------------------------
                | Sistema encerrado. Obrigado! |
                --------------------------------
                """);
    }

}
