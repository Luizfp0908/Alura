package APIS.Enderecos;

import APIS.Excecao.ErroConsultaException;
import APIS.Request.Request;

public class Github extends Request {


    public Github(String busca) throws APIS.Excecao.ErroConsultaException {
        this.setEndereco("https://api.github.com/users/");
        this.setBusca(busca);

        if (busca == null){
            throw new  ErroConsultaException ("Nome nao encontrado");
        }
    }
}
