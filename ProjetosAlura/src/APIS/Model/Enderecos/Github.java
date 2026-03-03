package Apis.Model.Enderecos;

import Apis.Excecao.ErroConsultaException;
import Apis.Model.Request.Request;

public class Github extends Request {


    public Github(String busca) throws Apis.Excecao.ErroConsultaException {
        this.setEndereco("https://api.github.com/users/");
        this.setBusca(busca);

        if (busca == null){
            throw new  ErroConsultaException ("Nome nao encontrado");
        }
    }
}
