package APIS;


import APIS.Excecao.ErroConsultaException;
import APIS.Enderecos.*;
import APIS.Request.Request;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ErroConsultaException {
        int resposta = 0;
        Scanner sc = new Scanner(System.in);


        while (resposta != 4) {

            System.out.println("""
                    Escolha qual API usar:
                    1-GoogleBooks
                    2-CoinGecko
                    3-TheMealDB
                    4-Github
                    5-ViaCep
                    6-sair
                    
                    """);

            resposta = sc.nextInt();
            sc.nextLine();

            if (resposta == 6) break;


            System.out.println("Digite o termo de busca:");
            String busca = sc.nextLine();


            Request r;

            switch (resposta) {
                case 1:
                    try {
                    r = new GoogleBooks(busca);
                    r.requesicao();
                    break;
                    }catch (ErroConsultaException e){
                        System.out.println(e);
                    }

                case 2:
                    try {
                        r = new CoinGecko(busca);
                        r.requesicao();
                        break;
                    } catch (ErroConsultaException e){
                        System.out.println(e);
                    }

                case 3:
                    try {
                        r = new TheMealDB(busca);
                        r.requesicao();
                        break;
                    } catch (ErroConsultaException e) {
                        System.out.println(e);
                    }

                case 4:
                    try {
                        r = new Github(busca);
                        r.requesicao();
                        break;

                    } catch (ErroConsultaException e) {
                        System.out.println(e);
                    }

                case 5:
                    try {
                        r = new ViaCep(busca);
                        r.requesicao();
                        break;
                    } catch (ErroConsultaException | IllegalArgumentException e) {
                        System.out.println(e);
                    }

            }

        }
        System.out.println("Sistema encerrado. Obrigado!");
    }
}
