package Apis.Controller;

import Apis.Model.Enderecos.*;
import Apis.Excecao.ErroConsultaException;
import Apis.Model.Request.Request;

import java.io.IOException;

public class Controller {

    public void processarBusca(int opcao, String busca) throws IOException, InterruptedException {
        Request r = null;

        switch (opcao) {
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
}



