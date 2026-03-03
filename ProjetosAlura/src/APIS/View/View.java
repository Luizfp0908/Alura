package Apis.View;

import Apis.Controller.Enderecos.*;
import Apis.Controller.Excecao.ErroConsultaException;
import Apis.Controller.Request.Request;
import Apis.Model.Model;

import java.io.IOException;
import java.util.Scanner;

public class View {
    public void exibirMenu() throws IOException, InterruptedException {
        int resposta = 0;
        Scanner sc = new Scanner(System.in);
        Model model = new Model();


        while (resposta != 4) {
            model.exibirMenu();

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
                    } catch (ErroConsultaException e) {
                        System.out.println(e.getMessage());
                    }

                case 2:
                    try {
                        r = new CoinGecko(busca);
                        r.requesicao();
                        break;
                    } catch (ErroConsultaException e) {
                        System.out.println(e.getMessage());
                    }

                case 3:
                    try {
                        r = new TheMealDB(busca);
                        r.requesicao();
                        break;
                    } catch (ErroConsultaException e) {
                        System.out.println(e.getMessage());
                    }

                case 4:
                    try {
                        r = new Github(busca);
                        r.requesicao();
                        break;

                    } catch (ErroConsultaException e) {
                        System.out.println(e.getMessage());
                    }

                case 5:
                    try {
                        r = new ViaCep(busca);
                        r.requesicao();
                        break;
                    } catch (ErroConsultaException | IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

            }

        }
        model.sairMenu();
    }
}


