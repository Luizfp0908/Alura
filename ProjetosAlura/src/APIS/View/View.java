package Apis.View;

import Apis.Controller.Controller;

import java.io.IOException;
import java.util.Scanner;

public class View {
    public void exibirMenu() throws IOException, InterruptedException {
        Controller controller = new Controller();
        int opcao = 0;
        Scanner sc = new Scanner(System.in);


        while (opcao != 6) {
            System.out.println("""
                    \n--- SISTEMA MULTI-API (MVC) ---
                    1-GoogleBooks | 2-CoinGecko | 3-TheMealDB
                    4-Github      | 5-ViaCep    | 6-Sair
                    Escolha:""");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 6) break;

            System.out.print("Digite o termo de busca:");
            String busca = sc.nextLine();

            controller.processarBusca(opcao, busca);
        }
        System.out.println("Sistema encerrado. Parabéns pelo certificado, Luiz! [cite: 8]");
    }
}


