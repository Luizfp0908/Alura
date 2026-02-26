package APIS;

import APIS.enderecos.CoinGecko;
import APIS.enderecos.GoogleBooks;
import APIS.enderecos.TheMealDB;
import APIS.request.Request;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int resposta = 0;
        Scanner sc = new Scanner(System.in);


        while (resposta != 4) {

            System.out.println("""
                    Escolha qual API usar:
                    1-GoogleBooks
                    2-CoinGecko
                    3-TheMealDB
                    4-sair
                    """);

            resposta = sc.nextInt();
            sc.nextLine();

            if (resposta == 4) break;


            System.out.println("Digite o termo de busca:");
            String busca = sc.nextLine();


            Request r;

            switch (resposta) {
                case 1:
                    r = new GoogleBooks(busca);
                    r.requesicao();
                    break;
                case 2:
                    r = new CoinGecko(busca);
                    r.requesicao();
                    break;
                case 3:
                    r = new TheMealDB(busca);
                    r.requesicao();
                    break;
            }

        }
        System.out.println("Sistema encerrado. Obrigado!");
    }
}
