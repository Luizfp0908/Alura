package Apis;


import Apis.Controller.Excecao.ErroConsultaException;
import Apis.View.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ErroConsultaException {
        View view = new View();
        view.exibirMenu();
    }
}
