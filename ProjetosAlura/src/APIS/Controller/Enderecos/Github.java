package Apis.Controller.Enderecos;

import Apis.Controller.Excecao.ErroConsultaException;
import Apis.Controller.Request.Request;

public class Github extends Request {


    public Github(String busca) throws Apis.Controller.Excecao.ErroConsultaException {
        this.setEndereco("https://api.github.com/users/");
        this.setBusca(busca);

        if (busca == null){
            throw new  ErroConsultaException ("Nome nao encontrado");
        }
    }
}
